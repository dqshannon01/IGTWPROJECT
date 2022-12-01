import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AllTimezonesFrame extends JFrame implements ActionListener
{
    JButton backButton,homeButton;

    private JLabel jLabelAuc;
    private JLabel jLabelBei;
    private JLabel jLabelBer;
    private JLabel jLabelCST;
    private JLabel jLabelChi;
    private JLabel jLabelDub;
    private JLabel jLabelEST;
    private JLabel jLabelMDT;
    private JLabel jLabelMos;
    private JLabel jLabelMum;
    private JLabel jLabelPDT;
    private JLabel jLabelRio;
    private JLabel jLabelSin;
    private JLabel jLabelSyd;
    private JLabel jLabelTok;
    private JLabel jLabelUK;
    private JLabel jLabelUTC;
    public static JPanel jPanel;

    public AllTimezonesFrame()
    {
        jPanel=new JPanel();
        jPanel.setLayout(null);

        JLabel heading=new JLabel("Global Times",SwingConstants.CENTER);
        heading.setBounds(50,10,200,50);
        heading.setFont(new Font("",Font.BOLD,24));

        jLabelEST=new JLabel();
        jLabelEST.setBounds(10,50,150,20);
        jPanel.add(jLabelEST);

        jLabelPDT=new JLabel();
        jLabelPDT.setBounds(10,70,150,20);
        jPanel.add(jLabelPDT);

        jLabelMDT=new JLabel();
        jLabelMDT.setBounds(10,90,150,20);
        jPanel.add(jLabelMDT);

        jLabelCST=new JLabel();
        jLabelCST.setBounds(10,110,150,20);
        jPanel.add(jLabelCST);

        jLabelRio=new JLabel();
        jLabelRio.setBounds(10,130,150,20);
        jPanel.add(jLabelRio);

        jLabelUTC=new JLabel();
        jLabelUTC.setBounds(10,150,150,20);
        jPanel.add(jLabelUTC);

        jLabelUK=new JLabel();
        jLabelUK.setBounds(10,170,150,20);
        jPanel.add(jLabelUK);

        jLabelBer=new JLabel();
        jLabelBer.setBounds(10,190,150,20);
        jPanel.add(jLabelBer);

        jLabelMos=new JLabel();
        jLabelMos.setBounds(10,210,150,20);
        jPanel.add(jLabelMos);

        jLabelDub=new JLabel();
        jLabelDub.setBounds(150,50,150,20);
        jPanel.add(jLabelDub);

        jLabelMum=new JLabel();
        jLabelMum.setBounds(150,70,150,20);
        jPanel.add(jLabelMum);

        jLabelSin=new JLabel();
        jLabelSin.setBounds(150,90,150,20);
        jPanel.add(jLabelSin);

        jLabelBei=new JLabel();
        jLabelBei.setBounds(150,110,150,20);
        jPanel.add(jLabelBei);

        jLabelChi=new JLabel();
        jLabelChi.setBounds(150,130,150,20);
        jPanel.add(jLabelChi);

        jLabelTok=new JLabel();
        jLabelTok.setBounds(150,150,150,20);
        jPanel.add(jLabelTok);

        jLabelSyd=new JLabel();
        jLabelSyd.setBounds(150,170,150,20);
        jPanel.add(jLabelSyd);

        jLabelAuc=new JLabel();
        jLabelAuc.setBounds(150,190,150,20);
        jPanel.add(jLabelAuc);

        backButton=new JButton("Back");
        backButton.setBounds(50,240,80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        homeButton=new JButton("Home");
        homeButton.setBounds(170,240,80,30);
        homeButton.addActionListener(this);
        homeButton.setFocusable(false);

        jPanel.add(heading);
        jPanel.add(backButton);
        jPanel.add(homeButton);


        this.add(jPanel);
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
            new ModesFrame();
        }

        if(e.getSource().equals(homeButton))
        {
            this.setVisible(false);
        }
    }

    public JLabel getjLabelAuc() {
        return jLabelAuc;
    }

    public void setjLabelAuc(JLabel jLabelAuc) {
        this.jLabelAuc = jLabelAuc;
    }

    public JLabel getjLabelBei() {
        return jLabelBei;
    }

    public void setjLabelBei(JLabel jLabelBei) {
        this.jLabelBei = jLabelBei;
    }

    public JLabel getjLabelBer() {
        return jLabelBer;
    }

    public void setjLabelBer(JLabel jLabelBer) {
        this.jLabelBer = jLabelBer;
    }

    public JLabel getjLabelCST() {
        return jLabelCST;
    }

    public void setjLabelCST(JLabel jLabelCST) {
        this.jLabelCST = jLabelCST;
    }

    public JLabel getjLabelChi() {
        return jLabelChi;
    }

    public void setjLabelChi(JLabel jLabelChi) {
        this.jLabelChi = jLabelChi;
    }

    public JLabel getjLabelDub() {
        return jLabelDub;
    }

    public void setjLabelDub(JLabel jLabelDub) {
        this.jLabelDub = jLabelDub;
    }

    public JLabel getjLabelEST() {
        return jLabelEST;
    }

    public void setjLabelEST(JLabel jLabelEST) {
        this.jLabelEST = jLabelEST;
    }

    public JLabel getjLabelMDT() {
        return jLabelMDT;
    }

    public void setjLabelMDT(JLabel jLabelMDT) {
        this.jLabelMDT = jLabelMDT;
    }

    public JLabel getjLabelMos() {
        return jLabelMos;
    }

    public void setjLabelMos(JLabel jLabelMos) {
        this.jLabelMos = jLabelMos;
    }

    public JLabel getjLabelMum() {
        return jLabelMum;
    }

    public void setjLabelMum(JLabel jLabelMum) {
        this.jLabelMum = jLabelMum;
    }

    public JLabel getjLabelPDT() {
        return jLabelPDT;
    }

    public void setjLabelPDT(JLabel jLabelPDT) {
        this.jLabelPDT = jLabelPDT;
    }

    public JLabel getjLabelRio() {
        return jLabelRio;
    }

    public void setjLabelRio(JLabel jLabelRio) {
        this.jLabelRio = jLabelRio;
    }

    public JLabel getjLabelSin() {
        return jLabelSin;
    }

    public void setjLabelSin(JLabel jLabelSin) {
        this.jLabelSin = jLabelSin;
    }

    public JLabel getjLabelSyd() {
        return jLabelSyd;
    }

    public void setjLabelSyd(JLabel jLabelSyd) {
        this.jLabelSyd = jLabelSyd;
    }

    public JLabel getjLabelTok() {
        return jLabelTok;
    }

    public void setjLabelTok(JLabel jLabelTok) {
        this.jLabelTok = jLabelTok;
    }

    public JLabel getjLabelUK() {
        return jLabelUK;
    }

    public void setjLabelUK(JLabel jLabelUK) {
        this.jLabelUK = jLabelUK;
    }

    public JLabel getjLabelUTC() {
        return jLabelUTC;
    }

    public void setjLabelUTC(JLabel jLabelUTC) {
        this.jLabelUTC = jLabelUTC;
    }
}
