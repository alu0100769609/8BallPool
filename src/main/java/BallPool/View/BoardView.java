package BallPool.View;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import BallPool.Board;

public class BoardView extends JPanel{
    private static final long serialVersionUID = 1L;
    private static final int BOARD_WIDTH = 1000;
    private static final int BOARD_X_POS = 100;
    private static final int BOARD_Y_POS = 200;

    private static final int BOARD_SIZE_LIMIT = 10;

    // ATTRIBUTES
    private Board board;


    // CONSTRUCTORS
    public BoardView() {
        this.board = new Board();
        this.board.setPosX(BOARD_X_POS);
        this.board.setPosY(BOARD_Y_POS);
    }

    // METHODS
    private void paintHoles(Graphics2D g2d) {
        for (int i = 0; i < board.getHoles().length; i++) {
            g2d.fillOval(board.getHoles()[i].x, board.getHoles()[i].y,
                    (int) board.getHoleRadio(), (int) board.getHoleRadio());
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;

        board.resize(BOARD_WIDTH);

        g2d.setStroke(new BasicStroke(BOARD_SIZE_LIMIT));
        g2d.drawRect(BOARD_X_POS, BOARD_Y_POS, (int) board.getWidth(), (int) board.getHeight());

        g2d.setStroke(new BasicStroke());
        paintHoles(g2d);
    }


    // TOSTRING

    // GETTERS AND SETTERS

}
