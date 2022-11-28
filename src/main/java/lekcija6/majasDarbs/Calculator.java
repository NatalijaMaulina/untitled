package lekcija6.majasDarbs;

public class Calculator {
    int result;
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        result = a+b;
        return result;
    }
    public int substract (){
        result = a-b;
        return result;
    }
    public int multiply (){
        result = a*b;
        return result;
    }
    public float divide (){
        result = a / b;
        return result;
    }

}
