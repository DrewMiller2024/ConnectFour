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
    
    public void eventLoop() {
        //instantiate variables
        scanner = new Scanner(System.in);
        this.board = new Board();
        
        //request player names
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 1);
        player1 = scanner.nextLine();
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 2);
        player2 = scanner.nextLine();
        
        
        //run event loop
        System.out.printf(Constants.RULES+"\n",player1, Constants.PLAYER_ONE, player2, Constants.PLAYER_TWO);
        board.printBoard();
    }
    
    public static void main(String[] args) {
        //instantiate variables
        Controller controller = new Controller();
        controller.eventLoop();
    }
}
