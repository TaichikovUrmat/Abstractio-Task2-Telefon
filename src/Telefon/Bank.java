package Telefon;

import java.util.Scanner;

public class Bank {

    public static void NewBank(){
        Scanner scanner = new Scanner(System.in);
        Bank[] banks = new Bank[20];
        int count = 0;
        double number = 0.0d;
        boolean chr = true;
        while (chr){
            System.out.println("1. Балансты текшеруу\n"+"2. Депозитке акча салуу\n"+"3. Акча алуу\n"+"4. Программадан чыгу\n");
            System.out.print("оператцияны текшеру: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Cиздин балансыныз" + count);
                     count+=number;
                    break;
                case 2:
                    System.out.print("Саланына турчу сумманы жазыныз: ");

                    int cum = scanner.nextInt();
                    if (cum > 0) {
                        System.out.println(cum + "Сиздин балансыныз толуктанды");
                        count+=cum;
                    } else {
                        System.out.println("Сумма жараксыз");
                    }
                    break;
                case 3:
                    System.out.print("Алынучу сумманы жазыныз: ");
                    int cum2 = scanner.nextInt();
                    if (cum2 > 0 && cum2 <= count) {
                        count -= cum2;
                        System.out.println(count + " -Балансыныздан алынды");
                    } else {
                        System.out.println("Балансынызда сумма жетишсиз");
                    }
                    break;
                case 4:
                    System.out.println("Бизди тандаганыныз  ушун рахмат");
                    chr = false;
                    break;
                default:
                System.out.println(" жарактуу операцияны танданыз!");
                break;
               }
            }
    }


}
