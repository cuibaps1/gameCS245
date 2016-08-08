/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecs245;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ozhang
 */
public class View extends JFrame {
    
    private Timer timer;
    private int counter = 3;
    private final int delay = 1000;
    
    private MainMenuPanel mainP = new MainMenuPanel();
    private CreditsPanel creditP = new CreditsPanel();
    private IntroPanel introP = new IntroPanel();
    
    public View(){
    
        
        startUp();
        introSwitch();
        
    }
    
    private void startUp(){
        setVisible(true);
        pack();
        setCloseOperation();
        setFrameTitle();
        setLocationRelativeTo(null);
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(600,400);
    }
    
    private void setCloseOperation(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void setFrameTitle(){
        setTitle("CS245 Project");
    }
    
    private void introSwitch(){
        getContentPane().add(introP);
    
        ActionListener action = new ActionListener()
        {   
            @Override
            public void actionPerformed(ActionEvent event)
            {
                if(counter == 0)
                {
                    timer.stop();
                    getContentPane().removeAll();
                    getContentPane().add(mainP);
                    repaint();
                    pack();
                    
                }
                else
                {
                    System.out.println(counter);
                    counter--;
                }
            }
        };

        timer = new Timer(delay, action);
        timer.setInitialDelay(0);
        timer.start();
    }
    
     
    
}
