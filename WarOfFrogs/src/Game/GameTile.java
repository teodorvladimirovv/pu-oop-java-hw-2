package Game;

import java.awt.*;

public class GameTile {

    private int row;
    private int col;

    /**
     *
     * @param row Horizontal position of the gameBoard
     * @param col Vertical position of the gameBoard
     */
    public GameTile(int row, int col){

        this.row = row;
        this.col = col;
    }

    /**
     *  Method used for coloring the gameTiles on the gameBoard
     *
     * @param g Graphics base class
     */
    public void render(Graphics g){

        if (((row == 0 || row == 400) && col == 0) || ((row == 100 || row == 300) && col == 400)) {
            g.setColor(Color.ORANGE);
        } else if(((row == 100 || row == 300) && col == 0) || ((row == 0 || row == 400) && col == 400)) {
            g.setColor(Color.DARK_GRAY);
        } else if (((row == 0 || row == 100 || row == 300 || row == 400) && col == 100) || ((row == 0 || row == 100 || row == 300 || row == 400) && col == 300 )) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }

        g.drawRect(row, col, 100, 100);
        g.fillRect(row, col, 100-1, 100-1);

    }
}
