import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    
    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }
        else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("luta nao pode continuar! ");
        }
    }


    public void lutar(Lutador l1, Lutador l2){
        if (this.aprovada == true){
            desafiante.apresentar();
            System.out.println("----------------");
            desafiado.apresentar();
            System.out.println("------------------");
            Random random = new Random();
            int vencedor = random.nextInt();
            switch (vencedor) {
                case 0:
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    System.out.println("EMPATE! ");
                    break;

                case 1:
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println(l1.getNome()+" VENCEU!");
                    break;

                case 2:
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    System.out.println(l2.getNome()+" VENCEU! ");
                default:
                    break;
            }

        }
        else{
            System.out.println("A LUTA NAO FOI APROVADA! ");
        }
    }

}