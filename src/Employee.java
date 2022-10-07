import java.util.Random;

public class Employee {

    private String name;
    private int department;
    private int monthSalary;
    private static int id;

    // counter
    private static int count = 0;

    public Employee() {
        this.id = count == 0 ? new Random().nextInt(1000) : count + 1;
        count = this.id;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public int getId() {
        return id;
    }

    //setters
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    //constructor
    public Employee(String name, int department, int monthSalary, int id) {
        this.name = name;
        this.department = department;
        this.monthSalary = monthSalary;
    }

    // toString
    @Override
    public String toString() {
        return "Сотрудник:" + name + "," + " Отдел №: " + department + "," + " Заработная плата: " + monthSalary + " рублей";
    }
    public int totalSalary(Employee[]employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + getMonthSalary();
            System.out.println(sum);
        }
        return sum;

    }


}
