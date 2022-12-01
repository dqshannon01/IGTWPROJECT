import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimezoneFrame extends JFrame implements ActionListener
{
    JButton backButton,homeButton;
    JComboBox comboBox;
    public static JPanel jPanel = new JPanel();

    public TimezoneFrame()
    {
        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Time Zones",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        String timeZones[]=new String[Timezones.timezoneList.size()];

        for (int i=0;i<timeZones.length;i++)
        {
            timeZones[i]=Timezones.timezoneList.get(i).getTimeZoneName();
            System.out.println(Timezones.timezoneList.get(i).getTimeZoneName());
        }

        comboBox=new JComboBox(timeZones);
        comboBox.setBounds(50,100,200,30);
        comboBox.addActionListener(this);

 
        backButton=new JButton("Back");
        backButton.setBounds(50,250,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,250,80,30);
        homeButton.addActionListener(this);
        homeButton.setFocusable(false);

        jPanel.add(heading);
        jPanel.add(backButton);
        jPanel.add(homeButton);
        jPanel.add(comboBox);

        JLayer<JComponent> layer = new JLayer<>(jPanel, MainFrame.layerUI);

        this.add(layer);

        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);
                                                                                          

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(comboBox))
        {
            System.out.println(comboBox.getSelectedIndex());
            MainFrame.placeIndex=comboBox.getSelectedIndex();
            this.setVisible(false);
        }
              if(e.getSource().equals(backButton))
        {
            this.setVisible(false);
            new ModesFrame();
        }

        if(e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }

    }
}
