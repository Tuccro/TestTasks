package MatrixDomains;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    // Default matrix dimensions
    public static int DEFAULT_X = 6;
    public static int DEFAULT_Y = 5;

    public static void main(String[] args) throws FileNotFoundException         {

            int x = DEFAULT_X;
            int y = DEFAULT_Y;
            int array[][] = new int[y][x];

            Scanner scanner = new Scanner(new File("array.txt"));

            // File reading
            for (int k = 0; k < y; k++)
                for (int p = 0; p < x; p++) array[k][p] = scanner.nextInt();

            Matrix matrix = new Matrix(array, x, y);
            matrix.printMatrix();
            System.out.println("\n" + "Количество доменов в матрице: " + matrix.getDomains());
        }
}
