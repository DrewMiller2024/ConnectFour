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
    private String player1;
    private String player2;

    public boolean eventLoop() {
        //instantiate variables
        scanner = new Scanner(System.in);
        this.board = new Board();

        //request to leave or continue
        while(true) {
            System.out.println(Constants.SS);
            String in = scanner.nextLine();
            if (in.equals(Constants.START)) {
                break;
            }
            if (in.equals(Constants.STOP)) {
                return false;
            }
        } 


        //request player names
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 1);
        player1 = scanner.nextLine();
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 2);
        player2 = scanner.nextLine();

        //run event loop
        System.out.printf(Constants.RULES+"\n",player1, player2);
        board.printBoard();
        //add while loop here
        
        // go back to controller and start a new game
        return true;
    }

    public static void main(String[] args) {
        boolean gameIsRunning = true;
        
        while (gameIsRunning) {
            Controller controller = new Controller();
            boolean newGame = controller.eventLoop();
            if (!newGame) {
                gameIsRunning = false;
            }
        }
    }
}
