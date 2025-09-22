package model.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate dateInstallment;
    private Double amount;

    public Installment(LocalDate dateInstallment, Double amount) {
        this.dateInstallment = dateInstallment;
        this.amount = amount;
    }






    public LocalDate getDateInstallment() {
        return dateInstallment;
    }

    public void setDateInstallment(LocalDate dateInstallment) {
        this.dateInstallment = dateInstallment;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
