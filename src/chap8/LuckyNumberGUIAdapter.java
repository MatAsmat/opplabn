package Chap8;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class LuckyNumberGUIAdapter extends JFrame {

    private JLabel IbIHeader, IbIResult;
    private Random rd;

    public LuckyNumberGUIAdapter() {
        initGUI();
    }

    public void initGUI() {
        IbIHeader = new JLabel("Lucky Number");
        IbIHeader.setFont(new Font("Tahoma", Font.PLAIN, 40));
        IbIResult = new JLabel("");
        IbIResult.setFont(new Font("Tahoma", Font.PLAIN, 40));
        IbIResult.setForeground(Color.red);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(IbIHeader);
        add(IbIResult);
        IbIHeader.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rd = new Random();
                int randomNum = rd.nextInt(1000);
                IbIResult.setText(String.valueOf(randomNum));
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        }
        );

    }

    public static void main(String[] args) {
        LuckyNumberGUIAdapter frmNum = new LuckyNumberGUIAdapter();
        frmNum.setTitle("Lucky Number");
        frmNum.setSize(300, 200);
        frmNum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmNum.setVisible(true);

    }

}//end class
