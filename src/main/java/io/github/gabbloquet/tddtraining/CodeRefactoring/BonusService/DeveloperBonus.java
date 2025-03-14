package io.github.gabbloquet.tddtraining.CodeRefactoring.BonusService;

public class DeveloperBonus implements BonusCalculator {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.1;
    }
}
