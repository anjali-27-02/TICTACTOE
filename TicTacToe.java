package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test implements ActionListener{
    JFrame jf;
    //JTextField jt;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    int count=0;
    void createFrame(){
        jf=new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jb1=new JButton();
        jb1.setBounds(0,0,100,100);
        jb1.addActionListener(this);
        jf.add(jb1);
        jb2=new JButton();
        jb2.setBounds(100,0,100,100);
        jb2.addActionListener(this);
        jf.add(jb2);
        jb3=new JButton();
        jb3.setBounds(200,0,100,100);
        jb3.addActionListener(this);
        jf.add(jb3);
        jb4=new JButton();
        jb4.setBounds(0,100,100,100);
        jb4.addActionListener(this);
        jf.add(jb4);
        jb5=new JButton();
        jb5.setBounds(100,100,100,100);
        jb5.addActionListener(this);
        jf.add(jb5);
        jb6=new JButton();
        jb6.setBounds(200,100,100,100);
        jb6.addActionListener(this);
        jf.add(jb6);
        jb7=new JButton();
        jb7.setBounds(0,200,100,100);
        jb7.addActionListener(this);
        jf.add(jb7);
        jb8=new JButton();
        jb8.setBounds(100,200,100,100);
        jb8.addActionListener(this);
        jf.add(jb8);
        jb9=new JButton();
        jb9.setBounds(200,200,100,100);
        jb9.addActionListener(this);
        jf.add(jb9);
        jf.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            if (count % 2 == 0) {
                jb1.setText("X");
                jb1.setBackground(Color.gray);

            }
            else{
                jb1.setText("0");
                jb1.setBackground(Color.darkGray);
            }
            jb1.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb2){
            if (count % 2 == 0) {
                jb2.setText("X");
                jb2.setBackground(Color.gray);

            }
            else{
                jb2.setText("0");
                jb2.setBackground(Color.darkGray);
            }
            jb2.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb3){
            if (count % 2 == 0) {
                jb3.setText("X");
                jb3.setBackground(Color.gray);

            }
            else{
                jb3.setText("0");
                jb3.setBackground(Color.darkGray);
            }
            jb3.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb4){
            if (count % 2 == 0) {
                jb4.setText("X");
                jb4.setBackground(Color.gray);

            }
            else{
                jb4.setText("0");
                jb4.setBackground(Color.darkGray);
            }
            jb4.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb5){
            if (count % 2 == 0) {
                jb5.setText("X");
                jb5.setBackground(Color.gray);

            }
            else{
                jb5.setText("0");
                jb5.setBackground(Color.darkGray);
            }
            jb5.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb6){
            if (count % 2 == 0) {
                jb6.setText("X");
                jb6.setBackground(Color.gray);


            }
            else{
                jb6.setText("0");
                jb6.setBackground(Color.darkGray);
            }
            jb6.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb7){
            if (count % 2 == 0) {
                jb7.setText("X");
                jb7.setBackground(Color.gray);

            }
            else{
                jb7.setText("0");
                jb7.setBackground(Color.darkGray);
            }
            jb7.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb8){
            if (count % 2 == 0) {
                jb8.setText("X");
                jb8.setBackground(Color.gray);

            }
            else{
                jb8.setText("0");
                jb8.setBackground(Color.darkGray);
            }
            jb8.setEnabled(false);
            count++;
        }
        else if(e.getSource()==jb9){
            if (count % 2 == 0) {
                jb9.setText("X");
                jb9.setBackground(Color.gray);

            }
            else{
                jb9.setText("0");
                jb9.setBackground(Color.darkGray);
            }
            jb9.setEnabled(false);
            count++;
        }
        win();

    }
    void win(){
        if(jb1.getText().equals("X") && jb2.getText().equals("X") && jb3.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();

        }
        else if(jb4.getText().equals("X") && jb5.getText().equals("X") && jb6.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb7.getText().equals("X") && jb8.getText().equals("X") && jb9.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb1.getText().equals("X") && jb4.getText().equals("X") && jb7.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb2.getText().equals("X") && jb5.getText().equals("X") && jb8.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb3.getText().equals("X") && jb6.getText().equals("X") && jb9.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb1.getText().equals("X") && jb5.getText().equals("X") && jb9.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb3.getText().equals("X") && jb5.getText().equals("X") && jb7.getText().equals("X")){
            JOptionPane.showMessageDialog(jf,"X won");
            restart();
        }
        else if(jb1.getText().equals("0") && jb2.getText().equals("0") && jb3.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb4.getText().equals("0") && jb5.getText().equals("0") && jb6.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb7.getText().equals("0") && jb8.getText().equals("0") && jb9.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb1.getText().equals("0") && jb4.getText().equals("0") && jb7.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb2.getText().equals("0") && jb5.getText().equals("0") && jb8.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb3.getText().equals("0") && jb6.getText().equals("0") && jb9.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb1.getText().equals("0") && jb5.getText().equals("0") && jb9.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else if(jb3.getText().equals("0") && jb5.getText().equals("0") && jb7.getText().equals("0")){
            JOptionPane.showMessageDialog(jf,"0 won");
            restart();
        }
        else{
            if(count==9){
                JOptionPane.showMessageDialog(jf,"DRAW");
                restart();
            }

        }
    }
    void restart(){
        int i=JOptionPane.showConfirmDialog(jf,"Do you want to restart the game");
        if(i==0){
            jb1.setText(" ");
            jb2.setText(" ");
            jb3.setText(" ");
            jb4.setText(" ");
            jb5.setText(" ");
            jb6.setText(" ");
            jb7.setText(" ");
            jb8.setText(" ");
            jb9.setText(" ");
            jb1.setEnabled(true);
            jb2.setEnabled(true);
            jb3.setEnabled(true);
            jb4.setEnabled(true);
            jb5.setEnabled(true);
            jb6.setEnabled(true);
            jb7.setEnabled(true);
            jb8.setEnabled(true);
            jb9.setEnabled(true);
            jb1.setBackground(null);
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);
            count=0;
        }
        else if(i==1){
            System.exit(0);
        }
        else{
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);
        }

    }
}
public class TicTacToe {
    public static void main(String[] args) {
        Test t=new Test();
        t.createFrame();


    }
}
