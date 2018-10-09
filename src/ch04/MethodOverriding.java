package ch04;

class Employee{
    private int salary = 4000;
    private double bonus = 200;

    public int getSalary(){
        return salary;
    }

    private double getBonus(){
        return bonus;
    }
}

class Manager extends Employee{
    @Override
    public int getSalary() {
        return super.getSalary()+1000;
    }

    /* private접근자는 접근불가능
    public double getBonus(){
        return super.getBonus;
    }
    */
}

public class MethodOverriding {
    public static void main(String[] args) {

    }
}
