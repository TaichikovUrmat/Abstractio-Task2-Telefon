package Telefon;

import java.util.Arrays;
import java.util.Scanner;

public class Notes extends telefon {


    public Notes(String word) {
        super(word);
    }

    public Notes() {

    }

    public static void addNewNOtes(String[] array, String element, int index) {
        array[index] = element;
    }

    public static void getAll(String[] array, int counter) {

        if (counter == 0) System.out.println("[0]");
        else {
            System.out.print("[");
            for (int i = 0; i < counter; i++) {
                System.out.print(array[i] + "");
                System.out.print("]\n");
            }

        }

    }

    public static String deleteElement(String element, String[] array,int counter){
        boolean foundElement = false;
        for (int i = 0; i < counter; i++) {
            if (array[i].equals(element)){
                for (int j = 0; j < counter; j++) {
                    array[j]=array[j+1];

                }
            }
        }
        return foundElement? "Element deleted": " not found element";
    }
}



//        for (int i = 0; i < notes.length ; i++) {
//            System.out.println(Arrays.toString(notes);
//        }

//        for (Notes note : notes) {
//            System.out.println(note.getWord());
//        }

