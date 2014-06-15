package MatchesAndSquares;

public class Shape {

    // Length of the square side
    static int SQUARES_SIDE = 2;

    public int getMatches() {
        return matches;
    }

    private int matches;

    Shape(int squares) {
        matches = calcMatches(squares) * SQUARES_SIDE;
    }

    // Method that represents the desired shape as a large square with the unit squares attached to it.
    private int calcMatches(int squares) {

        double root = Math.sqrt(squares);

        // The side of big square is square root of squares number (or integer part of it)
        int bigSquareSide = (int) root;

        // Case when the desired shape is large square without small squares
        if ( root - bigSquareSide == 0 ) {
            return largestSquareMatches(bigSquareSide);

        }   else {
            return largestSquareMatches(bigSquareSide)
                    + squaresAtLargestSquare(bigSquareSide, squares-bigSquareSide*bigSquareSide);
        }
    }

    private int largestSquareMatches (int bigSquareSide) {
        return bigSquareSide*(bigSquareSide+1)*2;
    }

    // First square requires three matches, while the remaining two
    private int squaresAtLargestSquare (int bigSquareSide, int remainder) {

        // If squares do not fit on one side we shall place them at two
        if ( remainder > bigSquareSide ) {
            return 6 + (remainder - 2) * 2;
            } else {
                return 3 + (remainder - 1) * 2;
            }
    }
}
