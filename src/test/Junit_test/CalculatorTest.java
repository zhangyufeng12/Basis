package test.Junit_test;
/*
*@author  zhangyufeng
*@data 2018/7/24 下午5:40
*/

public class CalculatorTest {
    private int nbErrors =0;

    public void testAdd() throws IllegalAccessException {
        Calculator calculator = new Calculator();
        double result = calculator.add(10,50.1);
        if(result!=60)
        {
            throw new IllegalAccessException("Bad  result :"+ result);
        }
    }

    public static void main( String[] args ) throws IllegalAccessException {

//            Calculator calculator = new Calculator();
//            double result = calculator.add(10,50);
//            if(result!=60)
//            {
//                System.out.println("Bad result :" +result);
//            }
//            else
//            {
//                System.out.println(result);
//            }

        CalculatorTest test = new CalculatorTest();

        try {
            test.testAdd();
        } catch (IllegalAccessException e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors>0)
        {
            throw new IllegalAccessException("there were " +test.nbErrors +"  error(s)");
        }

    }
}
