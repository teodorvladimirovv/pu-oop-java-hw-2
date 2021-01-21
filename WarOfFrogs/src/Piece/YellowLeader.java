package Piece;

import java.awt.*;

public class YellowLeader {
    private int row;
    private int col;
    /**
     * Constructor for a yellow leader
     *
     * @param row Horizontal position of the gameBoard
     * @param col Vertical position of the gameBoard
     */
    public YellowLeader(int row, int col){
        this.row = row;
        this.col = col;
    }

    /**
     * Method for visualising the yellowLeader on the gameBoard
     *
     * @param g Graphics base class
     */
    public void render(Graphics g){

        g.setColor(Color.YELLOW);
        g.drawRect(row,col,50,50);
        g.setColor(Color.YELLOW);
        g.fillRect(row,col,50,50);

    }
}
