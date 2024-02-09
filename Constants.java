
/**
 * Write a description of class Constants here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Constants
{
    //confirm start or stop keys
    public static final String START = "s";
    public static final String STOP = "q";
    public static final String SS = "Start: "+START+", Stop: "+STOP;
    
    // size of the board
    public static final int ROWS = 6;
    public static final int COLS = 7;
    
    // characters for tiles placed on board
    public static final char EMPTY = ' ';
    public static final char PLAYER_ONE = 'X';
    public static final char PLAYER_TWO = 'O';
    
    //game state variables
    public static final int IN_PLAY = 0;
    public static final int P1_WINS = 1;
    public static final int P2_WINS = 2;
    public static final int DRAW = 3;
    
    //print statements
    public static final String REQUEST_PLAYER_NAME = "Player %d: ";
    public static final String RULES = "--%s is "+Constants.PLAYER_ONE+", %s is "+Constants.PLAYER_TWO+"--\n--Type a column number to place a tile--";
    public static final String STATS = "\n--Stats--\nGames Played: %d\n%s: %d\n%s: %d\nDraws: %d";
}