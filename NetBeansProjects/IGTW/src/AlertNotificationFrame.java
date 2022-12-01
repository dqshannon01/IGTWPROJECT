import javax.swing.*;
import java.awt.*;

public class AlertNotificationFrame extends JFrame
{
    public static JPanel jPanel =new JPanel();
    public AlertNotificationFrame(Alerts alert)
    {
        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Alert",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        JLabel messageLabel=new JLabel();
        messageLabel.setBounds(50,50,200,100);
        messageLabel.setFont(new Font("",Font.BOLD,20));
        messageLabel.setText("<html>"+alert.getNote()+"</html>");


        jPanel.add(heading);
        jPanel.add(messageLabel);

        JLayer<JComponent> layer = new JLayer<>(jPanel, MainFrame.layerUI);

        this.add(layer);
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);
    }
}
