package Piece;

import java.awt.*;

public class YellowGuard {

    private int row;
    private int col;

    /**
     * Constructor for a yellow guard
     *
     * @param row Horizontal position of the gameBoard
     * @param col Vertical position of the gameBoard
     */
    public YellowGuard(int row, int col){
        this.row = row;
        this.col = col;
    }

    /**
     * Method for visualising the yellowGuard on the gameBoard
     *
     * @param g Graphics base class
     */
    public void render(Graphics g){

        g.setColor(Color.GREEN);
        g.drawOval(row, col, 40, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(row, col, 40, 40);
    }


}
