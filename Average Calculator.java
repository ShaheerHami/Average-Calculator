/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamishaheerguipractice;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author 333677854
 */
public class AverageCalculator extends Applet implements ActionListener{
    //The Main for the GUI is known as init
    JLabel lblWelcome; // setting up / declaring the labels and variables
    JLabel lblSteps;
    JLabel lblMark1;
    JTextField txtMark1;
    JLabel lblMark2;
    JTextField txtMark2;
    JLabel lblMark3;
    JTextField txtMark3;
    JLabel lblMark4;
    JTextField txtMark4;
    JButton btnEnter;
    JLabel lblOutput; // this is the output label
    public void init(){
        //Seeting up te frame
        resize(500,500);
        setLayout(null);
        //Changing the color of the background
        setBackground(Color.YELLOW);
        
        lblWelcome = new JLabel(); //Let's add a label to the form
        //setting the text proprty for the label
        lblWelcome.setText("Course Mark Average Calculator");
        //we have to add the label into the Applet
        lblWelcome.setSize(200,50);//How big is the label is
        lblWelcome.setLocation(150,0);//Where
        //the label should go
        add(lblWelcome);
        
        lblSteps = new JLabel(); // label for instructions
        lblSteps.setText("Enter in your 4 course marks and click calculate average.");
        lblSteps.setSize(400,100);
        lblSteps.setLocation(75,30);
        add(lblSteps);
        
        lblMark1 = new JLabel();
        lblMark1.setText("Course Mark 1: ");
        lblMark1.setSize(200,30);
        lblMark1.setLocation(50,100);
        add(lblMark1);
        txtMark1 = new JTextField();
        txtMark1.setSize(200,30);
        txtMark1.setLocation(200,100);
        add(txtMark1);
        
        lblMark2 = new JLabel(); 
        lblMark2.setText("Course Mark 2: ");
        lblMark2.setSize(200,30);
        lblMark2.setLocation(50,150);
        add(lblMark2);
        txtMark2 = new JTextField();
        txtMark2.setSize(200,30);
        txtMark2.setLocation(200,150);
        add(txtMark2);
        
        lblMark3 = new JLabel(); 
        lblMark3.setText("Course Mark 3: ");
        lblMark3.setSize(200,30);
        lblMark3.setLocation(50,200);
        add(lblMark3);
        txtMark3 = new JTextField();
        txtMark3.setSize(200,30);
        txtMark3.setLocation(200,200);
        add(txtMark3);
        
        lblMark4 = new JLabel(); 
        lblMark4.setText("Course Mark 4: ");
        lblMark4.setSize(200,30);
        lblMark4.setLocation(50,250);
        add(lblMark4);
        txtMark4 = new JTextField();
        txtMark4.setSize(200,30);
        txtMark4.setLocation(200,250);
        add(txtMark4);
        
        
        btnEnter = new JButton(); //Adding Button
        btnEnter.setText("Calculate Average");
        btnEnter.setSize(200, 25);
        btnEnter.setLocation(150, 300);
        add(btnEnter);
        //Let the button talk to the program
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);
        
        
        lblOutput = new JLabel(); //adding the output label
        lblOutput.setText("Average");
        lblOutput.setSize(200, 30);
        lblOutput.setLocation(200, 375);
        add(lblOutput);

    }
    //here we are going to add a code that will listen to
    //action

    public void actionPerformed (ActionEvent e){
        if(e.getActionCommand().equals("ENTER")){
            //Now I can confirm that the enter button is clicked
            double dblMark1 = Double.parseDouble(txtMark1.getText()); // converting the text received from the textField into a double value
            double dblMark2 = Double.parseDouble(txtMark2.getText());
            double dblMark3 = Double.parseDouble(txtMark3.getText());
            double dblMark4 = Double.parseDouble(txtMark4.getText());
            double dblAnswer = (dblMark1 + dblMark2 + dblMark3 + dblMark4) / 4; // finding the average of all the double values
            lblOutput.setText(String.valueOf(dblAnswer) + "%");
        }
    }
    
}
