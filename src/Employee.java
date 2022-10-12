public class Employee {

    //Constructor
    private String name;
    private int department;
    private int monthSalary;
    private final int id;

    private static int count;

    public Employee(String name, int department, int monthSalary){
        this. name = name;
        this.department= department;
        this.monthSalary = monthSalary;
        this.id = ++ count;
            }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public int getId() { return id;
    }


    @Override
    public String toString() {
        return "Сотрудник " + name + ", отдел № " +  department + " заработная плата: " + monthSalary + " номер:" + id ;
    }


}