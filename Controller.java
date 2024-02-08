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
    
    public void start() {
        //instantiate variables
        scanner = new Scanner(System.in);
        this.board = new Board();

        //request player names
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 1);
        player1 = scanner.nextLine();
        System.out.printf(Constants.REQUEST_PLAYER_NAME, 2);
        player2 = scanner.nextLine();
        
        //request to leave or continue
        while(true) {
            System.out.println(Constants.SS);
            String in = scanner.nextLine();
            if (in.equals(Constants.START)) {
                eventLoop();
            }
            if (in.equals(Constants.STOP)) {
                return;
            }
        } 
    }
    
    public void eventLoop() {
        //run event loop
        System.out.printf(Constants.RULES+"\n",player1, player2);
        //add while loop here
        board.printBoard();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}
