import java.util.Arrays;

public class Main {
    static Employee[] employee = new Employee[10];

    public static int summSalary(Employee[] employee) {
        int summSalary = 0;
        for (Employee employees : employee){
            summSalary += employee[employees.getId() - 1].getSalary();
        }
        return summSalary;
    }

    public static int minSalary(Employee[] employee) {
        int [] minSalary = new int[employee.length];
        for (Employee employees : employee) {
            minSalary[employees.getId() - 1] += employee[employees.getId() - 1].getSalary();
        }
        Arrays.sort(minSalary);
        return minSalary[0];
    }

    public static int maxSalary(Employee[] employee) {
        int [] maxSalary = new int[employee.length];
        for (Employee employees : employee) {
            maxSalary[employees.getId() - 1] += employee[employees.getId() - 1].getSalary();
        }
        Arrays.sort(maxSalary);
        return maxSalary[employee.length - 1];
    }

    public static double avgSalary(Employee[] employee) {
        return (double) summSalary(employee)/ employee.length;
    }

    public static String getFullNameOfAll(Employee[] employee) {
        String [] nameOfAllEmployees = new String[employee.length];
        for (Employee employees : employee) {
            nameOfAllEmployees[employees.getId() - 1] = employee[employees.getId() - 1].getName();
            System.out.println(nameOfAllEmployees[employees.getId() - 1]);
        }
        return "Всего найдено " + nameOfAllEmployees.length + " ФИО сотрудников";
    }

    public static void main(String[] args) {
        employee[0] = new Employee("Акимов Семён Алексеевич", 1, 90000);
        employee[1] = new Employee("Иванов Иван Иванович", 5, 140000);
        employee[2] = new Employee("Иванов Пётр Иванович", 2, 120000);
        employee[3] = new Employee("Дубин Николай Игорвич", 3, 40000);
        employee[4] = new Employee("Алексеев Александр Александрович", 5, 152000);
        employee[5] = new Employee("Погребняк Иван Иванович", 1, 35000);
        employee[6] = new Employee("Березутский Василий Александрович", 2, 80000);
        employee[7] = new Employee("Зобнин Роман Игоревич", 4, 75000);
        employee[8] = new Employee("Кузяев Далер Ильшатович", 4, 98000);
        employee[9] = new Employee("Акинфеев Игорь Александрович", 2, 67000);

        for (Employee employees : employee){
            System.out.println(employee[employees.getId() - 1]);
        }

        System.out.println("ФИО шестого сотрудника = " + employee[5].getName());
        System.out.println("Номер отдела четвертого сотрудника = " + employee[3].getDepartment());
        System.out.println("Зарплата восьмого сотрудника = " + employee[7].getSalary());
        System.out.println("ID девятого сотрудника = " + employee[8].getId());

        employee[4].setSalary(180000);
        System.out.println("Зарплата пятого сотрудника = " + employee[4].getSalary());

        System.out.println("Общие расходы на заработную плату = " + summSalary(employee));
        System.out.println("Средняя зарплата сотрудников = " + avgSalary(employee));

        System.out.println("Минимальная зарплата сотрудников = " + minSalary(employee));
        System.out.println("Максимальная зарплата сотрудников = " + maxSalary(employee));

        System.out.println("Имена всех сотрудников: ");
        System.out.println(getFullNameOfAll(employee));
    }
}