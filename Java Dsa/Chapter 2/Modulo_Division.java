public class Modulo_Division {
    /*Modulo takes the remainder
    
      Division takes the truncates the remainder if its not a float
    */

      public static void main(String[] args) {
        //modulo example
        System.out.println(10%2);//yeilds 0 as 2 goes into 10 5 times with a remainer of 0
        System.out.println(10%20);//yeids 10 as 20 goes into 10 zero times with a remainder of 10
        System.out.println(1.5 % 5);

        //Division example
        System.out.println(10/3);//yeilds 9 as int is used in operands
        System.out.println(10/3.0); //yeilds 3.3 as float keeps the larger operand
      }
}
