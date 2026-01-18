package lv.acodemy;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args)     {
        // my first comm
        /*1 line comm
        2line comm
        3 line

         */

        //int (integer) - whole number /natural number
        int age =30;
        int currentYear = 2024;

        //currentYear - good practice
        //current_year - snake case - never do like this
        //current-year - kebab case - never do like this
        int inventoryItemCount = 100;
        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

      //double (fractional numbers) дробные числа
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temperature);
        System.out.println(price);

        //char (symbols)

        float shortDistance = 10.333f;
        char grade = 'A';
        char myInitial = 'M';
        char currentSymbol = '$';

        //Print them all
        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currentSymbol);

        /*Boolean (logical type  - can keep only 2 values - true/false
     how to name - has or is?
     Exp: isSummer / if(isSummer) {}; isLoggedIn;
     exp: hasAccess / if(hasAccess) {};
                 */


     boolean hasAccess = true;
        System.out.println(hasAccess);
        boolean isSummer = false;
        System.out.println(isSummer);


        //System.out.println("Hello world"); // \n (new line) добавляет абзац с новой строки результат

        System.out.print("Hello Print\n");
        System.out.print("Hello Print2");
        System.out.println("Hello Print2");

        //LONG
        long phoneNumber = 23005626;

        //FLOAT

        float interestRate = 4.5f;

        //Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a+b; //add
        int difference = a-b;
        System.out.println(difference);
        System.out.println(sum);

        int result = a*b;
        System.out.println(result);

      //  divide
        int num1 = 10;
        int num2 = 3;
        int division = num1/num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divisionDouble = num3/num4;
        System.out.println(divisionDouble);

        //division reminder - остаток от деления

        int f = 12;
        int g = 5;
        int reminder = f % g;
        System.out.println(reminder);

        int number = 9;
        boolean isEven = (number % 2 ==0); // == comparison operator
        System.out.println(isEven);

        //increment (++ )(увеличение на +1)
        // ++preincrement - перед +1
        //postIncrement
        //Decrement (--) уменьшение на -1
        // ++predecrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter=10;
        counter++;
        int postIncrement=counter++;  //postIncrement=11; counter = 12
        int preIncrement=++counter;  //preIncrement=13; counter = 13
        System.out.println(postIncrement);
        System.out.println(preIncrement);

        // function
        int r= a+b/5;
        int r1= (a+b)/5;
        int r2= a*b+a/b+(a+b)/2;
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);


    }
}

