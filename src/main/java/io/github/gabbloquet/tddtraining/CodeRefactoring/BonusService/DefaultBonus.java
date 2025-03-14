package io.github.gabbloquet.tddtraining.CodeRefactoring.BonusService;

public class DefaultBonus implements BonusCalculator {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.03;
    }
}
