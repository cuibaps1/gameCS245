package gamecs245;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

/**
 *
 * @author Oscar
 */
public class MainMenuPanel extends JPanel implements MouseListener, MouseMotionListener {

    public MainMenuPanel() {
        setBackground(Color.BLACK);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    private boolean isPlay = false;
    private BufferedImage pic = null;
    private BufferedImage play = null;
    private BufferedImage score = null;
    private BufferedImage cena = null;
    private BufferedImage playH = null;
    int x;
    int y;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            pic = ImageIO.read(new File("src\\Credits.png"));
            play = ImageIO.read(new File("src\\PlayS.png"));
            playH = ImageIO.read(new File("src\\PlayN.png"));
            score = ImageIO.read(new File("src\\Highscore.png"));
            cena = ImageIO.read(new File("src\\cena.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(cena, 0, 0, 600, 400, this);
        g.drawImage(pic, 495, 300, 100, 50, this);
        g.drawImage(play, 480, 230, 100, 50, this);
        g.drawImage(score, 480, 275, 100, 50, this);

        if (isPlay == true) {
            g.drawImage(playH, 480, 230, 100, 50, this);
        }

    }

    private void checkPlay() {
        if (x < 480 || x > 580 || y < 230 || y > 280) {
            isPlay = false;
            repaint();
        } else {
            isPlay = true;
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getX() >= 495 && e.getX() <= 595 && e.getY() >= 300 && e.getY() <= 350) {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new CreditsPanel());
            topFrame.repaint();
            topFrame.pack();
        } else if (e.getX() >= 480 && e.getX() <= 580 && e.getY() >= 275 && e.getY() <= 325) {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new HighScorePanel());
            topFrame.repaint();
            topFrame.pack();
        } else if (e.getX() >= 480 && e.getX() <= 580 && e.getY() >= 230 && e.getY() <= 280) {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new GamePanel());
            topFrame.repaint();
            topFrame.pack();
        }

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

    @Override
    public void mouseDragged(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        checkPlay();
    }

}
