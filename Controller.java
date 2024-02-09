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
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 1);
        player1 = scanner.nextLine();
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 2);
        player2 = scanner.nextLine();

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

    public void eventLoop() {
        //run event loop
        System.out.printf(Constants.RULES+"\n",player1, player2);
        
        
        //while loop, where the game is being played
        boolean gameIsRunning = true;
        String curPlayer = player1;
        char curTile = Constants.PLAYER_ONE;
        int count = 0;//count is for testing purposes
        while(gameIsRunning) {
            //player making a move
            board.printBoard();
            System.out.printf("--%s's turn--",curPlayer);
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
                                break;
                            }
                        }
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    //didn't enter an integer
                    System.out.println("--Please enter a real number--");
                    scanner.nextLine();
                }
            }
            
            //check for winner or draw(full board)

            //condition to stop playing game
            if(gameStatus!=Constants.IN_PLAY) {
                gameIsRunning = false;
            }
            //if game hasn't ended, switch the current player
            curPlayer = (curPlayer.equals(player1) ? player2 : player1);
            curTile = (curTile == Constants.PLAYER_ONE ? Constants.PLAYER_TWO : Constants.PLAYER_ONE);
        }
        
        //handle updating stats after a game is over
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