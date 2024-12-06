import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {
    
    public static void main(String[] args) throws Exception {
        

        //Creating The GUI
        JFrame f = new JFrame("window");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(320,300);
        


        //Adding Labels and Text fields for user input
        Label lblCount = new Label("Pleas insert the time that you want to close your pc");  // construct the Label component
        f.add(lblCount);

        JTextField hourField = new JTextField(2);
        f.add(new JLabel("Hour (24-hour format):"));
        f.add(hourField);

        JTextField minField = new JTextField(2);
        f.add(new JLabel("minute:"));
        f.add(minField);


        JButton b1 = new JButton("submit");
        f.add(b1);

        JLabel statusLabel = new JLabel("Waiting for input...");
        f.add(statusLabel);
        
        //Read input from user
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int hour = Integer.parseInt(hourField.getText());
                int minute = Integer.parseInt(minField.getText());

                if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
                    statusLabel.setText("Invalid time entered. Try again.");
                    return;
                }

                statusLabel.setText("Shutdown scheduled at " + hour + ":" + minute);

                new Thread(() -> {
                    try {
                        while (true) {
                            LocalTime currentTime = LocalTime.now();
                            if (currentTime.getHour() == hour && currentTime.getMinute() == minute) {
                                Runtime.getRuntime().exec("shutdown -s -f -t 0");
                                break;
                            }
                            Thread.sleep(1000);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }).start();

            
            }
        });



        
        
        f.setVisible(true);
    }
}
