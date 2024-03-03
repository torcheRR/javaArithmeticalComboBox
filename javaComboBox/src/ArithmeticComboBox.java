import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticComboBox extends JFrame implements ActionListener {
    ArithmeticComboBox() {
        super(" Arithmetical ComboBox ");
        setSize(485, 100);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        addComponenets();
    }

    private JTextField firstNum, secondNum, result;
    private JComboBox operator;
    private JButton btn;
    private String[] operators = new String[]{"+", "-", "x", "/"};


    private void addComponenets() {
        firstNum = new JTextField();
        firstNum.setBounds(10, 10, 100, 50);
        firstNum.setFont(new Font("Dialog", Font.PLAIN, 24));
        firstNum.setHorizontalAlignment(SwingConstants.CENTER);
        firstNum.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        add(firstNum);

        operator = new JComboBox(operators);
        operator.setFont(new Font("Dialog", Font.PLAIN, 16));
        operator.setBounds(120, 10, 75, 55);
        operator.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(operator);

        secondNum = new JTextField();
        secondNum.setBounds(205, 10, 100, 50);
        secondNum.setFont(new Font("Dialog", Font.PLAIN, 24));
        secondNum.setHorizontalAlignment(SwingConstants.CENTER);
        secondNum.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        add(secondNum);

        btn = new JButton("=");
        btn.setBounds(315, 10, 50, 50);
        btn.setFont(new Font("Dialog", Font.PLAIN, 24));
        btn.setHorizontalAlignment(SwingConstants.CENTER);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setFocusable(false);
        btn.addActionListener(this);
        add(btn);

        result = new JTextField();
        result.setBounds(375, 10, 100, 50);
        result.setFont(new Font("Dialog", Font.PLAIN, 24));
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        result.setFocusable(false);
        add(result);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (operator.getSelectedItem().toString()) {
                case "+":
                    result.setText(String.valueOf((Integer.parseInt(firstNum.getText()) + Integer.parseInt(secondNum.getText()))));
                    break;
                case "-":
                    result.setText(String.valueOf((Integer.parseInt(firstNum.getText()) - Integer.parseInt(secondNum.getText()))));
                    break;
                case "x":
                    result.setText(String.valueOf((Integer.parseInt(firstNum.getText()) * Integer.parseInt(secondNum.getText()))));
                    break;
                case "/":
                    result.setText(String.valueOf((Integer.parseInt(firstNum.getText()) / Integer.parseInt(secondNum.getText()))));
                    break;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}