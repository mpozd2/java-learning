package lv.acodemy;

public class Loops {
    public static void main(String[] args) {

        //FOR LOOP
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Water", "Fruits"};
        for (int i = 0; i < shoppingList.length; i++)   //  ( exp) i<3 ...
        {
            System.out.println("Current product FOR is " + shoppingList[i]);
        }
        System.out.println("Goes next!");

        //For-Each item from list Loop
        for (String s : shoppingList) {
            System.out.println("Current product FOR S is " + s);
        }
        System.out.println("Goes next!");

        //Counter WHILE - бесконечный цикл
        int i = 0;
        while (i < shoppingList.length) {
            System.out.println("Current product WHILE is " +shoppingList[i]);
            i++;
        }

        int j =0;
        do {
            System.out.println("Current product DO 'J' is " + shoppingList[j]);
            j++;

        } while (j < shoppingList.length);

        boolean x = 1 < 5 && 6 > 3 && 5 > 2; //AND
        boolean x1 = 1 < 5 && 6 < 3; //AND
        boolean y = 2 < 5 || 3 < 2; // OR
        System.out.println("Boolean status (AND) is " + x);
        System.out.println("Boolean status (AND) is " + x1);
        System.out.println("Boolean status (OR) is " + y);



    }

}
