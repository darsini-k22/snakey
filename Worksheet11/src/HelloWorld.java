import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    JButton plus;
    JButton minus;
    JButton divide;
    JButton multiply;
    JFrame f;
    JTextArea txt;
    JButton equal;
    JLabel lable;
    double result;

    HelloWorld() {
        JFrame f = new JFrame();
        JLabel lable = new JLabel(String.valueOf(this.result));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton equal = new JButton("=");
        JTextArea txt = new JTextArea();
        txt.setBounds(10, 30, 300, 50);
        plus.setBounds(30, 140, 60, 40);
        plus.setBackground(Color.GREEN);
        minus.setBounds(120, 140, 60, 40);
        minus.setBackground(Color.GREEN);
        divide.setBounds(30, 240, 60, 40);
        divide.setBackground(Color.GREEN);
        multiply.setBounds(120, 240, 60, 40);
        multiply.setBackground(Color.GREEN);
        equal.setBounds(30, 300, 60, 40);
        equal.setBackground(Color.GREEN);
        lable.setBounds(30, 350, 60, 40);
        f.add(txt);
        f.add(plus);
        f.add(minus);
        f.add(divide);
        f.add(multiply);
        f.add(equal);
        f.add(lable);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//
                txt.setText("+");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] expression = txt.getText().split("");
                if(expression[1].equals("+")){
                    result = Double.parseDouble(expression[0]) + Double.parseDouble(expression[2]);
                } else if (expression[1].equals("-")) {
                    result = Double.parseDouble(expression[0]) - Double.parseDouble(expression[2]);
                } else if (expression[1].equals("*")) {
                    result = Double.parseDouble(expression[0]) * Double.parseDouble(expression[2]);
                }
//                else{
//                    result=Double.parseDouble(expression[0]) / Double.parseDouble(expression[2]);
//                }
                 else if (expression[1].equals("/")) {
                    result=Double.parseDouble(expression[0])/ Double.parseDouble(expression[2]);
                }

                System.out.println(result);
            }
        });
    }


    public static void main(String[] args) {
        new HelloWorld();
    }
}

