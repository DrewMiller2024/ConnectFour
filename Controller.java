import java.util.Scanner;
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

    public void start() {
        //instantiate variables
        scanner = new Scanner(System.in);
        
        //instantiate stats
        gameStatus = Constants.IN_PLAY;
        gamesPlayed = 0;
        player1Wins = 0;
        player2Wins = 0;

        //request player names
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 1);
        player1 = scanner.nextLine();
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 2);
        player2 = scanner.nextLine();

        //requests for players to play another game or quite the program
        while(true) {
            System.out.printf(Constants.STATS+"\n", gamesPlayed, player1, player1Wins, player2, player2Wins);
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
        board.printBoard();
        
        //handle updating stats after a game is over
        gamesPlayed++;
        if (gameStatus == Constants.P1_WINS) {
            player1Wins++;
        } else if (gameStatus == Constants.P2_WINS) {
            player2Wins++;
        }
        gameStatus = Constants.IN_PLAY;
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}