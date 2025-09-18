public class Adolecente extends Pessoa{
    private String nomeEscola;
    private boolean castigo;
    private float mesada;

    public void dormirAteTarde(){
        System.out.println("já se passaram da meia noite! ");
    }

    public void castigo(){
        if (this.castigo == true){
            System.out.println("VOCE ESTA DE CASTIGO! \n");
        }
        else{
            System.out.println("nao esta de castigo \n");
        }
    }

    /**
     * @return String return the nomeEscola
     */
    public String getNomeEscola() {
        return nomeEscola;
    }

    /**
     * @param nomeEscola the nomeEscola to set
     */
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    /**
     * @return boolean return the castigo
     */
    public boolean getCastigo() {
        return castigo;
    }

    /**
     * @param castigo the castigo to set
     */
    public void setCastigo(boolean castigo) {
        this.castigo = castigo;
    }

    /**
     * @return float return the mesada
     */
    public float getMesada() {
        return mesada;
    }

    /**
     * @param mesada the mesada to set
     */
    public void setMesada(float mesada) {
        this.mesada = mesada;
    }

}