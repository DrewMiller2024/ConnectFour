import java.util.Scanner;
import java.util.InputMismatchException;
public class ConnectFour {
    private String[][] gameboard = new String[6][7];
    private Scanner scanner = new Scanner(System.in);
    private int scannerInput;
    private int scannerVariable;
    private boolean gameIsRunning;
    private boolean placeTile;
    private boolean forLoop;
    private int LOWER_BOUND = 1;
    private int UPPER_BOUND = 7;

    public static void main(String[] args) {
        System.out.println("-- X represents player 1's tiles -- O represents player 2's tiles--");
        System.out.println("--First, type the column that player 1 wishes to place their tile, next player 2 type the column they wish to place a tile--");
        System.out.println("-- Only type in the numbers/columns 1-7 --");
        ConnectFour play = new ConnectFour();
        play.playConnectFour();
    }

    public void playConnectFour() {
        for (int i = 0; i < 7; i++) {
            gameboard[0][i] = " ";
            gameboard[1][i] = " ";
            gameboard[2][i] = " ";
            gameboard[3][i] = " ";
            gameboard[4][i] = " ";
            gameboard[5][i] = " ";
        }

        this.gameIsRunning = true;

        for (int i = 5; i >= 0; i--) {
            System.out.println("| "+gameboard[i][0]+" | "+gameboard[i][1]+" | "+gameboard[i][2]+" | "+gameboard[i][3]+" | "+gameboard[i][4]+" | "+gameboard[i][5]+" | "+gameboard[i][6]+" |");
        }
        System.out.println("");
        System.out.println("- "+"1"+" - "+"2"+" - "+"3"+" - "+"4"+" - "+"5"+" - "+"6"+" - "+"7"+" -");

        while (gameIsRunning == true) {
            try {
                scannerInput = scanner.nextInt();
                scannerVariable = scannerInput - 1;
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("-- There is no column under the number 1, please put a column from 1-7, player 1's turn has been skipped --");
                } else if (scannerInput > UPPER_BOUND) {
                    System.out.println("-- There is no column above the number 7, please put a column from 1-7, player 1's turn has been skipped --");
                } else {
                    this.placeTile = true;
                    this.forLoop = true;
                    while (placeTile == true) {
                        for (int i = 0; i <= 6; i++) {
                            if (forLoop == true) {    
                                if (i == 6) {
                                    System.out.println("--This column is full, Player 1's turn has been skipped--");
                                    forLoop = false;
                                    placeTile = false;
                                } else
                                if (gameboard[i][scannerVariable].equals(" ")) {
                                    gameboard[i][scannerVariable] = "X";
                                    forLoop = false;
                                    placeTile = false;
                                }
                            }
                        }

                        for (int i = 5; i >= 0; i--) {
                            System.out.println("| "+gameboard[i][0]+" | "+gameboard[i][1]+" | "+gameboard[i][2]+" | "+gameboard[i][3]+" | "+gameboard[i][4]+" | "+gameboard[i][5]+" | "+gameboard[i][6]+" |");
                        }
                        System.out.println("");
                        System.out.println("- "+"1"+" - "+"2"+" - "+"3"+" - "+"4"+" - "+"5"+" - "+"6"+" - "+"7"+" -");

                        for (int i = 0; i < 3; i++) {
                            if (gameboard[i][scannerVariable] == "X" && gameboard[i+1][scannerVariable] == "X" && gameboard[i+2][scannerVariable] == "X" && gameboard[i+3][scannerVariable] == "X") {
                                System.out.println("--Player 1 has won!--");
                                gameIsRunning = false;
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int a = 0; a < 6; a++) {
                                if (gameboard[a][i] == "X" && gameboard[a][i+1] == "X" && gameboard[a][i+2] == "X" && gameboard[a][i+3] == "X") {
                                    System.out.println("--Player 1 has won!--");
                                    gameIsRunning = false;
                                }
                            }
                        }
                        for (int b = 0; b < 3; b++) {
                            for (int c = 0; c < 4; c++) {
                                if(gameboard[b][c] == "X" && gameboard[b+1][c+1] == "X" && gameboard[b+2][c+2] == "X" && gameboard[b+3][c+3] == "X") {
                                    System.out.println("--Player 1 has won!--");
                                    gameIsRunning = false;
                                }
                            }
                        }
                        for (int b = 0; b < 3; b++) {
                            for (int c = 6; c > 2; c--) {
                                if(gameboard[b][c] == "X" && gameboard[b+1][c-1] == "X" && gameboard[b+2][c-2] == "X" && gameboard[b+3][c-3] == "X") {
                                    System.out.println("--Player 1 has won!--");
                                    gameIsRunning = false;
                                }
                            }
                        }
                        
                        
                    }
                }
            } catch (InputMismatchException error) {
                System.out.println("-- Please type the column you wish to play, a number from 1-7, player 2's turn has been skipped --");
                scanner.next();
            }

            //player2

            try {
                scannerInput = scanner.nextInt();
                scannerVariable = scannerInput - 1;
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("-- There is no column under the number 1, please put a column from 1-7, player 2's turn has been skipped --");
                } else if (scannerInput > UPPER_BOUND) {
                    System.out.println("-- There is no column above the number 7, please put a column from 1-7, player 2's turn has been skipped --");
                } else {
                    this.placeTile = true;
                    this.forLoop = true;
                    while (placeTile == true) {
                        for (int i = 0; i <= 6; i++) {
                            if (forLoop == true) {    
                                if (i == 6) {
                                    System.out.println("--This column is full, Player 2's turn has been skipped--");
                                    forLoop = false;
                                    placeTile = false;
                                } else
                                if (gameboard[i][scannerVariable].equals(" ")) {
                                    gameboard[i][scannerVariable] = "O";
                                    forLoop = false;
                                    placeTile = false;
                                }
                            }
                        }

                        for (int i = 5; i >= 0; i--) {
                            System.out.println("| "+gameboard[i][0]+" | "+gameboard[i][1]+" | "+gameboard[i][2]+" | "+gameboard[i][3]+" | "+gameboard[i][4]+" | "+gameboard[i][5]+" | "+gameboard[i][6]+" |");
                        }
                        System.out.println("");
                        System.out.println("- "+"1"+" - "+"2"+" - "+"3"+" - "+"4"+" - "+"5"+" - "+"6"+" - "+"7"+" -");

                        for (int i = 0; i < 3; i++) {
                            if (gameboard[i][scannerVariable] == "O" && gameboard[i+1][scannerVariable] == "O" && gameboard[i+2][scannerVariable] == "O" && gameboard[i+3][scannerVariable] == "O") {
                                System.out.println("--Player 2 has won!--");
                                gameIsRunning = false;
                            }
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int a = 0; a < 6; a++) {
                                if (gameboard[a][i] == "O" && gameboard[a][i+1] == "O" && gameboard[a][i+2] == "O" && gameboard[a][i+3] == "O") {
                                    System.out.println("--Player 2 has won!--");
                                    gameIsRunning = false;
                                }
                            }
                        }
                        for (int b = 0; b < 3; b++) {
                            for (int c = 0; c < 4; c++) {
                                if(gameboard[b][c] == "O" && gameboard[b+1][c+1] == "O" && gameboard[b+2][c+2] == "O" && gameboard[b+3][c+3] == "O") {
                                    System.out.println("--Player 2 has won!--");
                                    gameIsRunning = false;
                                }
                            }
                        }
                        for (int b = 0; b < 3; b++) {
                            for (int c = 6; c > 2; c--) {
                                if(gameboard[b][c] == "O" && gameboard[b+1][c-1] == "O" && gameboard[b+2][c-2] == "O" && gameboard[b+3][c-3] == "O") {
                                    System.out.println("--Player 2 has won!--");
                                    gameIsRunning = false;
                                }
                            }
                        }
                        
                    }
                }
            } catch (InputMismatchException error) {
                System.out.println("-- Please type the column you wish to play, a number from 1-7, player 2's turn has been skipped --");
                scanner.next();
            }
        }
    }
}