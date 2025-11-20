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
        this.functionButtons[7] = this.clrButton;
        this.functionButtons[8] = this.negButton;
        this.functionButtons[9] = this.cosButton;
        this.functionButtons[10] = this.sinButton;
        this.functionButtons[11] = this.tanButton;
        this.functionButtons[12] = this.logButton;
        this.functionButtons[13] = this.piButton;
        this.functionButtons[14] = this.sqrtButton;
        this.functionButtons[15] = this.powButton;
        Color purpleColor = new Color(128, 0, 128);

             for(int i = 0; i < 16; ++i) {
            this.functionButtons[i].addActionListener(this);
            this.functionButtons[i].setFont(this.myFont);
            this.functionButtons[i].setFocusable(false);
            this.functionButtons[i].setBackground(purpleColor);
            this.functionButtons[i].setForeground(Color.WHITE);
        }

                for(int i = 0; i < 10; ++i) {
        this.numberButtons[i] = new JButton(String.valueOf(i));
        this.numberButtons[i].addActionListener(this);
            this.numberButtons[i].setFont(this.myFont);
            this.numberButtons[i].setFocusable(false);
        }
                this.panel = new JPanel();
        this.panel.setBounds(20, 80, 395, 400);
        this.panel.setLayout(new GridLayout(5, 5, 10, 10));
        this.panel.setBackground(Color.LIGHT_GRAY);
        this.panel.add(this.sinButton);
        this.panel.add(this.cosButton);
        this.panel.add(this.tanButton);
        this.panel.add(this.logButton);
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

                    if (e.getSource() == this.decButton) {
        this.textfield.setText(this.textfield.getText().concat("."));
        }

        if (e.getSource() == this.addButton) {
        this.num1 = Double.parseDouble(this.textfield.getText());
        this.operator = '+';
        this.textfield.setText("");
        }

                if (e.getSource() == this.subButton) {
        this.num1 = Double.parseDouble(this.textfield.getText());
        this.operator = '-';
        this.textfield.setText("");
        }

                if (e.getSource() == this.mulButton) {
        this.num1 = Double.parseDouble(this.textfield.getText());
        this.operator = '*';
        this.textfield.setText("");
        }

                if (e.getSource() == this.divButton) {
        this.num1 = Double.parseDouble(this.textfield.getText());
        this.operator = '/';
        this.textfield.setText("");
        }

                if (e.getSource() == this.powButton) {
        this.num1 = Double.parseDouble(this.textfield.getText());
        this.operator = '^';
        this.textfield.setText("");
        }

                    }//
    if (e.getSource() == this.clrButton) {
        this.textfield.setText("");
        this.num1 = (double)0.0F;
        this.num2 = (double)0.0F;
        this.operator = ' ';
    }


    if (e.getSource() == this.delButton) {
        String string = this.textfield.getText();
        if (string.length() > 0) {
            this.textfield.setText(string.substring(0, string.length() - 1));
        }
    }

    if (e.getSource() == this.negButton) {
        try {
            double temp = Double.parseDouble(this.textfield.getText());
            temp *= (double)-1.0F;
            this.textfield.setText(String.valueOf(temp));
        } catch (NumberFormatException var7) {
        }
    }

}
}