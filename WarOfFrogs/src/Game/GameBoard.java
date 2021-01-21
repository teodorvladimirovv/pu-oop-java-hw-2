package Game;

import Piece.GreenGuard;
import Piece.GreenLeader;
import Piece.YellowGuard;
import Piece.YellowLeader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {

    //private Object selectedPiece;
    //private Object getBoardPiece;

    /**
     * Constructor used for setting the size of the game board
     */
    public GameBoard() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);


    }

    /**
     * Method, used for getting the coordinates of every tile
     *
     * @param e Mouse event class
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        int row = e.getX()/100;
        int col = e.getY()/100;

        System.out.println(row);
        System.out.println(col);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * Method, used for drawing the entities on the screen
     *
     * @param g Graphics base class
     */
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {

                GameTile tile = new GameTile(row * 100, col * 100);
                tile.render(g);

                // Yellow Guards
                for(int r = 0; r < 4; r++){
                    YellowGuard yellowGuard = new YellowGuard((r * 100) + 30,30);
                    yellowGuard.render(g);
                }
                // Yellow Leader
                YellowLeader yellowLeader = new YellowLeader(425,25);
                yellowLeader.render(g);

                // Green Guards
                for(int c = 1; c < 5 ; c++){
                    GreenGuard greenGuard = new GreenGuard((c*100) + 30,430);
                    greenGuard.render(g);
                }
                //Green Leader
                GreenLeader greenLeader = new GreenLeader(25,425);
                greenLeader.render(g);

            }
            g.drawOval(230, 230, 41, 41);
            g.setColor(Color.GRAY);
            g.fillOval(230, 230, 42, 42);

        }
    }


}