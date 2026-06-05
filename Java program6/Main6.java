class Employee {
    int salary = 50000;
}

class Manager extends Employee {
    int bonus = 10000;
    int getSalary() { return salary + bonus; }
}

public class Main6 {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.getSalary());  // 60000
    }
}