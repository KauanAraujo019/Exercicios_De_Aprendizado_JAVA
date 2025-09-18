public class Peixe extends Animal{

    @Override
    public void alimentar() {
        System.out.println("comendo coisas na agua...");
    }

    @Override
    public void locomover() {
        System.out.println("nadando...");
    }

    @Override
    public void somDoAnimal() {
        System.out.println("null");
    }
    
    public void soltarBolhas(){
        System.out.println("soltando bolhas...");
    }
}
