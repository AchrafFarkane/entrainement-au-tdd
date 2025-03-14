package io.github.gabbloquet.tddtraining.CodeRefactoring.BonusService;

public class ManagerBonus implements BonusCalculator {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.2;
    }
}
