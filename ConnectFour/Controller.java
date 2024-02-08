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
    
    public void eventLoop() {
        //instantiate variables
        scanner = new Scanner(System.in);
        this.board = new Board();
        
        //run event loop
        board.printBoard();
    }
    
    public static void main(String[] args) {
        //instantiate variables
        Controller controller = new Controller();
        controller.eventLoop();
    }
}
