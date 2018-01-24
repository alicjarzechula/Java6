package Calculator.Calculator;

public class Calculator {
    public float add(float a, float b){
        return a+b;
    }
    public float substrack(float a, float b){
        return a-b;
    }
    public float multiply(float a, float b){
        return a*b;
    }
    public float divide(float a, float b){
        if(b==0){
            throw new IllegalArgumentException("Division by 0!");
        }
        return a/b;
    }
    public int raise(int a, int b){
        int result = a;
        for(int i=1; i<b; i++){
            result*=a;
        }
        return result;
    }
}
