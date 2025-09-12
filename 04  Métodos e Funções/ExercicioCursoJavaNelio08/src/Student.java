public class Student {
    public String nome;
    public double notaBi01;
    public double notaBi02;
    public double notaBi03;


    public double notaAluno(){
        return notaBi01 + notaBi02 + notaBi03;
    }

    public double missingPoints(){
        if (notaAluno() < 60){
            return 60 - notaAluno();
        }
        else{
             return 0.0;
        }
    }


}