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


public class Calculator implements ActionListener {
    JFrame frame = new JFrame("Scientific Calculator");
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[16];
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton decButton;
    JButton equButton;
    JButton delButton;
    JButton clrButton;
    JButton negButton;
    JButton cosButton;
    JButton sinButton;
    JButton tanButton;
    JButton logButton;
    JButton piButton;
    JButton sqrtButton;
    JButton powButton;
    JPanel panel;
    Font myFont = new Font("Ink Free", 1, 20);
    double num1 = (double)0.0F;
    double num2 = (double)0.0F;
    double result = (double)0.0F;
    char operator;//

public class Calculator {
}
this.panel.add(this.piButton);
        this.panel.add(this.sqrtButton);
        this.panel.add(this.powButton);
        this.panel.add(this.delButton);
        this.panel.add(this.clrButton);
        this.panel.add(this.divButton);
        this.panel.add(this.numberButtons[7]);
        this.panel.add(this.numberButtons[8]);
        this.panel.add(this.numberButtons[9]);
        this.panel.add(this.mulButton);
        this.panel.add(this.negButton);
        this.panel.add(this.numberButtons[4]);
        this.panel.add(this.numberButtons[5]);
        this.panel.add(this.numberButtons[6]);
        this.panel.add(this.subButton);
        this.panel.add(this.addButton);
        this.panel.add(this.numberButtons[0]);
        this.panel.add(this.numberButtons[1]);
        this.panel.add(this.numberButtons[2]);
        this.panel.add(this.numberButtons[3]);
        this.panel.add(this.decButton);
        this.frame.add(this.panel);
        this.frame.add(this.textfield);
        this.equButton.setBounds(20, 490, 395, 50);
        this.frame.add(this.equButton);
        this.frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; ++i) {
            if (e.getSource() == this.numberButtons[i]) {
                this.textfield.setText(this.textfield.getText().concat(String.valueOf(i)));
            }
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
