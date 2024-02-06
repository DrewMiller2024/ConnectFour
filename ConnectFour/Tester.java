
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void printConstants() {
        System.out.println("--Board Sizes--");
        System.out.printf("ROWS: %d, COLS: %d\n", Constants.ROWS, Constants.COLS);
        System.out.println("--Player Tiles--");
        System.out.printf("EMPTY: %c, PLAYER_ONE: %c, PLAYER_TWO: %c\n", Constants.EMPTY, Constants.PLAYER_ONE, Constants.PLAYER_TWO);
    }
}
