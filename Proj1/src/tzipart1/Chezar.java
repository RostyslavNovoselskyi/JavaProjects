package tzipart1;

import java.util.Scanner;

public class Chezar {
    public void zashifr (){
        System.out.println("Введіть текст для шифра Цезаря");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Введіть зміщення");
        int abs = scanner.nextInt();

        char[] chars = s.toCharArray();
        StringBuilder test = new StringBuilder();
        test.append((char) abs);

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - abs);
            test.append(chars[i]);
        }
        System.out.println(test);

    }


    public void rozshifr (){
        System.out.println("Введіть текст для розшифрування");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Введіть зміщення");
        int abs = scanner.nextInt();

        char[] chars = s.toCharArray();
        StringBuilder test = new StringBuilder();
        test.append((char) abs);

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + abs);
            test.append(chars[i]);
        }
        System.out.println(test);

    }

}
