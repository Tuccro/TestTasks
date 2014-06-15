package MatchesAndSquares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество квадратов (целое положительное число):");
        try {
            int number = scanner.nextInt();
            if (number>0){
                Shape shape = new Shape(number);
                System.out.println(shape.getMatches() + " спичек.");
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }
    }
    }
