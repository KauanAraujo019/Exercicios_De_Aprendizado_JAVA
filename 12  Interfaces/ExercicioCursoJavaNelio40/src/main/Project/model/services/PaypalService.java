package model.services;

public class PaypalService implements OnlinePaymentService{
    @Override
    public Double paymantFee(Double amount) {
        return amount * 0.02;

    }

    @Override
    public Double interest(Double amount, Integer months) {
        return (amount * months) * 0.01;

    }
}
