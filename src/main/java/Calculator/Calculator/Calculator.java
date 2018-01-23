package Calculator.Calculator;

public class Calculator {
    public float plus(float a, float b){
        return a+b;
    }
    public float minus(float a, float b){
        return a-b;
    }
    public float times(float a, float b){
        return a*b;
    }
    public float by(float a, float b){
        if(b==0){
            throw new IllegalArgumentException("Division by 0!");
        }
        return a/b;
    }
}
