package a;



public class MainClient {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addAns = calculator.calc(2,3,"+");
        System.out.println(addAns);

        int mulAns = calculator.calc(2,3,"*");
        System.out.println(mulAns);
    }
}


class Calculator implements  Calculation{

    @Override
    public int calc(int a, int b, String sign) {
        switch (sign){
            case "+":
                return a+b;

            case "*":
                return a*b;
        }

       return -1;
    }
}

interface Calculation {

    int calc(int a, int b , String sign);
}