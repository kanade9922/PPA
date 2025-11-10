import javax.swing.*;
import java.awt.event.*;

class MarvellousCalculator implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton badd, bsub, bmul, bdiv;
    JTextField tno1, tno2, tresult;
    JLabel no1label, no2label, resultlabel;

    public MarvellousCalculator(String title, int width, int height)
    {
        fobj = new JFrame("title");

        // Labels
        no1label = new JLabel("Number 1");
        no1label.setBounds(50, 50, 100, 30);

        no2label = new JLabel("Number 2");
        no2label.setBounds(150, 100, 150, 30);

        resultlabel = new JLabel("Result");
        resultlabel.setBounds(50, 150, 100, 30);

        // TextFields
        tno1 = new JTextField();
        tno1.setBounds(150, 50, 150, 30);

        tno2 = new JTextField();
        tno2.setBounds(150, 100, 150, 30);

        tresult = new JTextField();
        tresult.setBounds(150, 150, 150, 30);

        // Buttons
        badd = new JButton("ADD");
        badd.setBounds(30, 220, 80, 30);

        bsub = new JButton("SUB");
        bsub.setBounds(120, 220, 80, 30);

        bmul = new JButton("MUL");
        bmul.setBounds(210, 220, 80, 30);

        bdiv = new JButton("DIV");
        bdiv.setBounds(300, 220, 80, 30);

        // Add components to frame
        fobj.add(no1label);
        fobj.add(no2label);
        fobj.add(resultlabel);
        fobj.add(tno1);
        fobj.add(tno2);
        fobj.add(tresult);
        fobj.add(badd);
        fobj.add(bsub);
        fobj.add(bmul);
        fobj.add(bdiv);

        // Register event handlers
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);

        // Frame setup
        fobj.setLayout(null);
        fobj.setSize(width, height);
        
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        // No logic — only layout reference
    }
}

class CalculatorFrameFinal
{
    public static void main(String A[])
    {
        MarvellousCalculator mobj = new MarvellousCalculator("Calculator Layout", 400, 320);
    }
}
