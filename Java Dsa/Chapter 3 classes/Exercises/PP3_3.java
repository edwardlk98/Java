package Exercises;

import java.util.Random;

public class PP3_3 {
    public static void main(String[] args) {

        Random rand = new Random();
        
        System.out.println(""+ rand.nextInt(1, 8)+ rand.nextInt(1, 8)+rand.nextInt(1, 8)+"-" + rand.nextInt(100, 742) +"-" + rand.nextInt(1000, 10000));
    }
}
