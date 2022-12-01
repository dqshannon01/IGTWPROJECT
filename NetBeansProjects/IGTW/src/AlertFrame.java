
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;


public class AlertFrame extends JFrame implements ActionListener
{
    JButton backButton,homeButton,saveButton;
    JTextField dateField,timeField,textField;
    public static JPanel jPanel=new JPanel();

    public AlertFrame()
    {
        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Alerts",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        JLabel label=new JLabel("New Alert",SwingConstants.CENTER);
        label.setBounds(50,55,200,50);
        label.setFont(new Font("",Font.BOLD,16));


        textField=new JTextField();
        textField.setBounds(50,100,200,30);

        JLabel dateLabel=new JLabel("Date: ");
        dateLabel.setBounds(50,140,80,35);

        dateField=new JTextField();
        dateField.setBounds(90,140,100,35);

        JLabel dateFormat= new JLabel("MM/DD/YYYY");
        dateFormat.setBounds(200,140,100,35);

        JLabel timeLabel=new JLabel("Time: ");
        timeLabel.setBounds(50,180,80,35);

        timeField=new JTextField();
        timeField.setBounds(90,180,100,35);

        JLabel timeFormat= new JLabel("HH:MM");
        timeFormat.setBounds(200,180,100,35);

        saveButton=new JButton("Save");
        saveButton.setBounds(115,215,80,30);
        saveButton.setFocusable(false);
        saveButton.addActionListener(this);

        backButton=new JButton("Back");
        backButton.setBounds(50,250,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,250,80,30);
        homeButton.setFocusable(false);
        homeButton.addActionListener(this);

        jPanel.add(heading);
        jPanel.add(label);
        jPanel.add(backButton);
        jPanel.add(homeButton);
        jPanel.add(textField);
        jPanel.add(dateLabel);
        jPanel.add(dateField);
        jPanel.add(timeLabel);
        jPanel.add(timeField);
        jPanel.add(dateFormat);
        jPanel.add(timeFormat);
        jPanel.add(saveButton);

        JLayer<JComponent> layer = new JLayer<>(jPanel, MainFrame.layerUI);

        this.add(layer);
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(saveButton))
        {
            if(!textField.getText().isEmpty() && !dateField.getText().isEmpty() && !timeField.getText().isEmpty())
            {
                String date[]=dateField.getText().split("/");
                if(date.length==3)
                {
                    int days=Integer.parseInt(date[0]);
                    int month=Integer.parseInt(date[1]);
                    int year=Integer.parseInt(date[2]);
                    if((days>0 && days<=31) && (month>0 && month<=12) && (date[2].length()==4))
                    {
                        String time[]=timeField.getText().split(":");
                        if(time.length==2)
                        {
                            int hours=Integer.parseInt(time[0]);
                            int minuets=Integer.parseInt(time[1]);
                            if((hours>=0 && hours<=24) && (minuets>=0 && minuets<60))
                            {
                                Alerts alerts=new Alerts(dateField.getText(),hours,minuets,textField.getText());
                                Alerts.alertsList.add(alerts);
                                this.setVisible(false);
                                new ModesFrame();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this,"Please enter time according to format (HH:MM).","Input error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Please enter time according to format (HH:MM).","Input error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please enter date according to format (DD/MM/YYYY).","Input error",JOptionPane.ERROR_MESSAGE);
                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Please enter date according to format (DD/MM/YYYY).","Input error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please fill all fields.","Input error",JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource().equals(backButton))
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
