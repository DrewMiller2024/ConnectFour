/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    private char[][] board;

    public Board() {
        board = new char[Constants.ROWS][Constants.COLS];
        initBoard();
    }
    
    private void initBoard() {
        for (int i = 0; i < Constants.ROWS; i++) {
            for (int j = 0; j < Constants.COLS; j++) {
                board[i][j] = Constants.EMPTY;
            }
        }
    }
    
    public void updateCell(int row, int col, char chaar) {
        board[row][col] = chaar;
    }
    
    public char getCell(int row, int col) {
        return board[row][col];
    }

    public void printBoard() {
        for (int i = 0; i < Constants.ROWS; i++) {
            printLine();
            for (int j = 0; j < Constants.COLS; j++) {
                System.out.printf("| %c ", board[i][j]);
            }
            System.out.println("|");
        }
        printLine();
        for (int i = 0; i < Constants.COLS; i++) {
            System.out.printf("- %d ", i+1);
        }
        System.out.println("-");
    }

    private void printLine() {
        for (int j = 0; j < Constants.COLS*4+1; j++) {
            System.out.print("-");
        }
        System.out.println();
    }
}