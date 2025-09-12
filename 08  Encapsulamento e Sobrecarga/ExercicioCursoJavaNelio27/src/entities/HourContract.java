package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate data;
    private double valuePerHour;
    Integer hours;

    public HourContract(LocalDate data, double valuePerHour, Integer hours) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public HourContract(){

    }


    public double totalValue(){
        return valuePerHour * hours;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
