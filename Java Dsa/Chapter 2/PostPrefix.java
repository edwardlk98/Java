public class PostPrefix {
    public static void main(String[] args) {
        /*Postfix
        Data is assigned before being process

        Prefix 
        Data is assigned after it is process
        */

        //Postfix example 
        int count = 10;
        int total = count++;
        System.out.println(total); // total is 10 and count is 11

        //Prefix example
        int count2 = 10;
        int total2 = ++count2;
        System.out.println(total2);  //total and count is 11;
    }
}
