/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecs245;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Oscar
 */
public class CreditsPanel extends JPanel implements ActionListener{
    
    JButton backButton;
    JLabel title;
    JLabel name1;
    JLabel name2;
    
    public CreditsPanel(){
        setLayout(null);
        backButton = new JButton("Back");
        backButton.setLocation(50, 50);
        
        title = new JLabel("Credits");
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setForeground(Color.red);
        title.setBounds(200, 20, 200, 100);
        
        name1 = new JLabel("Oscar Zhang, 010639577");
        name1.setFont(new Font("Serif", Font.BOLD, 25));
        name1.setBounds(150, 100, 300, 50);
        
        name2 = new JLabel("Phuoc Ngo, 010948236");
        name2.setFont(new Font("Serif", Font.BOLD, 25));
        name2.setBounds(150, 130, 300, 50);
        
        backButton.setBounds(10, 330, 100, 25);
        backButton.addActionListener(this);
        
        add(backButton);
        add(title);
        add(name1);
        add(name2);
    }

    public void test(MouseEvent e){
        
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
