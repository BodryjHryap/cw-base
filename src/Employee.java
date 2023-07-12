import java.util.Arrays;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int idCounter = 1;

    public Employee(String name, int department, int salary) {
        this.id = idCounter++;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ". ФИО: " + name + ". Отдел: " + department + ". Зарплата: " + salary + '.';
    }

    public static int summSalary(Employee[] employee) {
        int summSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            summSalary += employee[i].getSalary();
        }
        return summSalary;
    }

    public static int minSalary(Employee[] employee) {
        int [] minSalary = new int[employee.length];
        for (int i = 0; i < employee.length; i++) {
            minSalary[i] += employee[i].getSalary();
        }
        Arrays.sort(minSalary);
        return minSalary[0];
    }

    public static int maxSalary(Employee[] employee) {
        int [] maxSalary = new int[employee.length];
        for (int i = 0; i < employee.length; i++) {
            maxSalary[i] += employee[i].getSalary();
        }
        Arrays.sort(maxSalary);
        return maxSalary[employee.length - 1];
    }

    public static double avgSalary(Employee[] employee) {
        return (double) summSalary(employee)/ employee.length;
    }

    public static String getFullNameOfAll(Employee[] employee) {
        String [] nameOfAllEmployees = new String[employee.length];
        for (int i = 0; i < employee.length; i++) {
            nameOfAllEmployees[i] = employee[i].getName();
            System.out.println("nameOfAllEmployees = " + nameOfAllEmployees[i]);
        }
        return "Всего найдено " + nameOfAllEmployees.length + " ФИО сотрудников";
    }
}
