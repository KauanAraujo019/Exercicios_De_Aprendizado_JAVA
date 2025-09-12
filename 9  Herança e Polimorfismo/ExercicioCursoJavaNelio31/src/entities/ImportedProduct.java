package entities;

public class ImportedProduct extends Product{
    Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }


    @Override
    public String priceTag(){
        return getName()+" - $ "+String.format("%.2f",totalPrice())+" (Customs Fee: $ "+customsFee+")";
    }


    public Double totalPrice(){
        return getPrice()+customsFee;
    }


}
