package com.Chatting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Server extends JFrame implements ActionListener {
    JPanel p1;
    JTextField t1;
    JButton b1;

    Server(){
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,300,55);
        add(p1);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("com/Chatting/icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(5,10,30,30);
        p1.add(l1);
        //Mouse Listener Add korbo
        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("com/Chatting/icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(45,45,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(40,3,45,45);
        p1.add(l2);

        ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("com/Chatting/icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l5 = new JLabel(i9);
        l5.setBounds(195,13,25,25);
        p1.add(l5);

        ImageIcon i10= new ImageIcon(ClassLoader.getSystemResource("com/Chatting/icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l6 = new JLabel(i12);
        l6.setBounds(230,13,25,25);
        p1.add(l6);

        ImageIcon i13= new ImageIcon(ClassLoader.getSystemResource("com/Chatting/icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel l7 = new JLabel(i15);
        l7.setBounds(265,13,10,25);
        p1.add(l7);

        //lebel

        JLabel l3 = new JLabel("Rehan");
        l3.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(95,6,100,15);
        p1.add(l3);

        JLabel l4 = new JLabel("Active Now");
        l4.setFont(new Font("SAN_SERIF",Font.PLAIN,13));
        l4.setForeground(Color.WHITE);
        l4.setBounds(95,25,150,15);
        p1.add(l4);

        //Text field
        t1 = new JTextField();
        t1.setBounds(2,455,215,40);
        t1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(t1);

        //send Button
        b1 = new JButton("Send");
        b1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        b1.setBackground(new Color(7,94,84));
        b1.setForeground(Color.WHITE);
        b1.setBounds(218,455,80,40);
        add(b1);


        setLayout(null);
        setSize(300,500);
        setLocation(300,150);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Server().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
