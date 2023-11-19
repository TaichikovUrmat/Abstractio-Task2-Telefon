package Telefon;

import java.util.Scanner;

public class  calculator extends telefon {
    public calculator() {
    }

    @Override
    public String toString() {
        return "calculator{}";
    }



    public static void newCalculator() {
        Scanner scanner = new Scanner(System.in);
        boolean sss = false;

            System.out.print("Пиши первое число: ");
            int cc1 = scanner.nextInt();
            System.out.print(" +,-,*,/ :");
            int operator = scanner.next().charAt(0);

            System.out.print("Пишите второе число: ");
            int cc3 = scanner.nextInt();

            double resultat = 0;

            switch (operator) {
                case '+':
                    resultat = cc1 + cc3;
                    break;
                case '-':
                    resultat = cc1 - cc3;
                    break;
                case '*':
                    resultat = cc1 * cc3;
                    break;
                case '/':
                    resultat = cc1 / cc3;
                    break;

            }
            System.out.println("Resultat: " + resultat);
        }
    }
