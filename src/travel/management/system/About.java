
package travel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class About extends JFrame implements ActionListener{
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel l1=new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        String s="About the Travel and Tourism Management System\n" +
"\n" +
"The Travel and Tourism Management System is designed to make travel planning easy, fast, and convenient for users.\n" +
"This system provides information about tourist destinations, travel packages, hotels, and transportation services in one platform.\n" +
"Users can explore different travel destinations, view package details, and select trips according to their budget and preferences.\n" +
"The system allows customers to book tour packages, hotels, and travel tickets online without visiting travel agencies physically.\n" +
"It also helps travel agencies manage customer details, bookings, and payments efficiently.\n" +
"The project reduces manual work and paperwork by automating all travel-related processes.\n" +
"Users can register, log in, and manage their bookings securely.\n" +
"The system provides updated travel information and availability in real time.\n" +
"Payment integration ensures safe and smooth online transactions.\n" +
"Admin can add, update, or remove travel packages and destinations.\n" +
"The system improves customer satisfaction by saving time and offering multiple travel options.\n" +
"It is user-friendly and accessible from anywhere through the internet.\n" +
"The project helps promote tourism by providing easy access to travel services.\n" +
"Overall, the Travel and Tourism Management System offers a reliable and efficient solution for modern travel management.";
        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
        
        
       JButton back=new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
            public static void main(String args[]){
                new About();
            }
}
