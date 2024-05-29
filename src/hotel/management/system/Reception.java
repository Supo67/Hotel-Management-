package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class Reception extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    Reception() 
    {
        
        JLabel l1=new JLabel("RECEPTION");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Tahoma",Font.BOLD,25));
        l1.setBounds(430,20,150,30);
        add(l1);
        
        
        b1=new JButton("New Costomer Form");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10,30,200,30);
        b1.addActionListener(this);
        add(b1);
        
        
        b2=new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(10,70,200,30);
         b2.addActionListener(this);
        add(b2);
        
        b3=new JButton("Department");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(10,110,200,30);
         b3.addActionListener(this);
        add(b3);
        
        b4=new JButton("All Employee Info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(10,150,200,30);
         b4.addActionListener(this);
        add(b4);
        
        b5=new JButton("Costomer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(10,190,200,30);
         b5.addActionListener(this);
        add(b5);
                
        b6=new JButton("Manager Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(10,230,200,30);
         b6.addActionListener(this);
        add(b6);
        
        b7=new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(10,270,200,30);
         b7.addActionListener(this);
        add(b7);
        
        b8=new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(10,310,200,30);
         b8.addActionListener(this);
        add(b8);
        
        b9=new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(10,350,200,30);
         b9.addActionListener(this);
        add(b9);
        
        b10=new JButton("Pick Up Service");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(10,390,200,30);
         b10.addActionListener(this);
        add(b10);
        
        b11=new JButton("Pick Up Room");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(10,430,200,30);
         b11.addActionListener(this);
        add(b11);

       
        b12=new JButton("Search for Room");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.setBounds(10,430,200,30);
         b12.addActionListener(this);
        add(b12);
        
        b13=new JButton("Logout");
        b13.setBackground(Color.BLACK);
        b13.setForeground(Color.WHITE);
        b13.setBounds(10,470,200,30);
        add(b13);
        
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //setVisible(false);
                System.exit(0);
            }
	});
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/seventh.jpg"));
        //Image i2=i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        //ImageIcon i3=new ImageIcon(i2);
        JLabel l2=new JLabel(i1);
        l2.setBounds(250,90,500,400);
        add(l2);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(300,150,800,550);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            new AddCustomer().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b2){
            new Room().setVisible(true);
            this.setVisible(false);
            
        }else if(ae.getSource()==b3){
            try {
                new Department().setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            this.setVisible(false);
            
        	
            
            
        }else if(ae.getSource()==b4){
            new EmployeeInfo().setVisible(true);
            this.setVisible(false);
            
        }else if(ae.getSource()==b5){
            try {
                new CustomerInfo().setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            this.setVisible(false);
            
        }else if(ae.getSource()==b6){
            new ManagerInfo().setVisible(true);
            this.setVisible(false);
            
        }else if(ae.getSource()==b7){
            try {
                new CheckOut().setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            this.setVisible(false);
            
        }else if(ae.getSource()==b8){
            new UpdateCheck().setVisible(true);
            this.setVisible(false);
            
        }else if(ae.getSource()==b9){
            try {
                new UpdateRoom().setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            this.setVisible(false);
           
            
        }else if(ae.getSource()==b10){
            try {
                new PickUp().setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            this.setVisible(false);
        }else if(ae.getSource()==b11){
            setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource()==b12){
            try {
                new SearchRoom().setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            this.setVisible(false);
            
        }//else if(ae.getSource()==b13){
           // setVisible(false);
        //}
    }
    public static void main(String[] args)
    {
        new Reception().setVisible(true);
    }
}
