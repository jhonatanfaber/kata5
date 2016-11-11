package kata5.ui.swing;

import java.awt.HeadlessException;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import kata5.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    public SwingMoneyDisplay(){
        add(amount());
        add(currency());
    }
    
    private JLabel amount(){
        JLabel jLabel = new JLabel("500");
        return jLabel;
    }
    
    private JLabel currency(){
        JLabel jLabel = new JLabel("€");
        return jLabel;
    }
    
    
}
