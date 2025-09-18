public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    private void setVolume(int vol){
        this.volume = vol;
    }
    private int getVolume(){
        return volume;
    }


    private void setLigado(boolean lig){
        this.ligado = lig;
    }
    private boolean getLigado(){
        return ligado;
    }


    private void setTocando(boolean toc){
        this.tocando = toc;
    }
    private boolean getTocando(){
        return tocando;
    }

    //metodos abstratos Controlador
    @Override
    public void ligar() {
       setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
        setTocando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("está ligado? "+this.getLigado());
        System.out.println("está tocando? "+this.getTocando());
        if (getLigado()){
            System.out.println("volume "+this.getVolume());
            for (int i = 0; i<=this.getVolume(); i+=10){
                System.out.print("|");
            }
        }
        
        
      
    }

    @Override
    public void fecharMenu() {
        System.out.println("");
        System.out.println("Fechando menu...");
    }

    @Override
    public void aumentarVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 10);
            if(this.getVolume() >101){
                setVolume(100);
            }
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0){
            this.setVolume(0);
            setTocando(false);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0){
            setVolume(50);
            setTocando(true);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()){
            this.setTocando(false);
        }
    }


    

}
