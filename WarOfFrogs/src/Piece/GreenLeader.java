package Piece;

import java.awt.*;

public class GreenLeader {
    private int row;
    private int col;

    /**
     * Constructor for a green leader
     *
     * @param row Horizontal position of the gameBoard
     * @param col Vertical position of the gameBoard
     */
    public GreenLeader(int row, int col){
        this.row = row;
        this.col = col;
    }

    /**
     * Method for visualising the greenLeader on the gameBoard
     *
     * @param g Graphics base class
     */
    public void render(Graphics g){

        g.setColor(Color.GREEN);
        g.drawRect(row,col,50,50);
        g.setColor(Color.GREEN);
        g.fillRect(row,col,50,50);

    }}
