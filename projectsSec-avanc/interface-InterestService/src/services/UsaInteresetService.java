package services;

import java.security.InvalidParameterException;

public class UsaInteresetService implements InterestService{
    private double interesetRate;

    public UsaInteresetService(double interesetRate) {
        this.interesetRate = interesetRate;
    }

    @Override
    public double getInteresetRate() {
        return interesetRate;
    }
}
