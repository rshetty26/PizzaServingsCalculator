/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rithv
 */
public class PizzaServingsCalculator extends JFrame {
    private Frame frame;
    private JPanel line2 = new JPanel();
    String size;
    double servings;

    PizzaServingsCalculator() {
        frame = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel title = new JLabel("Pizza Servings Calculator", SwingConstants.CENTER);
        title.setForeground(Color.red);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        JLabel input = new JLabel("Enter the size of the pizza in inches: ");
        line2.add(input);
        final JTextField text = new JTextField(4);
        line2.add(text);
        JButton calculation = new JButton("Calculate Servings");
        final JLabel label = new JLabel("", SwingConstants.CENTER);

        calculation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                size = text.getText();
                servings = Math.pow((Double.parseDouble(size) / 8), 2.0);
                label.setText("A " + size + " inch pizza will serve " + servings + " people");
            }
        }
        );
        frame.add(title);
        frame.add(line2);
        frame.add(calculation);
        frame.add(label);
        frame.setLayout(new GridLayout(4, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pizza Servings Calculator");
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new PizzaServingsCalculator();
        
    }
    
}
