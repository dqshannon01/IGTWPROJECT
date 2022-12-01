import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModesFrame extends JFrame implements ActionListener
{
    JButton setupAlertButton,changeTimeZoneButton,displayTimeZoneButton,backButton,homeButton;
    public static JPanel jPanel = new JPanel();
    public ModesFrame()
    {
        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Modes",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        setupAlertButton=new JButton("Setup Alert");
        setupAlertButton.setBounds(50,80,200,30);
        setupAlertButton.setFocusable(false);
        setupAlertButton.addActionListener(this);

        changeTimeZoneButton=new JButton("Change Time Zone");
        changeTimeZoneButton.setBounds(50,130,200,30);
        changeTimeZoneButton.setFocusable(false);
        changeTimeZoneButton.addActionListener(this);

        displayTimeZoneButton=new JButton("Display All Time Zones");
        displayTimeZoneButton.setBounds(50,180,200,30);
        displayTimeZoneButton.setFocusable(false);
        displayTimeZoneButton.addActionListener(this);

        backButton=new JButton("Back");
        backButton.setBounds(50,250,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,250,80,30);
        homeButton.setFocusable(false);
        homeButton.addActionListener(this);

        jPanel.add(heading);
        jPanel.add(setupAlertButton);
        jPanel.add(changeTimeZoneButton);
        jPanel.add(displayTimeZoneButton);
        jPanel.add(backButton);
        jPanel.add(homeButton);

        JLayer<JComponent> layer = new JLayer<>(jPanel, MainFrame.layerUI);

        this.add(layer);
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(setupAlertButton))
        {
            this.setVisible(false);

            new AlertFrame();
        }
        if(e.getSource().equals(changeTimeZoneButton))
        {
            this.setVisible(false);
            new TimezoneFrame();
        }
        if(e.getSource().equals(displayTimeZoneButton))
        {
            this.setVisible(false);
            MainFrame.frame.setVisible(true);
        }
        if(e.getSource().equals(backButton) || e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }

    }
}
