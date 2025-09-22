package model.services;


public interface OnlinePaymentService {
    Double paymantFee(Double amount);
    Double interest(Double amount, Integer months);
}
