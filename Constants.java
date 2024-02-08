
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
    
    //print statements
    public static final String REQUEST_PLAYER_NAME = "Player %d: ";
    public static final String RULES = "--%s is "+Constants.PLAYER_ONE+", %s is "+Constants.PLAYER_TWO+"--\n--Type a column number to place a tile--";
}
