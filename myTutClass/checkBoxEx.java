
package javaIdt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkBoxEx {

    checkBoxEx(){
        Frame frame = new Frame("Examples of today");
        JButton btn = new JButton("Show");
        
        Label label1 = new Label();
        
        label1.setAlignment(JLabel.CENTER);
        label1.setSize(300,100);
        
        btn.setBounds(100, 255, 100, 30);

        // List Example
        List l1 = new List(5);
        l1.setBounds(100, 100, 100, 100);
        
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");
        
//        btn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
        btn.addActionListener((ActionEvent e) -> {
            String data = "The selected is " + l1.getItem(l1.getSelectedIndex());
            data += ", Framework selected is ";
            for (String frame1 : l1.getSelectedItems()) {
                data += frame1 + ".";
            }
            label1.setText(data);
        });
        
//        check.addItemListener(new ItemListener() {
//            public void itemStateChanged() {
//                
//            }
//        });

        // Combobox Example
        String[] country = {"Rwanda" , "DRC", "Burundi" };
        JComboBox combo = new JComboBox(country);
        combo.setBounds(100, 210, 150, 30);
        
        frame.add(label1);
        frame.add(btn);
        frame.add(combo);
        frame.add(l1);
        frame.add(check);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new checkBoxEx();
    }
    
}
