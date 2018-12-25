package numberdigitsum;

/**
 *
 * @author Jeancy Tshibemba
 */
public class NumberDigitSum {
    /**
     * 
     * @param num the number we are evaluating the sum
     * @return sum , the sum of the digits of the given number
     */
    public static int digitSum(int num){
        int sum = 0; // At the beginning sum is 0
        
        while(num > 0) { 
            sum += num % 10; // sum = sum + num % 10 ; is the other way of writing this expression.
            num = num / 10; //Update the value of num to avoid infinite loop.
        }
        return sum;// Returning the value of the the sum after the loop if finished.
    }
    public static void main(String[] args) {
        System.out.println( "The sum of the digits of 3522 is: " + digitSum(3522));// print 12
        System.out.println( "The sum of the digits of 1999 is: " + digitSum(1999));// print 28
        System.out.println( "The sum of the digits of 18 is: " + digitSum(18)); // print 9
    }
    
}
