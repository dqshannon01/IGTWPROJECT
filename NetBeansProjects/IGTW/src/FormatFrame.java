import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormatFrame extends JFrame implements ActionListener
{
    JButton backButton,homeButton;
    JRadioButton hours24Button,hours12Button;

    public FormatFrame()
    {
        JPanel jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Stamp Time",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        hours12Button=new JRadioButton("12 Hour Clock");
        hours12Button.setBounds(75,75,150,30);
        hours12Button.setFocusable(false);
        hours12Button.addActionListener(this);

        hours24Button=new JRadioButton("24 Hour Clock");
        hours24Button.setBounds(75,115,150,30);
        hours24Button.setFocusable(false);
        hours24Button.addActionListener(this);


        JLayer<JComponent> layer = new JLayer<>(jPanel, MainFrame.layerUI);

        JSlider slider = new JSlider(0, 100);
        slider.setBounds(50,155,200,20);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                MainFrame.brightNessValue = slider.getValue();
                float brightness = (100 - MainFrame.brightNessValue) / 100f;
                MainFrame.layerUI.setBrightness(brightness);
                MainFrame.jPanel.repaint();
                AlertFrame.jPanel.repaint();
                AlertNotificationFrame.jPanel.repaint();
                MainFrame.frame.jPanel.repaint();
                LogFrame.jPanel.repaint();
                ModesFrame.jPanel.repaint();
                StampLogFrame.jPanel.repaint();
                StampTimeFrame.jPanel.repaint();
                TimezoneFrame.jPanel.repaint();
                jPanel.repaint();
            }
        });
        slider.setValue(MainFrame.brightNessValue);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(hours12Button);
        buttonGroup.add(hours24Button);

        if(MainFrame.twelfthHour)
        {
            hours12Button.setSelected(true);
        }
        else
        {
            hours24Button.setSelected(true);
        }

        backButton=new JButton("Back");
        backButton.setBounds(50,200,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,200,80,30);
        homeButton.addActionListener(this);
        homeButton.setFocusable(false);

        jPanel.add(heading);
        jPanel.add(hours12Button);
        jPanel.add(hours24Button);
        jPanel.add(backButton);
        jPanel.add(homeButton);
        jPanel.add(slider);

        this.add(layer);
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(hours12Button))
        {
            MainFrame.twelfthHour=true;
        }

        if(e.getSource().equals(hours24Button))
        {
            MainFrame.twelfthHour=false;
        }



        if(e.getSource().equals(backButton) || e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }

    }
}
