package model.services;

import java.time.LocalDate;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);
}
