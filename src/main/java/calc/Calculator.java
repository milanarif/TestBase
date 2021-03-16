package calc;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public Pair getAPair(){
        return new Pair(1,2);
    }

    public boolean branchingExample(int a){
        if( a > 0){
            return false;
        }
        else
            return true;
    }
}
