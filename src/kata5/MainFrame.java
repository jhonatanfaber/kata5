package kata5;

import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import kata5.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setMenuBar(menuBar());
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        add(moneyDisplay());
        add(moneyDisplay());
        setVisible(true);
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(OperationMenu());
        menuBar.add(OperationMenu());
        menuBar.add(OperationMenu());
        return menuBar;
                
    }

    private Menu OperationMenu() {
        Menu menu = new Menu("Operations");
        menu.add(calculateMenuItem());
        return menu;
        
    }

    private MenuItem calculateMenuItem() {
        MenuItem menuItem = new MenuItem("Calculate");
        menuItem.addActionListener(executeCalculate());
        return menuItem;
        
    }

    private ActionListener executeCalculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Execute calculate...");
            }
        };
    }
    
    private JPanel moneyDisplay(){
        SwingMoneyDisplay panel = new SwingMoneyDisplay();
        return panel;
    }
    
    
}
