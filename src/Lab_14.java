import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Lab_14 extends Frame implements ActionListener{
    TextField textField1, textField2, textFieldSum;
    Lab_14(){
        setTitle("Sum of 2 digits");
        setSize(300,300);
        setLayout(null);
        Label label1 = new Label("a");
        label1.setBounds(100,50,20,20);
        Label label2 = new Label("b");
        label2.setBounds(100,80,20,20);
        Label sum = new Label("sum");
        sum.setBounds(100,110,40,20);
        textField1 = new TextField();
        textField1.setBounds(130, 50,40, 20);
        textField2 = new TextField();
        textField2.setBounds(130, 80,40, 20);
        textFieldSum = new TextField();
        textFieldSum.setBounds(150, 110,40, 20);
        add(label1);
        add(label2);
        add(sum);
        add(textField1);
        add(textField2);
        add(textFieldSum);
        Button calc = new Button("Calculate");
        calc.setBounds(100,140,80,20);
        calc.addActionListener(this);
        Button clear = new Button("Clear");
        clear.setBounds(100,170,80,20);
        clear.addActionListener(this);
        add(calc);
        add(clear);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);}
        });
    }
    public static void main(String[] args) {
        new Lab_14();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Calculate")){
            try{
                int a = Integer.parseInt(textField1.getText());
                System.out.println(a);
                int b = Integer.parseInt(textField2.getText());
                System.out.println(b);
                int sum = a + b;
                System.out.println(sum);
                textFieldSum.setText(Integer.toString(sum));} catch(NumberFormatException nfe){
                textFieldSum.setText("error");}
        }
        else{
            textField1.setText(" ");
            textField2.setText(" ");
            textFieldSum.setText(" ");}
    }
}