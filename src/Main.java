public class Main {
    static Employee[] employee = new Employee[10];

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

        for (int i = 0; i < employee.length; i++){
            System.out.println(employee[i]);
        }

        System.out.println("emloyee[5].getName() = " + employee[5].getName());
        System.out.println("emloyee[3].getDepartment() = " + employee[3].getDepartment());
        System.out.println("emloyee[7].getSalary() = " + employee[7].getSalary());
        System.out.println("employee[8].getId() = " + employee[8].getId());

        employee[4].setSalary(200000);
        System.out.println("emloyee[4].getSalary() = " + employee[4].getSalary());

        System.out.println("Emloyee.sumSalary(emloyee) = " + Employee.summSalary(employee));
        System.out.println("Employee.avgSalary(employee) = " + Employee.avgSalary(employee));

        System.out.println("Employee.minSalary(employee) = " + Employee.minSalary(employee));
        System.out.println("Employee.maxSalary(employee) = " + Employee.maxSalary(employee));

        System.out.println("Employee.getFullNameOfAll(employee) = " + Employee.getFullNameOfAll(employee));
    }
}