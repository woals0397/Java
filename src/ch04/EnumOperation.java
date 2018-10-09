package ch04;

enum Operation{
    ADD {public int eval(int arg1, int arg2){return arg1 + arg2;}},
    SUBSTRACT{public int eval(int arg1, int arg2){return arg1 - arg2;}},
    MULTIPLY{public int eval(int arg1, int arg2){return arg1 * arg2;}},
    DIVIDE{public int eval(int arg1, int arg2){return arg1 / arg2;}};

    public abstract int eval(int arg1, int arg2);
}

public class EnumOperation {
    public static void main(String[] args) {
        Operation op = Operation.ADD;
        System.out.println(op.eval(5,2));


    }
}
