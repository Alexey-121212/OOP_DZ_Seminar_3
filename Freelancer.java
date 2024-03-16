// Фрилансер (работник с почасовой оплатой)
// TODO: Доработать в рамках домашней работы

public class Freelancer extends Employee {

    private Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    public static Freelancer create(String surName, String name, double salary) {
        return new Freelancer(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return (20.8 * 8 * salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка в час: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, salary, calculateSalary());
    }
}
