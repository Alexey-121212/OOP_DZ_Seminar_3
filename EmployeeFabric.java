import java.util.Random;

public class EmployeeFabric {

    private static Random randomSalary = new Random();
    private static Random randomType = new Random();
    private static Random randomAge = new Random();

    public static Employee generatEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };

        int salary = randomSalary.nextInt(60000, 120001);

        int age = randomAge.nextInt(18, 66);

        int employeeType = randomType.nextInt(1, 3);

        if (employeeType == 1) {
            return Worker.create(
                    surnames[randomSalary.nextInt(surnames.length)],
                    names[randomSalary.nextInt(names.length)],
                    salary, age);
        } else {
            return Freelancer.create(
                    surnames[randomSalary.nextInt(surnames.length)],
                    names[randomSalary.nextInt(names.length)],
                    (salary / 20.8 / 8), age);
        }
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     * разных типов (Worker, Freelancer) в рамках домашней работы
     * 
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generatEmployee();
        }
        return employees;
    }

}
