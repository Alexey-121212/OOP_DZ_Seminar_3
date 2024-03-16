import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generatEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);

        Random randomType = new Random();
        int employeeType = randomType.nextInt(1, 3);

        if (employeeType == 1) {
            return Worker.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary);
        } else {
            return Freelancer.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    (salary / 20.8 / 8));
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
        Employee[] employees = new Worker[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generatEmployee();
        }
        return employees;
    }

}
