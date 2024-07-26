import java.awt.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Interface extends JFrame implements ActionListener {
    private JTextField InputCode;
    private JTextField InputAmount;

    JLabel ResultLabel;
    JButton ResetButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interface frame = new Interface();
                    frame.setVisible(true);
                    frame.setSize(900, 650);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /*
     * Create the frame.
     */

    public Interface() {
        setResizable(false);
        getContentPane().setForeground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(240, 240, 240));
        getContentPane().setFont(new Font("", Font.BOLD, 51));
        getContentPane().setLayout(null);

        JLabel LabelWelcome = new JLabel(" Currency Coverter System");
        LabelWelcome.setBounds(151, 11, 622, 105);
        LabelWelcome.setForeground(new Color(255, 105, 180));
        LabelWelcome.setBackground(Color.GREEN);
        LabelWelcome.setFont(new Font("Thoma 22 bold", Font.BOLD, 38));
        getContentPane().add(LabelWelcome);

        JLabel Label_1 = new JLabel("1:Rupees ");
        Label_1.setBounds(46, 101, 95, 30);
        Label_1.setForeground(new Color(0, 204, 204));
        Label_1.setBackground(SystemColor.menu);
        Label_1.setFont(new Font("Arial", Font.BOLD, 18));
        getContentPane().add(Label_1);

        JLabel Label_2 = new JLabel("2:Dollar ");
        Label_2.setForeground(new Color(0, 204, 204));
        Label_2.setFont(new Font("Arial", Font.BOLD, 18));
        Label_2.setBounds(46, 131, 89, 30);
        getContentPane().add(Label_2);

        JLabel Label_3 = new JLabel("3:Pound ");
        Label_3.setFont(new Font("Arial", Font.BOLD, 18));
        Label_3.setForeground(new Color(0, 204, 204));
        Label_3.setBounds(46, 155, 85, 40);
        getContentPane().add(Label_3);

        JLabel Label_4 = new JLabel("4:Euro ");
        Label_4.setForeground(new Color(0, 204, 204));
        Label_4.setFont(new Font("Arial", Font.BOLD, 18));
        Label_4.setBounds(46, 191, 102, 30);
        getContentPane().add(Label_4);

        JLabel Label_5 = new JLabel("5:Kuwaiti dinar");
        Label_5.setFont(new Font("Arial", Font.BOLD, 18));
        Label_5.setForeground(new Color(0, 204, 204));
        Label_5.setBounds(46, 218, 161, 31);
        getContentPane().add(Label_5);

        JLabel LabelCode = new JLabel("Enter Currency Code :");
        LabelCode.setBounds(10, 286, 216, 43);
        LabelCode.setForeground(new Color(0, 0, 0));
        LabelCode.setFont(new Font("Arial Black", Font.PLAIN, 16));
        getContentPane().add(LabelCode);

        JLabel LabelAmount = new JLabel("Enter Amount:");
        LabelAmount.setFont(new Font("Arial Black", Font.PLAIN, 17));
        LabelAmount.setForeground(new Color(0, 0, 0));
        LabelAmount.setBounds(20, 332, 161, 52);
        getContentPane().add(LabelAmount);

        InputCode = new JTextField();
        InputCode.setBounds(215, 294, 179, 30);
        InputCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
        InputCode.setBackground(new Color(204, 255, 255));
        InputCode.setForeground(new Color(0, 0, 0));
        getContentPane().add(InputCode);
        InputCode.setColumns(5);

        InputAmount = new JTextField();
        InputAmount.setBounds(215, 349, 179, 30);
        InputAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
        InputAmount.setBackground(new Color(204, 255, 255));
        InputAmount.setForeground(new Color(0, 0, 0));
        InputAmount.setColumns(5);
        getContentPane().add(InputAmount);

        JButton ConvertButton = new JButton("Convert");
        ConvertButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String conversionResult = "";
                int choice = Integer.parseInt(InputCode.getText()); // For Converting String data type to Integer
                double rupee, dollar, pound, code, euro, KWD;

                if (choice == 1) {
                    rupee = Double.parseDouble(InputAmount.getText()); // For Converting String data type to Double
                    dollar = rupee / 75;
                    conversionResult = "<html><p>Dollar : " + dollar + "</p><br />";
                    pound = rupee / 101;
                    conversionResult += "<p>Pound : " + (pound) + "</p><br />";
                    euro = rupee / 84;
                    conversionResult += "<p>Euro : " + (euro) + "</p><br />";
                    KWD = rupee / 250;
                    conversionResult += "<p>Kuwaiti dinar : " + (KWD) + "</p></html>";
                } else if (choice == 2) {
                    dollar = Double.parseDouble(InputAmount.getText());
                    rupee = dollar * 75;
                    conversionResult = "<html><p>Rupees : " + (rupee) + "</p><br />";
                    pound = dollar * 0.72;
                    conversionResult += "<p>Pound : " + (pound) + "</p><br />";
                    euro = dollar * 0.88;
                    conversionResult += "<p>Euro : " + (euro) + "</p><br />";
                    KWD = dollar * 0.30;
                    conversionResult += "<p>Kuwaiti dinar : " + (KWD) + "</p></html>";
                } else if (choice == 3) {
                    pound = Double.parseDouble(InputAmount.getText());
                    rupee = pound * 101;
                    conversionResult = "<html><p>Rupees : " + (rupee) + "</p><br />";
                    dollar = pound * 1.35;
                    conversionResult += "<p>Dollar : " + (dollar) + "</p><br />";
                    euro = pound * 1.36;
                    conversionResult += "<p>Euro : " + (euro) + "</p><br />";
                    KWD = pound * 0.4;
                    conversionResult += "<p>Kuwaiti dinar : " + (KWD) + "</p></html>";
                } else if (choice == 4) {
                    euro = Double.parseDouble(InputAmount.getText());
                    rupee = euro * 84;
                    conversionResult = "<html><p>Rupees : " + (rupee) + "</p><br />";
                    dollar = euro * 1.12;
                    conversionResult += "<p>Dollar : " + (dollar) + "</p><br />";
                    pound = euro * 0.73;
                    conversionResult += "<p>Pound : " + (pound) + "</p><br />";
                    KWD = euro * 0.34;
                    conversionResult += "<p>Kuwaiti dinar : " + (KWD) + "</p></html>";
                } else if (choice == 5) {
                    KWD = Double.parseDouble(InputAmount.getText());
                    rupee = KWD * 250;
                    conversionResult = "<html><p>Rupees : " + (rupee) + "</p><br />";
                    dollar = KWD * 3.30;
                    conversionResult += "<p>Dollar : " + (dollar) + "</p><br />";
                    pound = KWD * 2.5;
                    conversionResult += "<p>Pound : " + (pound) + "</p><br />";
                    euro = KWD * 2.94;
                    conversionResult += "<p>Euro : " + (euro) + "</p></html>";
                } else
                    conversionResult = "You have Entered Invalid Code.......❌❌❌!";
                ResultLabel.setText(conversionResult);
            }
        });
        ConvertButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        ConvertButton.setForeground(new Color(220, 20, 60));
        ConvertButton.setBackground(new Color(102, 255, 255));
        ConvertButton.setBounds(666, 349, 95, 35);
        getContentPane().add(ConvertButton);

        ResultLabel = new JLabel();
        ResultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        ResultLabel.setForeground(new Color(0, 206, 209));
        ResultLabel.setBounds(212, 329, 538, 324);
        getContentPane().add(ResultLabel);

        JButton ResetButton = new JButton("Reset");
        ResetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ResetButton) {
                    InputCode.setText(null);
                    InputAmount.setText(null);
                    ResultLabel.setText(null);
                }
            }
        });
        ResetButton.setBackground(new Color(102, 255, 255));
        ResetButton.setForeground(new Color(204, 51, 51));
        ResetButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        ResetButton.setBounds(782, 349, 95, 35);
        getContentPane().add(ResetButton);

        setBackground(Color.WHITE);
        setFont(null);
        setForeground(Color.LIGHT_GRAY);
        setTitle("Cuurency Converter");

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ResetButton) {
            InputCode.setText(null);
            InputAmount.setText(null);
            ResultLabel.setText(null);

        }
    }
}