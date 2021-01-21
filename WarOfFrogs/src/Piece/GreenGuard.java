package Piece;

import java.awt.*;

public class GreenGuard {
    private int row;
    private int col;

    /**
     * Constructor for a green guard
     *
     * @param row Horizontal position of the gameBoard
     * @param col Vertical position of the gameBoard
     */
    public GreenGuard(int row, int col){
        this.row = row;
        this.col = col;
    }

    /**
     * Method for visualising the greenGuard on the gameBoard
     *
     * @param g Graphics base class
     */
    public void render(Graphics g){

        g.setColor(Color.YELLOW);
        g.drawOval(row, col, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(row , col, 40, 40);
    }

}
