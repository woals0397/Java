package ch02;

public class Employee {
    private String name;
    private int salary;

    public Employee(){

    }

    public Employee(int salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}


class Main{
    public static void main(String[] args) {
        Employee ep = new Employee(10);
        System.out.println(ep.getName());
        System.out.println(ep.getSalary());
    }
}