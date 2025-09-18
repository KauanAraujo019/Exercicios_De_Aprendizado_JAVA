public class Mamifero extends Animal{
    private String corDoPelo;

    @Override
    public void alimentar() {
        System.out.println("mamando...");
    }

    @Override
    public void locomover() {
        System.out.println("correndo...");
    }

    @Override
    public void somDoAnimal() {
        System.out.println("som do mamifero...");
    }


    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
