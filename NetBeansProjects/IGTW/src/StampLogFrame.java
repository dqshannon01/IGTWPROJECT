import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StampLogFrame extends JFrame implements ActionListener
{
    JButton backButton,expandButton,homeButton;

    JTable table;
    public static JPanel jPanel = new JPanel();
    public StampLogFrame()
    {

        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Stamp Time",SwingConstants.CENTER);
        heading.setBounds(50,20,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        JScrollPane jScrollPane=new JScrollPane();


        table=new JTable();
        table.setModel(new LogTable(Stamp.stamps));
        jScrollPane.setViewportView(table);
        jScrollPane.setBounds(25,75,250,150);

        expandButton=new JButton("Expand");
        expandButton.setBounds(175,225,100,30);
        expandButton.setFocusable(false);
        expandButton.addActionListener(this);

        backButton=new JButton("Back");
        backButton.setBounds(50,250,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,250,80,30);
        homeButton.addActionListener(this);
        homeButton.setFocusable(false);

        jPanel.add(heading);
        jPanel.add(jScrollPane);
        jPanel.add(expandButton);
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
        if(e.getSource().equals(expandButton))
        {
            if(table.getSelectedRow()>=0)
            {
                int row=table.getSelectedRow();
                this.setVisible(false);
                new LogFrame(table.getValueAt(row,0).toString(),table.getValueAt(row,1).toString(),table.getValueAt(row,2).toString());
                System.out.println(table.getValueAt(row,0)+" "+table.getValueAt(row,1)+" "+ table.getValueAt(row,2));
            }

        }
        if(e.getSource().equals(backButton))
        {
            this.setVisible(false);
            new StampTimeFrame();
        }

        if(e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }
    }
}
