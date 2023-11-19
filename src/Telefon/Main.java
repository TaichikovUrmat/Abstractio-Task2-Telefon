package Telefon;

import java.util.Scanner;

import static Telefon.Notes.addNewNOtes;
import static Telefon.Notes.deleteElement;

public class Main {
    public static void main(String[] args) {
        String[] notes = new String[20];
        int counterNotes = 0 ;

        Notes nn = new Notes();

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = false;
        while (true) {
            if (!isTrue) {
                System.out.print("""
                + --------------------------+
                 |                          |
                 |     welcome to📱🙌       |
                 |                          |
                 |        ✍ 1.Notes         |
                 |        🏫2.Bank          |
                 |        🧮3.Calculato     |
                 |                          |
                 |                          |
                 +--------------------------+
                        """);
            } else {
                System.out.print("""
                     +--------------+
                     |              |
                     | 1. Add Notes |
                     | 2. Notest    |
                     | 3. Udalenie  |
                     |              |
                     +--------------+                  
                        """);
            }
            if (!isTrue) {
                switch (scanner.nextLine()) {
                    case "1":
                        isTrue = true;
                        System.out.println("--");
                        break;
                    case "2":
                        System.out.println("Welcome to🙌");
                        Bank.NewBank();
                        break;
                    case "3":
                        System.out.println("Welcome to🙌");
                        calculator.newCalculator();
                        break;
                    default:
                        System.out.println("Invalit");
                }
            } else {
                switch (scanner.nextLine()) {
                    case "1":
                        System.out.println("Welcome to🙌");
                        System.out.println("вы вошли на заметку! пишите что угодна: ");
                        addNewNOtes(notes,scanner.nextLine(),  counterNotes++);


                        break;
                    case "2":
                        Notes.getAll(notes,counterNotes);

                        break;
                    case "3":
                        System.out.println("Enter element to delete: ");
                        String element = scanner.nextLine();
                        deleteElement(element,notes,counterNotes--);
                        break;
                }
            }

        }

    }

//    public static void addNewNOtes(String[] array,String element,int index){
//        array[index]=element;
//    }


}
