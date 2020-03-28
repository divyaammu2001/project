package project;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class frame1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);// creating instance of JFrame
		f.setResizable(false);
        f.setVisible(true);
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\divya\\Desktop\\s7.jfif"));
		f.add(background);
		f.setVisible(true);
		Button b = new Button("Login");
		b.setBounds(150, 300, 100, 30);
		f.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f1=new JFrame();//creating instance of JFrame
				f1.setSize(800,600);
				f1.setResizable(false);
				f1.setVisible(true);
				JLabel background=new JLabel(new ImageIcon("C:\\Users\\divya\\Desktop\\t1.jfif"));
				background.setVisible(true);
				f1.add(background);
				f1.setVisible(true);
				JLabel l1;  
				TextField t1;
				l1=new JLabel("Name:");  
				l1.setBounds(50,50,100,30);  
				t1=new TextField("");  
				t1.setBounds(200,50,220,30); 
				f1.add(l1);  
				//f1.add(t1);
				background.add(t1);
				t1.setVisible(true);
				TextField t2;
				l1=new JLabel("phone number:");  
				l1.setBounds(50,100,100,30);  
				t2=new TextField("");  
				t2.setBounds(200,100,220,30); 
				f1.add(l1);  
				//f1.add(t2);
				background.add(t2);
				TextField t3;
				l1=new JLabel("mail ID:");  
				l1.setBounds(50,150,100,30);  
				t3=new TextField("");  
				t3.setBounds(200,150,220,30); 
				f1.add(l1);  
				//f1.add(t3);
				background.add(t3);
				TextField t5;
				l1=new JLabel("Address:");  
				l1.setBounds(50,200,120,50);  
				t5=new TextField("");  
				t5.setBounds(200,200,220,30); 
				f1.add(l1);  
				//f1.add(t5);
				background.add(t5);
				TextField t6;
				l1=new JLabel("Street address:");  
				l1.setBounds(50,250,120,50);  
				t6=new TextField("");  
				t6.setBounds(200,250,220,30);
				f1.add(l1);  
				//f1.add(t6);
				background.add(t6);
				TextField t7;
				l1=new JLabel("Country:");  
				l1.setBounds(50,300,120,50);  
				t7=new TextField("");  
				t7.setBounds(200,300,220,30); 
				f1.add(l1);  
				//f1.add(t7);
				background.add(t7);
				//TextField t8;
				l1=new JLabel("State:");  
				l1.setBounds(50,350,120,50); 
				f1.add(l1); 
				Choice c=new Choice();  
				c.setBounds(200,360,220,30);  
				c.add("Andhra Pradesh");  
				c.add("Telangana");  
				c.add("TamilNadu");  
				c.add("Maharastra");  
				c.add("Kerla");
				//f1.add(c);
				background.add(c);
				//TextField t9;
				l1=new JLabel("City:");  
				l1.setBounds(50,400,120,50); 
				f1.add(l1); 
				Choice s=new Choice();  
				s.setBounds(200,410,220,30);  
				s.add("Vijayawada");  
				s.add("Hyderabad");  
				s.add("Mumbai");  
				s.add("Chennai");  
				s.add("goa");  
				//f1.add(s);
				background.add(s);
				Button b=new Button("NEXT");  
				b.setBounds(150,500,100,30);  
				//f1.add(b);
				background.add(b);
				//f1.setSize(1600,1600);//400 width and 500 height  
				f1.setLayout(null);//using no layout managers  
				f1.setVisible(true);//making the frame 
				
				b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFrame f2=new JFrame("Menu");//creating instance of JFrame
						JLabel l1;  
						l1=new JLabel("TIFFINS:"); 
						l1.setFont(new Font("TIFFINS", Font.ITALIC, 25));
						l1.setBounds(50,50,150,30);
						f2.add(l1);
						l1=new JLabel("BIRYANIS:"); 
						l1.setFont(new Font("BIRYANIS", Font.ITALIC, 25));
						l1.setBounds(250,50,150,30);
						f2.add(l1);
						l1=new JLabel("FASTFOOD:");  
						l1.setFont(new Font("FASTFOOD", Font.ITALIC, 25));
						l1.setBounds(500,50,150,30);
						f2.add(l1);
						l1=new JLabel("COOL DRINKS:");
						l1.setFont(new Font("COOL DRINKS", Font.ITALIC, 25));
						l1.setBounds(750,50,180,30);
						f2.add(l1);
						l1=new JLabel("ICE CREAMS:");  
						l1.setFont(new Font("ICE CREAMS", Font.ITALIC, 25));
						l1.setBounds(1000,50,180,30);
						f2.add(l1);
						JCheckBox checkBox1 = new JCheckBox("idly RS:-20");  
						checkBox1.setBounds(50,100, 150,20);  
						JCheckBox checkBox2 = new JCheckBox("sambaridly RS:-25");  
						checkBox2.setBounds(50,150, 150,20);  
						JCheckBox checkBox3 = new JCheckBox("dosa RS:-25");  
						checkBox3.setBounds(50,200, 150,20);  
						JCheckBox checkBox4 = new JCheckBox("chapati RS:-30");  
						checkBox4.setBounds(50,250, 150,20); 
						JCheckBox checkBox5 = new JCheckBox("veg biryani RS:-150");  
						checkBox5.setBounds(250,90, 180,20);  
						JCheckBox checkBox6 = new JCheckBox("sp biryani RS200");  
						checkBox6.setBounds(250,150, 200,30);  
						JCheckBox checkBox7 = new JCheckBox("chickenbiryani RS250");  
						checkBox7.setBounds(250,200, 200,40);  
						JCheckBox checkBox8 = new JCheckBox("mutton biryani RS300");  
						checkBox8.setBounds(250,250, 200,50); 
						JCheckBox checkBox9 = new JCheckBox("pani pure RS:-20");  
						checkBox9.setBounds(500,100, 150,20);  
						JCheckBox checkBox10 = new JCheckBox("noodels RS:-40");  
						checkBox10.setBounds(500,150, 150,20);  
						JCheckBox checkBox11 = new JCheckBox("manchuria RS:-100");  
						checkBox11.setBounds(500,200, 150,20);  
						JCheckBox checkBox12= new JCheckBox("chicken pakodi RS:-150");  
						checkBox12.setBounds(500,250, 200,20); 
						JCheckBox checkBox13 = new JCheckBox("sprite(1l) RS:-40");  
						checkBox13.setBounds(750,100, 150,20);  
						JCheckBox checkBox14 = new JCheckBox("maaza(1l) RS:-40");  
						checkBox14.setBounds(750,150, 150,20);  
						JCheckBox checkBox15 = new JCheckBox("seven up(1l) RS:-40");  
						checkBox15.setBounds(750,200, 150,20);  
						JCheckBox checkBox16 = new JCheckBox("limca(1l) RS:-40");  
						checkBox16.setBounds(750,250, 150,20); 
						JCheckBox checkBox17 = new JCheckBox("choclate RS:-50");  
						checkBox17.setBounds(1000,90, 180,20);  
						JCheckBox checkBox18 = new JCheckBox("pine apple RS:-70");  
						checkBox18.setBounds(1000,150, 200,30);  
						JCheckBox checkBox19= new JCheckBox("black forest RS 150");  
						checkBox19.setBounds(1000,200, 140,40);  
						JCheckBox checkBox20= new JCheckBox("venela RS:-20");  
						checkBox20.setBounds(1000,250,140,50); 
						f2.add(checkBox1);  
						f2.add(checkBox2);  
						f2.add(checkBox3);  
						f2.add(checkBox4);
						f2.add(checkBox5);  
						f2.add(checkBox6);  
						f2.add(checkBox7);  
						f2.add(checkBox8);
						f2.add(checkBox9);  
						f2.add(checkBox10);  
						f2.add(checkBox11);  
						f2.add(checkBox12); 
						f2.add(checkBox13);  
						f2.add(checkBox14);  
						f2.add(checkBox15);  
						f2.add(checkBox16);
						f2.add(checkBox17);  
						f2.add(checkBox18);  
						f2.add(checkBox19);  
						f2.add(checkBox20);
						Button b=new Button("NEXT");  
						b.setBounds(500,400,100,30);  
						f2.add(b);
						f2.setSize(1200,500);//400 width and 500 height  
						f2.setResizable(false);
						f2.setLayout(null);//using no layout managers  
						f2.setVisible(true);//making the frame visible
						//JLabel background=new JLabel(new ImageIcon("C:\\Users\\divya\\Desktop\\t2.jfif"));
						//background.setBounds(200,500,211,300);
						//background.setVisible(true);
						//f2.add(background);
						f2.setVisible(true);
						b.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								JFrame f1=new JFrame();//creating instance of JFrame
								JLabel l7;
								l7=new JLabel("Bank Name:");  
								l7.setBounds(110,98,120,50); 
								Choice s1=new Choice();  
								s1.setBounds(220,110,120,30);  
								s1.add("SBI");  
								s1.add("Andhra Bank");  
								s1.add("Canara bank");  
								s1.add("Indian Bank");  
								s1.add("Punjab National Bank");  
								f1.add(s1); 
								f1.add(l7);
								TextField t13;
								l7=new JLabel("Account holder name:");  
								l7.setBounds(100,200,100,30);  
								t13=new TextField("");
								t13.setBounds(220,200,120,30); 
								f1.add(l7);  
								f1.add(t13);
								l7=new JLabel("Account Number:");  
								l7.setBounds(100,250,100,30); 
								TextField t10;
								t10=new TextField("");  
								t10.setBounds(220,250,120,30); 
								f1.add(l7);  
								f1.add(t10);
								TextField t11;
								l7=new JLabel("Expiry Date:");  
								l7.setBounds(100,300,100,30);  
								t11=new TextField("");  
								t11.setBounds(220,300,90,30); 
								f1.add(l7);  
								f1.add(t11);
								TextField t12;
								l7=new JLabel("cvv:");  
								l7.setBounds(100,350,100,30);  
								t12=new TextField("");  
								t12.setBounds(220,350,90,30);
								f1.add(l7);
								f1.add(t12);
								Button b=new Button("Proceed to pay");  
								b.setBounds(270,450,100,30);  
								f1.add(b);
								f1.setSize(600,600);//400 width and 500 height  
								f1.setLayout(null);//using no layout managers 
								f1.setVisible(true);//making the frame visible 

								b.addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e){
										JFrame f1=new JFrame(); 
										/*JLabel background1=new JLabel(new ImageIcon("C:\\Users\\divya\\Desktop\\divya delievery boy.jpg"));
										background1.setBounds(600,600,100,30);
										background1.setVisible(true);
										f1.add(background1);
										f1.setVisible(true);*/
										String Name=t1.getText();
										String Phonenumber =t2.getText();
										String Streetaddress= t6.getText();
										String Address=t5.getText();
										//JTextField t14=new JTextField();
										//String TotalPrice=t14.getText();
										JLabel ll2=new JLabel();  
										ll2.setText("Name:  " +Name);
										ll2.setBounds(150,100,100,50); 
										f1.add(ll2);
										ll2.setVisible(true);
										JLabel ll3=new JLabel();  
										ll3.setText("Phone number:  " +Phonenumber);
										ll3.setBounds(150,150,200,50); 
										f1.add(ll3);
										ll3.setVisible(true);
										JLabel ll4=new JLabel();  
										ll4.setText("StreetAddress:  " +Streetaddress);
										ll4.setBounds(150,200,200,50); 
										f1.add(ll4);
										ll4.setVisible(true);
										JLabel ll5=new JLabel();
										ll5.setText("Address:  " +Address);
										ll5.setBounds(150,250,200,50); 
									    f1.add(ll5);
										ll5.setVisible(true);
									        float amount=0;  
									        String msg="";  
									       if(checkBox1.isSelected()){  
									            amount+=20;  
									            msg="idly: 20\n";  
									        }  
									        if(checkBox2.isSelected()){  
									            amount+=25;  
									            msg+="Sambaridly: 25\n";  
									        }  
									        if(checkBox3.isSelected()){  
									            amount+=25;  
									            msg+="Dosa: 25\n";  
									        }  if(checkBox4.isSelected()){  
									            amount+=30;  
									            msg="Chapathi: 30\n";  
									        }  
									        if(checkBox5.isSelected()){  
									            amount+=150;  
									            msg+="veg Biryani: 150\n";  
									        }  
									        if(checkBox6.isSelected()){  
									            amount+=200;  
									            msg+="SP Biryani: 200\n";  
									        }  
									        if(checkBox7.isSelected()){  
									            amount+=250;  
									            msg="Chicken Biryani: 250\n";  
									        }  
									        if(checkBox8.isSelected()){  
									            amount+=300;  
									            msg+="Mutton Biryani: 300\n";  
									        }  
									        if(checkBox9.isSelected()){  
									            amount+=20;  
									            msg+="Pani puri: 20\n";  
									        }  
									        if(checkBox10.isSelected()){  
									            amount+=40;  
									            msg="Noodles: 40\n";  
									        }  
									        if(checkBox11.isSelected()){  
									            amount+=100;  
									            msg+="Manchuria: 100\n";  
									        }  
									        if(checkBox12.isSelected()){  
									            amount+=150;  
									            msg+="Chicken pakodi: 150\n";  
									        } if(checkBox13.isSelected()){  
									            amount+=40;  
									            msg="Sprite: 40\n";  
									        }  
									        if(checkBox14.isSelected()){  
									            amount+=40;  
									            msg+="Maaza: 40\n";  
									        }  
									        if(checkBox15.isSelected()){  
									            amount+=40;  
									            msg+="Seven up: 40\n";  
									        } 
									        if(checkBox16.isSelected()){  
									            amount+=40;  
									            msg="Limca: 40\n";  
									        }  
									        if(checkBox17.isSelected()){  
									            amount+=50;  
									            msg+="Chocolate: 50\n";  
									        }  
									        if(checkBox18.isSelected()){  
									            amount+=70;  
									            msg+="Pine Apple: 70\n";  
									        }  
									        if(checkBox19.isSelected()){  
									            amount+=150;  
									            msg="Black forest: 150\n";  
									        }  
									        if(checkBox20.isSelected()){  
									            amount+=20;  
									            msg+="Venela: 20\n";  
									        }
									        msg+="\n";  
									        //JOptionPane.showInputDialog(this,msg+"Total: "+amount);
									        JLabel ll6=new JLabel();
											ll6.setText("fooditems: " +msg );
											ll6.setBounds(150,300,600,50); 
											f1.add(ll6);
											ll6.setVisible(true);
									        JLabel ll7=new JLabel();
											ll7.setText("Total Price:" +amount);
											ll7.setBounds(150,350,200,50); 
											f1.add(ll7);
											ll7.setVisible(true);
											f1.setSize(600,600);//400 width and 500 height  
										f1.setLayout(null);//using no layout managers  
										f1.setVisible(true);//making the frame visible
										JButton b1=new JButton("confirm");
										b1.setBounds(270,450,100,30);  
										f1.add(b1);
										//f1.add(checkBox17);
										b1.addActionListener(new ActionListener() {
									
											
											public void actionPerformed(ActionEvent e) {
										  
										if(e.getActionCommand().equals("Thank You"));{
											JOptionPane.showMessageDialog(b1,"UR order was successfully taken");
											}
										}
									
								});
									}});	
							}
							});
						  }
					   });
				    }
			    });
		     }
	      }