public class AppControleRemoto {
    public static void main(String args[]) throws Exception{
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.play();
        controle.desligar();
        controle.ligar();
        controle.ligarMudo();
        controle.desligarMudo();
        controle.diminuirVolume();
        controle.diminuirVolume();
        controle.diminuirVolume();
        controle.pause();
        controle.desligar();
        controle.abrirMenu();
        controle.fecharMenu();
        
    }
}
