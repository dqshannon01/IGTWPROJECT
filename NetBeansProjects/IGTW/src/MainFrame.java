import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener
{

    private JButton stampTimeButton,modesButton,formatButton;
    static JLabel time,date;
    public static int placeIndex=0;
    public static boolean twelfthHour=true;
    public static String currentDate="01/01/2022";
    public  static  AllTimezonesFrame frame;
    public static int brightNessValue=100;
    public static JPanel jPanel;
    public static BrightnessLayer layerUI;
    private static LocalTime timer;

    public MainFrame()
    {
        initComponents();
    }



    public void initComponents()
    {

        jPanel=new JPanel();
        jPanel.setLayout(null);




        time=new JLabel("00:00",SwingConstants.CENTER);
        time.setBounds(50,20,200,50);
        time.setFont(new Font("",Font.BOLD,24));

        date=new JLabel("00/00/0000",SwingConstants.CENTER);
        date.setBounds(50,75,200,25);

        stampTimeButton=new JButton("Stamp Time");
        stampTimeButton.setBounds(75,110,150,30);
        stampTimeButton.setFocusable(false);
        stampTimeButton.addActionListener(this);

        modesButton=new JButton("Modes");
        modesButton.setBounds(75,150,150,30);
        modesButton.setFocusable(false);
        modesButton.addActionListener(this);

        formatButton=new JButton("Format");
        formatButton.setBounds(75,190,150,30);
        formatButton.setFocusable(false);
        formatButton.addActionListener(this);


        jPanel.add(time);
        jPanel.add(date);
        jPanel.add(stampTimeButton);
        jPanel.add(modesButton);
        jPanel.add(formatButton);


        layerUI=new BrightnessLayer();
        JLayer<JComponent> layer = new JLayer<>(jPanel, layerUI);

        float brightness = (100 - brightNessValue) / 100f;
        layerUI.setBrightness(brightness);
        layerUI.setBrightness(brightness);
        //jPanel.repaint();

        this.add(layer);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(300,300);
        this.setVisible(true);


    }

    public static void main(String args[])
    {
        timer=new LocalTime();
        frame=new AllTimezonesFrame();
        frame.setVisible(false);
        new MainFrame();
        timer.start();
        int i=0;
        while (i<1)
        {
            if(twelfthHour)
            {
                time.setText(timer.to12Hour(placeIndex));
                currentDate=String.format("%02d/%02d/%04d", Timezones.timezoneList.get(placeIndex).getMonth(),Timezones.timezoneList.get(placeIndex).getDay(),Timezones.timezoneList.get(placeIndex).getYear());
                date.setText(String.format("%02d/%02d/%04d", Timezones.timezoneList.get(placeIndex).getMonth(),Timezones.timezoneList.get(placeIndex).getDay(),Timezones.timezoneList.get(placeIndex).getYear()));
                frame.getjLabelEST().setText("EST: "+timer.to12Hour(0));
                frame.getjLabelPDT().setText("PDT: "+timer.to12Hour(1));
                frame.getjLabelMDT().setText("MDT: "+timer.to12Hour(2));
                frame.getjLabelCST().setText("CST: "+timer.to12Hour(3));
                frame.getjLabelRio().setText("Rio: "+timer.to12Hour(4));
                frame.getjLabelUTC().setText("UTC: "+timer.to12Hour(5));
                frame.getjLabelUK().setText("UK: "+timer.to12Hour(6));
                frame.getjLabelBer().setText("Ber: "+timer.to12Hour(7));
                frame.getjLabelMos().setText("Mos: "+timer.to12Hour(8));
                frame.getjLabelDub().setText("Dub: "+timer.to12Hour(9));
                frame.getjLabelMum().setText("Mum: "+timer.to12Hour(10));
                frame.getjLabelSin().setText("Sin: "+timer.to12Hour(11));
                frame.getjLabelBei().setText("Bei: "+timer.to12Hour(12));
                frame.getjLabelChi().setText("Chi: "+timer.to12Hour(13));
                frame.getjLabelTok().setText("Tok: "+timer.to12Hour(14));
                frame.getjLabelSyd().setText("Syd: "+timer.to12Hour(15));
                frame.getjLabelAuc().setText("Auc: "+timer.to12Hour(16));


            }
            else
            {
                time.setText(timer.toMilitary(placeIndex));
                frame.getjLabelEST().setText("EST: "+timer.toMilitary(0));
                frame.getjLabelPDT().setText("PDT: "+timer.toMilitary(1));
                frame.getjLabelMDT().setText("MDT: "+timer.toMilitary(2));
                frame.getjLabelCST().setText("CST: "+timer.toMilitary(3));
                frame.getjLabelRio().setText("Rio: "+timer.toMilitary(4));
                frame.getjLabelUTC().setText("UTC: "+timer.toMilitary(5));
                frame.getjLabelUK().setText("UK: "+timer.toMilitary(6));
                frame.getjLabelBer().setText("Ber: "+timer.toMilitary(7));
                frame.getjLabelMos().setText("Mos: "+timer.toMilitary(8));
                frame.getjLabelDub().setText("Dub: "+timer.toMilitary(9));
                frame.getjLabelMum().setText("Mum: "+timer.toMilitary(10));
                frame.getjLabelSin().setText("Sin: "+timer.toMilitary(11));
                frame.getjLabelBei().setText("Bei: "+timer.toMilitary(12));
                frame.getjLabelChi().setText("Chi: "+timer.toMilitary(13));
                frame.getjLabelTok().setText("Tok: "+timer.toMilitary(14));
                frame.getjLabelSyd().setText("Syd: "+timer.toMilitary(15));
                frame.getjLabelAuc().setText("Auc: "+timer.toMilitary(16));
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(stampTimeButton))
        {
            StampTimeFrame.time=time.getText();
            StampTimeFrame.date=date.getText();
            new StampTimeFrame();
        }

        if(e.getSource().equals(modesButton))
        {
            new ModesFrame();
        }

        if (e.getSource().equals(formatButton))
        {
            new FormatFrame();
        }
    }
}
