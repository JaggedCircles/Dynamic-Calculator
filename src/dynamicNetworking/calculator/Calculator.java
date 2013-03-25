package dynamicNetworking.calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;

public class Calculator extends JFrame implements ActionListener {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public Calculator() {
        super("Dynamic Calculator");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        
        JPanel operands = new JPanel(new GridLayout(3, 1));
        JPanel operand1panel = new JPanel(new FlowLayout());
        JPanel operand2panel = new JPanel(new FlowLayout());
        JPanel resultpanel = new JPanel(new FlowLayout());
        
        JPanel operator = new JPanel(new GridLayout(3, 1));
        JPanel spacerabove = new JPanel();
        JPanel operatorpanel = new JPanel(new FlowLayout());
        JPanel spacerbelow = new JPanel();
        
        JTextField operand1entry = new JTextField(10);
        JTextField operand2entry = new JTextField(10);
        JLabel result = new JLabel("Result");
        JTextField operatorentry = new JTextField(1);
        
        operand1panel.add(operand1entry);
        operand2panel.add(operand2entry);
        resultpanel.add(result);
        
        operatorpanel.add(operatorentry);
        
        operands.add(operand1panel);
        operands.add(operand2panel);
        operands.add(resultpanel);
        
        operator.add(spacerabove);
        operator.add(operatorpanel);
        operator.add(spacerbelow);
        
        add(operator);
        add(operands);
        
        pack();
        setVisible(true);
        
        setSize(200, 115);
    }
}
