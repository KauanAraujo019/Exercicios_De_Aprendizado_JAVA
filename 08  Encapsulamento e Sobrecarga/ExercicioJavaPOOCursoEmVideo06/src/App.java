public class App {
    public static void main(String[] args) throws Exception {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("KAUAN", "BRASIL", 19, 1.87f, 87.5f, 9, 2, 2);
        lutador[1] = new Lutador("CARLOS", "BOLIVIA", 24, 1.85f, 63, 7, 0, 4);
        lutador[2] = new Lutador("MARIANO", "INGLATERRA", 46, 1.87f, 96, 12, 3, 1);
        lutador[3] = new Lutador("RENATO", "ESTADOS UNIDOS", 14, 1.62f, 82, 0, 8, 1);
        lutador[4] = new Lutador("BRUNO", "SUIÇA", 19, 1.84f, 76, 7, 5, 3);
        lutador[5] = new Lutador("PAULO", "ITALIA", 31, 2.41f, 140f, 1, 15, 7);
        
        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[3]);
        luta.lutar(lutador[0], lutador[3]);
        lutador[0].apresentar();
        lutador[3].apresentar();

    }     
}
