package lv.acodemy;

public class ExampleClass {
    public static void main(String[] args) {
        sayHello();
        greet("Maria");
        greet("Nikita");



        System.out.println(add(30,60));
        int x = add(30,90);
        System.out.println(x);

        System.out.println(add(12.2,13.5));

        double a =12.2;
        double b =13.5;
        System.out.println(add(a,b));




       //String firstStudent = calculateGrade( score:70);
       // System.out.println(firstStudent);

          }

    public static void sayHello() {
        System.out.println("Hello World!");

    }

    public static void greet (String name) {
        System.out.println("Hello," + name+ "!");

    }

    //Method overloading
    public static int add(int a, int b) {
        // int c = a+b; //
        // return c;
        return a + b;

    }
    public static double add(double a, double b){
            // int c = a+b; //
            // return c;
            return a+b;
    }
    public static String calculation(int  score) {
        if (score >=90) {
            return "A";
        } else if (score>=75){
            return "B";
        } else if (score>=50){
            return "C";
        } else {
            return"F";
        }

    }



    }










