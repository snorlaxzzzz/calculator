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