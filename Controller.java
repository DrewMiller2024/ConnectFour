import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller
{
    private Scanner scanner;
    private Board board;
    //player variables
    private String player1;
    private String player2;
    //game stats
    private int gameStatus;
    private int gamesPlayed;
    private int player1Wins;
    private int player2Wins;
    private int draws;

    public void start() {
        //instantiate variables
        scanner = new Scanner(System.in);

        //instantiate stats
        gameStatus = Constants.IN_PLAY;
        gamesPlayed = 0;
        player1Wins = 0;
        player2Wins = 0;
        draws = 0;

        //request player names
        requestPlayerNames();

        //requests for players to play another game or quit the program
        while(true) {
            System.out.printf(Constants.STATS+"\n", gamesPlayed, player1, player1Wins, player2, player2Wins, draws);
            System.out.println("\n--New Game?--\n"+Constants.SS);
            String in = scanner.nextLine();
            if (in.equals(Constants.START)) {
                //if user decides to start, create a new board and play a game
                this.board = new Board();
                eventLoop();
            } else if (in.equals(Constants.STOP)) {
                break;
            }
        } 
    }

    private void requestPlayerNames() {
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 1);
        player1 = scanner.nextLine();
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 2);
        player2 = scanner.nextLine();
    }

    public void eventLoop() {
        //run event loop
        System.out.printf(Constants.RULES+"\n",player1, player2);

        //while loop, where the game is being played
        boolean gameIsRunning = true;
        String curPlayer = player1;
        char curTile = Constants.PLAYER_ONE;
        int count = 0;//count is for testing purposes
        while(gameIsRunning) {
            //print board
            board.printBoard();
            //player making a move
            System.out.printf("--%s's turn--",curPlayer);
            makeMove(curPlayer, curTile);

            //check for winner or draw(full board)
            checkForWinner(curPlayer,curTile);

            //condition to stop playing game
            if(gameStatus!=Constants.IN_PLAY) {
                gameIsRunning = false;
                scanner.nextLine();
            }
            //if game hasn't ended, switch the current player
            curPlayer = (curPlayer.equals(player1) ? player2 : player1);
            curTile = (curTile == Constants.PLAYER_ONE ? Constants.PLAYER_TWO : Constants.PLAYER_ONE);
        }

        //handle updating stats after a game is over
        gameOver();
    }

    public void makeMove(String curPlayer, char curTile) {
        while(true) {
            //get player's choice of col
            int col = -1;
            try {
                col = scanner.nextInt();
                col--;
                if (col < 0 || col >= Constants.COLS) {
                    //enter an integer out of scope of columns
                    System.out.println("--Please enter a real column--");
                    scanner.nextLine();
                } else if (board.getCell(0, col) != Constants.EMPTY) {
                    //entered an integer of a full column
                    System.out.printf("--Column %d is full--\n",col+1);
                } else {
                    for (int i = Constants.ROWS-1; i >=0; i--) {
                        if (board.getCell(i, col) == Constants.EMPTY) {
                            board.updateCell(i, col, curTile);
                            return;
                        }
                    }
                }
            }
            catch (InputMismatchException e) {
                //didn't enter an integer
                System.out.println("--Please enter a real number--");
                scanner.nextLine();
            }
        }
    }

    public void checkForWinner(String curPlayer, char curTile) {
        //checking all 4 directions for 4 in a row
        boolean winner = false;
        for (int row = 0; row < Constants.ROWS; row++) {
            for (int col = 0; col < Constants.COLS; col++) {
                if (step(1, 0, row, col, 0, curTile)
                    || step(0, 1, row, col, 0, curTile)
                    || step(1, 1, row, col, 0, curTile)
                    || step(-1, 1, row, col, 0, curTile)) 
                {
                    winner = true;
                    break;
                }
            }
            if (winner) break;
        }
        //a player has won or check for if the game has drawed
        if (winner) {
            playerHasWon(curPlayer, curTile);
        } else {
            checkForDraw();   
        }
    }

    public boolean step(int stepR, int stepC, int row, int col, int count, char curTile) {
        //row or col is out of bounds
        if (row < 0 || row >= Constants.ROWS || col < 0 || col >= Constants.COLS) return false;
        //if current location on board has tile of the player that just placed a tile, continue
        if (board.getCell(row, col) == curTile)  {
            count++;
        } else {
            return false;
        }
        //player has 4 tiles in a row
        if (count==4) return true;
        if (step(stepR, stepC, row+stepR, col+stepC, count, curTile)) return true;
        
        return false;
    }
    
    public void playerHasWon(String curPlayer, char curTile) {
        board.printBoard();

        System.out.printf("--%s has won!--", curPlayer);
        if (curTile == Constants.PLAYER_ONE) {
            gameStatus = Constants.P1_WINS;
        } else {
            gameStatus = Constants.P2_WINS;
        }
    }

    public void checkForDraw() {
        for (int i = 0; i < Constants.COLS; i++) {
            if (board.getCell(0, i) == Constants.EMPTY) {
                return;
            }
        }  
        board.printBoard();

        System.out.println("--Draw!--");
        gameStatus = Constants.DRAW;
    }

    public void gameOver() {
        gamesPlayed++;
        if (gameStatus == Constants.P1_WINS) {
            player1Wins++;
        } else if (gameStatus == Constants.P2_WINS) {
            player2Wins++;
        } else if (gameStatus == Constants.DRAW) {
            draws++;
        }
        gameStatus = Constants.IN_PLAY;
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}