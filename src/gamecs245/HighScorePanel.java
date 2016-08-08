/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecs245;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author ozhang
 */
public class HighScorePanel extends JPanel implements ActionListener {

    JButton backButton;
    JLabel title;
    JLabel name1;
    JLabel name2;
    JLabel name3;
    
    public HighScorePanel(){
        
        setLayout(null);
        
        title = new JLabel("Highscore");
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setForeground(Color.red);
        title.setBounds(200, 20, 400, 100);
        
        name1 = new JLabel("ABC 000");
        name1.setFont(new Font("Serif", Font.BOLD, 25));
        name1.setBounds(250, 100, 300, 50);
        
        name2 = new JLabel("ABC 000");
        name2.setFont(new Font("Serif", Font.BOLD, 25));
        name2.setBounds(250, 130, 300, 50);
        
        name3 = new JLabel("ABC 000");
        name3.setFont(new Font("Serif", Font.BOLD, 25));
        name3.setBounds(250, 160, 300, 50);
        
        backButton = new JButton("Back");
        
        backButton.setBounds(10, 330, 100, 25);
        backButton.addActionListener(this);
        
        add(backButton);
        add(title);
        add(name1);
        add(name2);
        add(name3);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new MainMenuPanel());
        topFrame.repaint();
        topFrame.pack();
    }
    
}
