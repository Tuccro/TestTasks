package MatrixDomains;

public class Matrix {

    private int []matrix[];
    private int width, height;

    public int getDomains() {
        domainsCalc();
        return domains;
    }

    private int domains = 0;

    Matrix(int source[][], int width, int height) {
        matrix = source;
        this.width = width;
        this.height = height;
    }

    // Search of ones
    private void domainsCalc() {

        for (int k = 0; k < height; k++) {
            for (int p = 0; p < width; p++) {

                // If 1 detected then counter counter will be added
                if (matrix[k][p]==1) {
                    domains++;
                    domainCheck(matrix,k,p);
                }
            }
        }
    }

    // Function that detect all units in domain at four directions and "cleanse" it
    private void domainCheck(int matrix[][], int y, int x) {

        matrix[y][x] = 0;

        // Right
        if (x+1<width)
            if (matrix[y][x+1] > 0) domainCheck(matrix, y, x +1);

        // Down
        if (y+1<height)
            if (matrix[y+1][x] > 0) domainCheck(matrix, y + 1, x);

        // Left
        if (x>0)
            if (matrix[y][x-1] > 0) domainCheck(matrix, y, x-1);

        // Up
        if (y>0)
            if (matrix[y-1][x] > 0) domainCheck(matrix, y - 1, x);

    }

    public void printMatrix() {

        for (int x = 0; x < height; x++) {
            for (int y = 0; y<width; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
    }

}