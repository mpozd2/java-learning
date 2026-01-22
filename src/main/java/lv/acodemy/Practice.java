package lv.acodemy;

public class Practice {
    public static void main(String[] args) {
        // #1. Write a FOR LOOP that prints numbers from 1 to 10 on separate lines
        // for( counter, condition, increment)

       for (int i=1; i <=10; i++) {
           System.out.println(i);
       }

       // #2.Using for loop, print all EVEN numbers from 2 to 20.
        for (int i=2; i <=20; i++, i++) // i + =2
                    {
            System.out.println(i);
        }

         for (int i=2; i <=20; i +=2) // i + =2  (i=i+2)
                          {
                   System.out.println(i);
              }

        /*  Or correct also
        for (int i=2; i <=20; i++){
            if (i %2 ==0); // IF i dvide without rest

        {
           System.out.println(i);}}*/

        // Use FOR  loop to print multiplication table of 5 up to 5*10
        for (int i =1; i <=10; i++) {
            System.out.println("5 * " + i + " = "+ i * 5);
        }










}}


