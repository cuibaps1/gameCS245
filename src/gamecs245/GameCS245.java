
package gamecs245;

import javax.swing.SwingUtilities;


/**
 *
 * @author ozhang
 */
public class GameCS245 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View();
            }
        });
       // View test = new View();
        //test.setVisible(true);
    }
    
}
