import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogFrame extends JFrame implements ActionListener
{
    JButton backButton,homeButton;
    String date,time,note;
    public static JPanel jPanel = new JPanel();
    public LogFrame(String date,String time,String note)
    {
        this.date=date;
        this.time=time;
        this.note=note;
        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Log",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        JLabel dateLabel=new JLabel(date,SwingConstants.CENTER);
        dateLabel.setBounds(50,60,200,25);

        JLabel timeLabel=new JLabel(time,SwingConstants.CENTER);
        timeLabel.setBounds(50,85,200,25);

        JLabel noteLabel=new JLabel();
        noteLabel.setText("<html>"+note+"</html>");
        noteLabel.setBounds(50,110,200,100);


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
        jPanel.add(dateLabel);
        jPanel.add(noteLabel);
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
        if(e.getSource().equals(backButton))
        {
            this.setVisible(false);
            new StampLogFrame();
        }
        if(e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }
    }
}
