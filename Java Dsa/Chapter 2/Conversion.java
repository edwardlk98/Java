public class Conversion {

    public static void main(String[] args) {

        /* Assignment conversion */

        float money = 100;
        int dollars = 154;

        //dollars = money; compiler will throw an error as assignment conversion can only be done with widening
        money = dollars;
        System.out.println(money);
        /*Promotion conversion
        a value is promoted to the desire data type before peforming an opperation
        */
        float sum = 10;
        int count = 5;
        float result= sum/count; // count is promoted to a float because of sum is also a float. yeilding 2.0
        System.out.println(result);

        /*Casting
            operator used to convert by specilfying the type in paranthesis (type)
        */
        dollars =  (int)money; // compiler will not throw an error but data will be lost
    }
}