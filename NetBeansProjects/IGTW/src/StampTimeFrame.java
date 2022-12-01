import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StampTimeFrame extends JFrame implements ActionListener
{
    public static String time,date;
    JTextArea noteField;
    JButton stampLogButton,backButton,stampButton,homeButton;
    public static JPanel jPanel=new JPanel();
    public StampTimeFrame()
    {

        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Stamp Time",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        JLabel timeLabel=new JLabel(time,SwingConstants.CENTER);
        timeLabel.setBounds(50,55,200,50);
        timeLabel.setFont(new Font("",Font.BOLD,24));

        JLabel label=new JLabel("Notes: ");
        label.setBounds(75,115,75,25);

        noteField= new JTextArea();
        noteField.setBounds(120,115,150,75);

        stampButton=new JButton("Stamp");
        stampButton.setBounds(20,200,80,30);
        stampButton.setFocusable(false);
        stampButton.addActionListener(this);

        stampLogButton=new JButton("View Stamp Log");
        stampLogButton.setBounds(175,200,130,30);
        stampLogButton.setFocusable(false);
        stampLogButton.addActionListener(this);

        backButton=new JButton("Back");
        backButton.setBounds(50,250,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,250,80,30);
        homeButton.setFocusable(false);
        homeButton.addActionListener(this);

        jPanel.add(heading);
        jPanel.add(timeLabel);
        jPanel.add(label);
        jPanel.add(noteField);
        jPanel.add(stampButton);
        jPanel.add(stampLogButton);
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
        if(e.getSource().equals(stampButton))
        {
            if(!noteField.getText().isEmpty())
            {
                Stamp stamp=new Stamp(time,date,noteField.getText());
                Stamp.stamps.add(stamp);
                this.setVisible(false);
            }
            else
            {

                JOptionPane.showMessageDialog(this,"Please add the note for time stamp.","Input error",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource().equals(stampLogButton))
        {
            this.setVisible(false);
            new StampLogFrame();
        }

        if(e.getSource().equals(backButton) || e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }
    }
}
