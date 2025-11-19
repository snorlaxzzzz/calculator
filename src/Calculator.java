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