public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван", 1, 100000);
        employees[1] = new Employee("Петров Петр", 2, 122000);
        employees[2] = new Employee("Васильев Василий", 3, 178000);
        employees[3] = new Employee("Сидоров Сидор", 4, 144000);
        employees[4] = new Employee("Гришин Григорий", 5, 112000);
        employees[5] = new Employee("Сазонов Сазон", 4, 132000);
        employees[6] = new Employee("Дмитрией Дмитрий", 3, 124000);
        employees[7] = new Employee("Сергеев Сергей", 2, 127000);
        employees[8] = new Employee("Алексеев Алексей", 1, 119000);
        employees[9] = new Employee("Степанов Степан", 0, 122000);

        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[5]);
        System.out.println(employees[6]);
        System.out.println(employees[7]);
        System.out.println(employees[8]);
        System.out.println(employees[9]);


        System.out.println("Общая сумма заработной платы составляет " + totalSum() + " рублей");
        System.out.println("Сотрудник с максимальной заработной платой " + getMaxSalary());
        System.out.println("Сотрудник с минимальной заработной платой " + getMinSalary());

        employees[0].setDepartment(1);
        System.out.println(employees[0]);

    }

    public static int totalSum() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getMonthSalary();
            }
        }
        return sum;

    }

    public static Employee getMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetMax = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getMonthSalary() > max) {
                max = employee.getMonthSalary();
                targetMax = employee;
            }
        }
        return targetMax;
    }

    public static Employee getMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetMin = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getMonthSalary() < min) {
                min = employee.getMonthSalary();
                targetMin = employee;
            }
        }
        return targetMin;
    }
}

   // public static Employee getMediumSalary(){
       // Employee targetMedium = null;
       // int medium = totalSum()/10;
        //targetMedium  = medium;
        //return medium;
    //}

//}

