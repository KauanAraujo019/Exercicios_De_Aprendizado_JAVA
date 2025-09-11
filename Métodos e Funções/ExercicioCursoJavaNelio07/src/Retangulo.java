public class Retangulo {
    public double width;
    public double height;

    public void area(){
        double result = width * height;

        System.out.println("AREA " + result);
    }

    public void perimeter(){
        double result = 2 * (width + height);
        System.out.println("PERIMETRO: "+result);
    }

    public void diagonal(){
        double result = Math.sqrt((width * width) + (height * height));
        System.out.println("Diagonal: "+ result);
        
    }
}