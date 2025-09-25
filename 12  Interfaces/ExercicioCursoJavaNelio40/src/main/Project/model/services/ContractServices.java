package main.Project.model.services;

import main.Project.model.entities.Contract;
import main.Project.model.entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContractServices {

    private OnlinePaymentService onlinePaymentService;

    public void processContract(Contract contract, Integer amount, OnlinePaymentService onlinePaymentService){
        List<Installment> listaParcelamentos = new ArrayList<>();

        for (int i = 1; i <= amount; i++){
            LocalDate dateParcelamento1 = contract.getDateContract().plusMonths(i);

            Double valorTot = contract.getTotalValue()/amount;

            valorTot += onlinePaymentService.interest(valorTot, i);

            valorTot += onlinePaymentService.paymantFee(valorTot);

            Installment installment = new Installment(dateParcelamento1, valorTot);

            listaParcelamentos.add(installment);

        }

        for (Installment inst : listaParcelamentos){
            System.out.println(inst.getDateInstallment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" "+ String.format("%.2f", inst.getAmount()));
        }

    }


}
