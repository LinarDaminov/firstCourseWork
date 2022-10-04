public class Employee {

    private String name;
    private int department;
    private int monthSalary;
    private int id;

    Employee Ivan = new Employee("Иван Иванов", 5, 205700);
    Employee Petr = new Employee("Петр Петров", 3,140890);
    Employee Dima = new Employee("Дмитрий Лебедев", 1, 230774);
    Employee Azat = new Employee("Азат Садыков", 2, 214287);


    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Employee(String name, int department, int monthSalary) {
        this.name = name;
        this.department = department;
        this.monthSalary = monthSalary;
    }

    @Override
    public  String toString () {
        return  "Сотрудник:" + name + "," + " Отдел №: " + department + ","+ " Заработная плата: " +  monthSalary + " рублей";
    }


}
