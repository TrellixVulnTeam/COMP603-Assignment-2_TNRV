package comp603.project1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener{

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    
public GUI(){
    
    
frame = new JFrame();

JButton button = new JButton("Press to Start");
button.addActionListener(this);

label= new JLabel("Number of clicks: 0");

panel = new JPanel();
panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
panel.setLayout(new GridLayout(0,1));
panel.add(button);
panel.add(label);

frame.add(panel,BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Welcome To The Dungeons and Dragons Character Creator");
frame.pack();
frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



    

