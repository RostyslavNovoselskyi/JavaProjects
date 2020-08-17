package tzipart1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Perestanovka {
    public void perestanov (){
        System.out.println("Пряма перестановка:");
        System.out.println("Введіть текст для розшифрування");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] c1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '`', '-', ',', '.', ';'};

        char[] c2 = {';', '.', ',', '-', '`', ' ', 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M',
            'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};

        char[] c3 = s.toCharArray();

        int i=0;
        while (i < c3.length){
            for (int j=0; j < c1.length; j++) {
                if (c3[i] == c1[j]) {
                    c3[i] = c2[j];
                }
            }
            i++;
        }
//        System.out.println(c3);
        System.out.println("");
    }
}
