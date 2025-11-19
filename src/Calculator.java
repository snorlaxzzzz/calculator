import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
}
 if (e.getSource() == this.piButton) {
        this.textfield.setText(String.valueOf(Math.PI));
        }

        if (e.getSource() == this.cosButton || e.getSource() == this.sinButton || e.getSource() == this.tanButton || e.getSource() == this.logButton || e.getSource() == this.sqrtButton) {
        try {
double num = Double.parseDouble(this.textfield.getText());
double result = (double)0.0F;
String command = e.getActionCommand();
                if (command.equals("cos")) {
result = Math.cos(Math.toRadians(num));
        } else if (command.equals("sin")) {
result = Math.sin(Math.toRadians(num));
        } else if (command.equals("tan")) {
result = Math.tan(Math.toRadians(num));
        } else if (command.equals("log")) {
        if (!(num > (double)0.0F)) {
        this.textfield.setText("Error (Log Domain)");
                        return;
                                }

result = Math.log10(num);
                } else if (command.equals("sqrt")) {
        if (!(num >= (double)0.0F)) {
        this.textfield.setText("Error negative root");
                        return;
                                }

result = Math.sqrt(num);
                }

                        this.textfield.setText(String.valueOf(result));
        } catch (NumberFormatException var10) {
        this.textfield.setText("Error");
            }
                    }//

if (e.getSource() == this.equButton) {
        try {
        this.num2 = Double.parseDouble(this.textfield.getText());
        switch (this.operator) {
        case '*':
        this.result = this.num1 * this.num2;
                        break;
                                case '+':
                                this.result = this.num1 + this.num2;
                        break;
                                case '-':
                                this.result = this.num1 - this.num2;
                        break;
                                case '/':
                                if (this.num2 == (double)0.0F) {
        this.textfield.setText("Error (divided by 0");
                            return;
                                    }

                                    this.result = this.num1 / this.num2;
                        break;
                                case '^':
                                this.result = Math.pow(this.num1, this.num2);
                }

                        this.textfield.setText(String.valueOf(this.result));
        this.num1 = this.result;
            } catch (NumberFormatException var8) {
        this.textfield.setText("Error");
            } catch (ArithmeticException var9) {
        this.textfield.setText("Error");
            }
                    }//
Calculator() {
    this.frame.setDefaultCloseOperation(3);
    this.frame.setSize(450, 600);
    this.frame.setLayout((LayoutManager)null);
    this.textfield = new JTextField();
    this.textfield.setBounds(20, 20, 395, 50);
    this.textfield.setFont(this.myFont);
    this.textfield.setEditable(false);
    this.addButton = new JButton("+");
    this.subButton = new JButton("-");
    this.mulButton = new JButton("*");
    this.divButton = new JButton("/");
    this.decButton = new JButton(".");
    this.equButton = new JButton("=");
    this.delButton = new JButton("Del");
    this.clrButton = new JButton("Clr");
    this.negButton = new JButton("(-)");
    this.cosButton = new JButton("cos");
    this.sinButton = new JButton("sin");
    this.tanButton = new JButton("tan");
    this.logButton = new JButton("log");
    this.piButton = new JButton("π");
    this.sqrtButton = new JButton("sqrt");
    this.powButton = new JButton("^");
    this.functionButtons[0] = this.addButton;
    this.functionButtons[1] = this.subButton;
    this.functionButtons[2] = this.mulButton;
    this.functionButtons[3] = this.divButton;
    this.functionButtons[4] = this.decButton;
    this.functionButtons[5] = this.equButton;
    this.functionButtons[6] = this.delButton; //