package main.Project.model.services;

public class PaypalService implements OnlinePaymentService {
    public Double paymantFee(Double amount) {
        return amount * 0.02;
    }

    public Double interest(Double amount, Integer months) {
        return amount * (double)months * 0.01;
    }
}

