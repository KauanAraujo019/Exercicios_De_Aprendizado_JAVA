package main.Project.model.entities;

import java.time.LocalDate;

public class Contract {
    private Integer numContract;
    private LocalDate dateContract;
    private Double totalValue;

    private Installment installment;

    public Contract(Integer numContract, LocalDate dateContract, Double totalValue) {
        this.numContract = numContract;
        this.dateContract = dateContract;
        this.totalValue = totalValue;
    }






    public Integer getNumContract() {
        return numContract;
    }

    public void setNumContract(Integer numContract) {
        this.numContract = numContract;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public void setDateContract(LocalDate dateContract) {
        this.dateContract = dateContract;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
