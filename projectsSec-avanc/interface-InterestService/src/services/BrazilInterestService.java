package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    private double interesetRate;

    public BrazilInterestService(double interesetRate) {
        this.interesetRate = interesetRate;
    }

    @Override
    public double getInteresetRate() {
        return interesetRate;
    }
}
