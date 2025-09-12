package entities;

public class OutSourcedEmployee extends Employee{
    Double additionalCharge;

    public OutSourcedEmployee(Double additionalCharge){
        this.additionalCharge = additionalCharge;
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }



    @Override
    public double payment(){
        return getValuePerHour() * getHours() + (additionalCharge / 100 * 110) ;
    }



}
