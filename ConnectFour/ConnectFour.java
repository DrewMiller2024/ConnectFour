import java.util.Scanner;
public class ConnectFour {
    private int[][] gameboard = new int[6][7];
    
    public ConnectFour() {
        for (int i = 0; i < 7; i++) {
            gameboard[0][i] = 0;
            gameboard[1][i] = 0;
            gameboard[2][i] = 0;
            gameboard[3][i] = 0;
            gameboard[4][i] = 0;
            gameboard[5][i] = 0;
        }
        
        System.out.println("--Use the playConnectFour method to begin game--");
    }
    
    public int[][] test() {
        return gameboard;
    }
}