package entities;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    List<HourContract> contractList = new ArrayList<>();



    public Worker(String name, WorkerLevel level, double baseSalary) {

        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;


    }

    public void addContract(HourContract contract){
        contractList.add(contract);
    }

    public void removeContract(HourContract contract){
        contractList.remove(contract);
    }

    public double income(Integer year, Integer month){

        for (HourContract h : contractList){
            int dataYear = h.getData().getYear();
            int dataMonth = h.getData().getMonthValue();


            if (dataYear == year && dataMonth == month){
                double totSalary = (h.getHours() * h.getValuePerHour()) + getBaseSalary();

                setBaseSalary(totSalary);


            }

        }

        return getBaseSalary();
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
