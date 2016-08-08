
package gamecs245;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Oscar
 */
public class IntroPanel extends JPanel {
    JLabel title;
    JLabel teamName;
            
            public IntroPanel(){
                setLayout(null);
                
                title = new JLabel("CS245 Quarter Project");
                title.setLocation(50, 100);
                title.setForeground(Color.white);
                title.setFont(new Font("Serif", Font.BOLD, 50));
                
                
                teamName = new JLabel("Team Name: It's...");
                teamName.setForeground(Color.WHITE);
                teamName.setFont(new Font("Serif", Font.BOLD, 25));
                
                title.setBounds(50, 5, 800, 100);
                teamName.setBounds(200, 250, 400, 100);
                
                add(title);
                add(teamName);
                setBackground(Color.BLACK);
                
            }
            
}
