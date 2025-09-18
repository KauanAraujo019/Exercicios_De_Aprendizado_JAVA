public class Polimorfismo01 {
    public static void main(String[] args) throws Exception {
        Mamifero mamifero = new Mamifero();
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.somDoAnimal();

        Peixe peixe = new Peixe();
        peixe.alimentar();
        peixe.locomover();
        peixe.somDoAnimal();

        Cachorro cachorro = new Cachorro();
        cachorro.alimentar();
        cachorro.locomover();
        cachorro.somDoAnimal();
    }

}
