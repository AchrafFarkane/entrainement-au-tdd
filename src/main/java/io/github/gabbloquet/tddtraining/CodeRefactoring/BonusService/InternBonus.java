package io.github.gabbloquet.tddtraining.CodeRefactoring.BonusService;

public class InternBonus implements BonusCalculator {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05;
    }
}
