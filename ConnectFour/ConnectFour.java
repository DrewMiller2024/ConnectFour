import java.util.Scanner;
import java.util.InputMismatchException;
public class ConnectFour {
    private int[][] gameboard = new int[6][7];
    private Scanner scanner = new Scanner(System.in);
    private int scannerInput;
    private boolean gameIsRunning;
    private boolean placeTile;
    private int LOWER_BOUND = 1;
    private int UPPER_BOUND = 7;

    public static void main(String[] args) {
        System.out.println("--Use the playConnectFour method to begin game--");
        System.out.println("--0 represents an empty spot -- 1 represents player 1's tiles -- 2 represents player 2's tiles--");
        System.out.println("--First, type the column that player 1 wishes to place their tile, next player 2 type the column they wish to place a tile--");
        System.out.println("-- Only type in the numbers/columns 1-7 --");
        ConnectFour play = new ConnectFour();
        play.playConnectFour();
    }

    public void playConnectFour() {
        for (int i = 0; i < 7; i++) {
            gameboard[0][i] = 0;
            gameboard[1][i] = 0;
            gameboard[2][i] = 0;
            gameboard[3][i] = 0;
            gameboard[4][i] = 0;
            gameboard[5][i] = 0;
        }

        this.gameIsRunning = true;

        System.out.println("| "+gameboard[5][0]+" | "+gameboard[5][1]+" | "+gameboard[5][2]+" | "+gameboard[5][3]+" | "+gameboard[5][4]+" | "+gameboard[5][5]+" | "+gameboard[5][6]+" |");
        System.out.println("| "+gameboard[4][0]+" | "+gameboard[4][1]+" | "+gameboard[4][2]+" | "+gameboard[4][3]+" | "+gameboard[4][4]+" | "+gameboard[4][5]+" | "+gameboard[4][6]+" |");
        System.out.println("| "+gameboard[3][0]+" | "+gameboard[3][1]+" | "+gameboard[3][2]+" | "+gameboard[3][3]+" | "+gameboard[3][4]+" | "+gameboard[3][5]+" | "+gameboard[3][6]+" |");
        System.out.println("| "+gameboard[2][0]+" | "+gameboard[2][1]+" | "+gameboard[2][2]+" | "+gameboard[2][3]+" | "+gameboard[2][4]+" | "+gameboard[2][5]+" | "+gameboard[2][6]+" |");
        System.out.println("| "+gameboard[1][0]+" | "+gameboard[1][1]+" | "+gameboard[1][2]+" | "+gameboard[1][3]+" | "+gameboard[1][4]+" | "+gameboard[1][5]+" | "+gameboard[1][6]+" |");
        System.out.println("| "+gameboard[0][0]+" | "+gameboard[0][1]+" | "+gameboard[0][2]+" | "+gameboard[0][3]+" | "+gameboard[0][4]+" | "+gameboard[0][5]+" | "+gameboard[0][6]+" |");
        System.out.println("");
        System.out.println("- "+"1"+" - "+"2"+" - "+"3"+" - "+"4"+" - "+"5"+" - "+"6"+" - "+"7"+" -");

        while (gameIsRunning == true) {
            try {
                scannerInput = scanner.nextInt();
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("-- There is no column under the number 1, please put a column from 1-7, player 1's turn has been skipped --");
                } else if (scannerInput > UPPER_BOUND) {
                    System.out.println("-- There is no column above the number 7, please put a column from 1-7, player 1's turn has been skipped --");
                } else {
                    this.placeTile = true;
                    while (placeTile == true) {
                        if (scannerInput == 1) {
                            if (gameboard[0][0] == 0) {
                                gameboard[0][0] = 1;
                            } else if (gameboard[1][0] == 0) {
                                gameboard[1][0] = 1;
                            }  else if (gameboard[2][0] == 0) {
                                gameboard[2][0] = 1;
                            }  else if (gameboard[3][0] == 0) {
                                gameboard[3][0] = 1;
                            }  else if (gameboard[4][0] == 0) {
                                gameboard[4][0] = 1;
                            }   else if (gameboard[5][0] == 0) {
                                gameboard[5][0] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 2) {
                            if (gameboard[0][1] == 0) {
                                gameboard[0][1] = 1;
                            } else if (gameboard[1][1] == 0) {
                                gameboard[1][1] = 1;
                            }  else if (gameboard[2][1] == 0) {
                                gameboard[2][1] = 1;
                            }  else if (gameboard[3][1] == 0) {
                                gameboard[3][1] = 1;
                            }  else if (gameboard[4][1] == 0) {
                                gameboard[4][1] = 1;
                            }   else if (gameboard[5][1] == 0) {
                                gameboard[5][1] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 3) {
                            if (gameboard[0][2] == 0) {
                                gameboard[0][2] = 1;
                            } else if (gameboard[1][2] == 0) {
                                gameboard[1][2] = 1;
                            }  else if (gameboard[2][2] == 0) {
                                gameboard[2][2] = 1;
                            }  else if (gameboard[3][2] == 0) {
                                gameboard[3][2] = 1;
                            }  else if (gameboard[4][2] == 0) {
                                gameboard[4][2] = 1;
                            }   else if (gameboard[5][2] == 0) {
                                gameboard[5][2] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 4) {
                            if (gameboard[0][3] == 0) {
                                gameboard[0][3] = 1;
                            } else if (gameboard[1][3] == 0) {
                                gameboard[1][3] = 1;
                            }  else if (gameboard[2][3] == 0) {
                                gameboard[2][3] = 1;
                            }  else if (gameboard[3][3] == 0) {
                                gameboard[3][3] = 1;
                            }  else if (gameboard[4][3] == 0) {
                                gameboard[4][3] = 1;
                            }   else if (gameboard[5][3] == 0) {
                                gameboard[5][3] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 5) {
                            if (gameboard[0][4] == 0) {
                                gameboard[0][4] = 1;
                            } else if (gameboard[1][4] == 0) {
                                gameboard[1][4] = 1;
                            }  else if (gameboard[2][4] == 0) {
                                gameboard[2][4] = 1;
                            }  else if (gameboard[3][4] == 0) {
                                gameboard[3][4] = 1;
                            }  else if (gameboard[4][4] == 0) {
                                gameboard[4][4] = 1;
                            }   else if (gameboard[5][4] == 0) {
                                gameboard[5][4] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 6) {
                            if (gameboard[0][5] == 0) {
                                gameboard[0][5] = 1;
                            } else if (gameboard[1][5] == 0) {
                                gameboard[1][5] = 1;
                            }  else if (gameboard[2][5] == 0) {
                                gameboard[2][5] = 1;
                            }  else if (gameboard[3][5] == 0) {
                                gameboard[3][5] = 1;
                            }  else if (gameboard[4][5] == 0) {
                                gameboard[4][5] = 1;
                            }   else if (gameboard[5][5] == 0) {
                                gameboard[5][5] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 7) {
                            if (gameboard[0][6] == 0) {
                                gameboard[0][6] = 1;
                            } else if (gameboard[1][6] == 0) {
                                gameboard[1][6] = 1;
                            } else if (gameboard[2][6] == 0) {
                                gameboard[2][6] = 1;
                            } else if (gameboard[3][6] == 0) {
                                gameboard[3][6] = 1;
                            } else if (gameboard[4][6] == 0) {
                                gameboard[4][6] = 1;
                            } else if (gameboard[5][6] == 0) {
                                gameboard[5][6] = 1;
                            } else {
                                System.out.println("--This column is full, Player 1's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                    }

                    System.out.println("| "+gameboard[5][0]+" | "+gameboard[5][1]+" | "+gameboard[5][2]+" | "+gameboard[5][3]+" | "+gameboard[5][4]+" | "+gameboard[5][5]+" | "+gameboard[5][6]+" |");
                    System.out.println("| "+gameboard[4][0]+" | "+gameboard[4][1]+" | "+gameboard[4][2]+" | "+gameboard[4][3]+" | "+gameboard[4][4]+" | "+gameboard[4][5]+" | "+gameboard[4][6]+" |");
                    System.out.println("| "+gameboard[3][0]+" | "+gameboard[3][1]+" | "+gameboard[3][2]+" | "+gameboard[3][3]+" | "+gameboard[3][4]+" | "+gameboard[3][5]+" | "+gameboard[3][6]+" |");
                    System.out.println("| "+gameboard[2][0]+" | "+gameboard[2][1]+" | "+gameboard[2][2]+" | "+gameboard[2][3]+" | "+gameboard[2][4]+" | "+gameboard[2][5]+" | "+gameboard[2][6]+" |");
                    System.out.println("| "+gameboard[1][0]+" | "+gameboard[1][1]+" | "+gameboard[1][2]+" | "+gameboard[1][3]+" | "+gameboard[1][4]+" | "+gameboard[1][5]+" | "+gameboard[1][6]+" |");
                    System.out.println("| "+gameboard[0][0]+" | "+gameboard[0][1]+" | "+gameboard[0][2]+" | "+gameboard[0][3]+" | "+gameboard[0][4]+" | "+gameboard[0][5]+" | "+gameboard[0][6]+" |");
                    System.out.println("");
                    System.out.println("- "+"1"+" - "+"2"+" - "+"3"+" - "+"4"+" - "+"5"+" - "+"6"+" - "+"7"+" -");
                }
            } catch (InputMismatchException error) {
                System.out.println("-- Please type the column you wish to play, a number from 1-7, player 2's turn has been skipped --");
                scanner.next();
            }

            //player2

            try {
                scannerInput = scanner.nextInt();
                if (scannerInput < LOWER_BOUND) {
                    System.out.println("-- There is no column under the number 1, please put a column from 1-7, player 2's turn has been skipped --");
                } else if (scannerInput > UPPER_BOUND) {
                    System.out.println("-- There is no column above the number 7, please put a column from 1-7, player 2's turn has been skipped --");
                } else {
                    this.placeTile = true;
                    while (placeTile == true) {
                        if (scannerInput == 1) {
                            if (gameboard[0][0] == 0) {
                                gameboard[0][0] = 2;
                            } else if (gameboard[1][0] == 0) {
                                gameboard[1][0] = 2;
                            }  else if (gameboard[2][0] == 0) {
                                gameboard[2][0] = 2;
                            }  else if (gameboard[3][0] == 0) {
                                gameboard[3][0] = 2;
                            }  else if (gameboard[4][0] == 0) {
                                gameboard[4][0] = 2;
                            }   else if (gameboard[5][0] == 0) {
                                gameboard[5][0] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 2) {
                            if (gameboard[0][1] == 0) {
                                gameboard[0][1] = 2;
                            } else if (gameboard[1][1] == 0) {
                                gameboard[1][1] = 2;
                            }  else if (gameboard[2][1] == 0) {
                                gameboard[2][1] = 2;
                            }  else if (gameboard[3][1] == 0) {
                                gameboard[3][1] = 2;
                            }  else if (gameboard[4][1] == 0) {
                                gameboard[4][1] = 2;
                            }   else if (gameboard[5][1] == 0) {
                                gameboard[5][1] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 3) {
                            if (gameboard[0][2] == 0) {
                                gameboard[0][2] = 2;
                            } else if (gameboard[1][2] == 0) {
                                gameboard[1][2] = 2;
                            }  else if (gameboard[2][2] == 0) {
                                gameboard[2][2] = 2;
                            }  else if (gameboard[3][2] == 0) {
                                gameboard[3][2] = 2;
                            }  else if (gameboard[4][2] == 0) {
                                gameboard[4][2] = 2;
                            }   else if (gameboard[5][2] == 0) {
                                gameboard[5][2] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 4) {
                            if (gameboard[0][3] == 0) {
                                gameboard[0][3] = 2;
                            } else if (gameboard[1][3] == 0) {
                                gameboard[1][3] = 2;
                            }  else if (gameboard[2][3] == 0) {
                                gameboard[2][3] = 2;
                            }  else if (gameboard[3][3] == 0) {
                                gameboard[3][3] = 2;
                            }  else if (gameboard[4][3] == 0) {
                                gameboard[4][3] = 2;
                            }   else if (gameboard[5][3] == 0) {
                                gameboard[5][3] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 5) {
                            if (gameboard[0][4] == 0) {
                                gameboard[0][4] = 2;
                            } else if (gameboard[1][4] == 0) {
                                gameboard[1][4] = 2;
                            }  else if (gameboard[2][4] == 0) {
                                gameboard[2][4] = 2;
                            }  else if (gameboard[3][4] == 0) {
                                gameboard[3][4] = 2;
                            }  else if (gameboard[4][4] == 0) {
                                gameboard[4][4] = 2;
                            }   else if (gameboard[5][4] == 0) {
                                gameboard[5][4] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 6) {
                            if (gameboard[0][5] == 0) {
                                gameboard[0][5] = 2;
                            } else if (gameboard[1][5] == 0) {
                                gameboard[1][5] = 2;
                            }  else if (gameboard[2][5] == 0) {
                                gameboard[2][5] = 2;
                            }  else if (gameboard[3][5] == 0) {
                                gameboard[3][5] = 2;
                            }  else if (gameboard[4][5] == 0) {
                                gameboard[4][5] = 2;
                            }   else if (gameboard[5][5] == 0) {
                                gameboard[5][5] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                        if (scannerInput == 7) {
                            if (gameboard[0][6] == 0) {
                                gameboard[0][6] = 2;
                            } else if (gameboard[1][6] == 0) {
                                gameboard[1][6] = 2;
                            } else if (gameboard[2][6] == 0) {
                                gameboard[2][6] = 2;
                            } else if (gameboard[3][6] == 0) {
                                gameboard[3][6] = 2;
                            } else if (gameboard[4][6] == 0) {
                                gameboard[4][6] = 2;
                            } else if (gameboard[5][6] == 0) {
                                gameboard[5][6] = 2;
                            } else {
                                System.out.println("--This column is full, Player 2's turn has been skipped--");
                            }
                            placeTile = false;
                        }
                    }

                    System.out.println("| "+gameboard[5][0]+" | "+gameboard[5][1]+" | "+gameboard[5][2]+" | "+gameboard[5][3]+" | "+gameboard[5][4]+" | "+gameboard[5][5]+" | "+gameboard[5][6]+" |");
                    System.out.println("| "+gameboard[4][0]+" | "+gameboard[4][1]+" | "+gameboard[4][2]+" | "+gameboard[4][3]+" | "+gameboard[4][4]+" | "+gameboard[4][5]+" | "+gameboard[4][6]+" |");
                    System.out.println("| "+gameboard[3][0]+" | "+gameboard[3][1]+" | "+gameboard[3][2]+" | "+gameboard[3][3]+" | "+gameboard[3][4]+" | "+gameboard[3][5]+" | "+gameboard[3][6]+" |");
                    System.out.println("| "+gameboard[2][0]+" | "+gameboard[2][1]+" | "+gameboard[2][2]+" | "+gameboard[2][3]+" | "+gameboard[2][4]+" | "+gameboard[2][5]+" | "+gameboard[2][6]+" |");
                    System.out.println("| "+gameboard[1][0]+" | "+gameboard[1][1]+" | "+gameboard[1][2]+" | "+gameboard[1][3]+" | "+gameboard[1][4]+" | "+gameboard[1][5]+" | "+gameboard[1][6]+" |");
                    System.out.println("| "+gameboard[0][0]+" | "+gameboard[0][1]+" | "+gameboard[0][2]+" | "+gameboard[0][3]+" | "+gameboard[0][4]+" | "+gameboard[0][5]+" | "+gameboard[0][6]+" |");
                    System.out.println("");
                    System.out.println("- "+"1"+" - "+"2"+" - "+"3"+" - "+"4"+" - "+"5"+" - "+"6"+" - "+"7"+" -");
                }
            } catch (InputMismatchException error) {
                System.out.println("-- Please type the column you wish to play, a number from 1-7, player 2's turn has been skipped --");
                scanner.next();
            }
        }
    }
}