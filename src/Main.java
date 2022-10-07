
public class Main {

    public static void main(String[] args) {
  Employee [] employees = new Employee[10];
        employees [0] = new Employee("Иван Иванов", 5, 205700,1);
        employees [1] = new Employee("Петр Петров", 3,140890, 1 );
        employees [2] = new Employee("Сергей Сергеев", 1, 230774, 1);
        employees [3] = new Employee("Дмитрий Дмитриев", 2, 214287, 1);
        employees [4] = new Employee("Олег Олегов", 4,149254, 1);
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[0].totalSalary());



    }
    }