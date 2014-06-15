package StringParser;

import java.util.Scanner;

public class Main {

    // Function that iterates through characters by search of copies and deleting it
    public static void stringAnalyser (String string) {

        StringBuffer stringBuffer = new StringBuffer(string);

        int length = stringBuffer.length();


        while (length>0) {
            char symbol = stringBuffer.charAt(0);
            stringBuffer.deleteCharAt(0);
            length--;

            // Flag if duplicate was found
            boolean changed = false;

            for (int p = 0; p < length; p++ )
                if (stringBuffer.charAt(p) == symbol) {
                    stringBuffer.deleteCharAt(p);
                    length--;
                    changed = true;
                    p--;
                }

            // If duplicate was not found it is sought-for symbol
            if (changed==false) {
                System.out.println("Искомый символ: " + symbol);
                System.exit(0);
            }

        }

        System.out.println("Уникальный символ не найден");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String string = scanner.nextLine();

        stringAnalyser(string);


    }
}
