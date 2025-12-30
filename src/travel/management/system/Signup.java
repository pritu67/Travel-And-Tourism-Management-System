
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,139,233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        JLabel lbusername=new JLabel("Username");
        lbusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lbusername.setBounds(50, 20, 125, 25);
        p1.add(lbusername);
        
         tfusername= new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lbname=new JLabel("Name");
        lbname.setFont(new Font("Tahoma",Font.BOLD,14));
        lbname.setBounds(50, 60, 125, 25);
        p1.add(lbname);
        
         tfname= new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
         JLabel lblpassword=new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        lblpassword.setBounds(50, 100, 125, 25);
        p1.add(lblpassword);
        
         tfpassword= new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        JLabel lbsecurity=new JLabel("Security Question");
        lbsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        lbsecurity.setBounds(50, 140, 125, 25);
        p1.add(lbsecurity);
        
         security =new Choice();
        security.add("Fav Character from The Boys");
        security.add("Fav Marvel superhero");
        security.add("Your Lucky number");
        security.add("Your childhood superhero");
        security.setBounds(190, 140, 180, 25);
        p1.add(security);
        
         JLabel lblanswer=new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        lblanswer.setBounds(50, 180, 125, 25);
        p1.add(lblanswer);
        
         tfanswer= new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
         create=new JButton("Create");
        create.setForeground(new Color(133,193,233));
        create.setBackground(Color.WHITE);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
          back=new JButton("Back");
        back.setForeground(new Color(133,193,233));
        back.setBackground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);
                setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            String username=tfusername.getText();
            String name=tfname.getText();
            String password=tfpassword.getText();
            String question=security.getSelectedItem();
            String answer=tfanswer.getText();
            
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account created successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==back){
            
        }setVisible(false);
        new Login();
    }
    public static void main(String[] args){
        new Signup();
    }
}
