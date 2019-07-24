package chap8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class LuckyNumberGUIListener extends JFrame implements MouseListener {

    private JLabel lblHeader, lblResult;
    private Random rd;

    public LuckyNumberGUIListener() {
        initGUI();

    }

    public void initGUI() {
        lblHeader = new JLabel("Lucky Number");
        lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblResult = new JLabel("");
        lblResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblResult.setForeground(Color.red);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lblHeader);
        add(lblResult);
        lblHeader.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
       
    }

    @Override
    public void mouseReleased(MouseEvent me) {
      
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        rd = new Random();
        int randomNam = rd.nextInt(1000);
        lblResult.setText(String.valueOf(randomNam));
    }

    @Override
    public void mouseExited(MouseEvent me) {
    lblResult.setText(String.valueOf(""));
    }
      
  
    public static void main(String[] args) {
        LuckyNumberGUIListener frmNum = new LuckyNumberGUIListener();
        frmNum.setTitle("Lucky Number");
        frmNum.setSize(300, 200);
        frmNum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmNum.setVisible(true);

    
    }



}
