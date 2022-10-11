import java.util.Arrays;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static <EMPLOYEES> void main(String[] args) {

        EMPLOYEES[0] = new Employee("Иванов Иван", 1, 100500);
        EMPLOYEES[1] = new Employee("Петров Петр", 2, 122700);
        EMPLOYEES[2] = new Employee("Васильев Василий", 3, 178080);
        EMPLOYEES[3] = new Employee("Сидоров Сидор", 4, 144009);
        EMPLOYEES[4] = new Employee("Гришин Григорий", 5, 112020);
        EMPLOYEES[5] = new Employee("Сазонов Сазон", 4, 132100);
        EMPLOYEES[6] = new Employee("Дмитриев Дмитрий", 3, 124001);
        EMPLOYEES[7] = new Employee("Сергеев Сергей", 2, 127055);
        EMPLOYEES[8] = new Employee("Алексеев Алексей", 1, 119014);
        EMPLOYEES[9] = new Employee("Степанов Степан", 0, 129077);
        //a
        System.out.println(EMPLOYEES[0]);
        System.out.println(EMPLOYEES[1]);
        System.out.println(EMPLOYEES[2]);
        System.out.println(EMPLOYEES[3]);
        System.out.println(EMPLOYEES[4]);
        System.out.println(EMPLOYEES[5]);
        System.out.println(EMPLOYEES[6]);
        System.out.println(EMPLOYEES[7]);
        System.out.println(EMPLOYEES[8]);
        System.out.println(EMPLOYEES[9]);

        //b
        System.out.println("Общая сумма заработной платы составляет " + totalSum() + " рублей");
        //c
        System.out.println("Сотрудник с максимальной заработной платой " + getMaxSalary());
        //d
        System.out.println("Сотрудник с минимальной заработной платой " + getMinSalary());
        //e
        System.out.println(" Средняя заработная плата составляет: " + getAverageSalary());
        //f
        printAllName();
        //g
        System.out.println(EMPLOYEES[0].toString());
        System.out.println(EMPLOYEES[1].toString());
        System.out.println(EMPLOYEES[2].toString());
        System.out.println(EMPLOYEES[3].toString());
        System.out.println(EMPLOYEES[4].toString());
        System.out.println(EMPLOYEES[5].toString());
        System.out.println(EMPLOYEES[6].toString());
        System.out.println(EMPLOYEES[7].toString());
        System.out.println(EMPLOYEES[8].toString());
        System.out.println(EMPLOYEES[9].toString());

    }

    private static int totalSum() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getMonthSalary();
            }
        }
        return sum;
    }
    private static Employee getMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetMax = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getMonthSalary() > max) {
                max = employee.getMonthSalary();
                targetMax = employee;
            }
        }
        return targetMax;
    }
    private static Employee getMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetMin = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getMonthSalary() < min) {
                min = employee.getMonthSalary();
                targetMin = employee;
            }
        }
        return targetMin;
    }
    private static int getAverageSalary() {
        double average = 0;
        double sum = 0;
        int numberStaff = 10;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = +sum + employee.getMonthSalary();
            }

        }
        average = sum / numberStaff;
        return (int) average;

    }
    private static void printAllName(){
        for(Employee employee:EMPLOYEES){
            if (employee !=null){
                System.out.println(employee.getName());
            }
        }


    }


}











