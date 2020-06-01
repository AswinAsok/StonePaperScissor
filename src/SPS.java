import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class SPS implements ActionListener 

{
	JFrame jf;
	String user_name,win_points;
	JLabel userpoints,pcpoints,displayname,pcname,draw,draw1,userout,pcout;
	String up="0";
	String pcp="0";
	String dr="0";
	static int pc_choice=0;
	static int user_choice=0;
	JButton stone,paper,scissor;
	static String array[]= {"Stone","Paper","Scissors"};
	
	
	public int PC()
	{
		pc_choice=(int)(Math.random() * (3 - 1 + 1) + 1);
		return pc_choice;
		
		
	}
	
	public void pcout()
	{
		
		if(pcout.getText()!="")
		pcout.setText("");
		pcout.setText("Your Opponent Choice is : "+array[pc_choice-1]);
		pcout.setBounds(25, 240, 300, 75);
		pcout.setForeground(Color.black);
		jf.add(pcout);
		pcout.setHorizontalAlignment(SwingConstants.CENTER);
		pcout.setFont(new Font("Arial", Font.PLAIN, 16));
	}
	
		public SPS()
	{
			
		jf=new JFrame("The Hiliarious SPS");
		jf.setLayout(null);
		jf.setSize(365,365);
		jf.setLocation(450,150);
		
		
		
		user_name = JOptionPane.showInputDialog(jf, "Enter Your Name :");
		
		if(user_name=="")
			user_name="User";
		
		if(win_points=="")
			win_points="3";
			
			
		
		userpoints=new JLabel(up);
		userpoints.setBounds(25, 60, 75, 75);
		userpoints.setFont(new Font("Arial", Font.PLAIN, 24));
		jf.add(userpoints);
		userpoints.setBackground(Color.gray);
		userpoints.setHorizontalAlignment(SwingConstants.CENTER);
		userpoints.setForeground(Color.white);
		userpoints.setOpaque(true);
		
		displayname=new JLabel(user_name);
		displayname.setBounds(25, 130, 75, 75);
		displayname.setForeground(Color.black);
		jf.add(displayname);
		displayname.setHorizontalAlignment(SwingConstants.CENTER);
		displayname.setFont(new Font("Arial", Font.PLAIN, 24));
		

		draw=new JLabel(dr);
		draw.setBounds(150, 80, 55, 55);
		draw.setFont(new Font("Arial", Font.PLAIN, 24));
		jf.add(draw);
		draw.setBackground(Color.gray);
		draw.setHorizontalAlignment(SwingConstants.CENTER);
		draw.setForeground(Color.white);
		draw.setOpaque(true);
		
		draw1=new JLabel("Draw");
		draw1.setBounds(140, 130, 75, 75);
		draw1.setForeground(Color.black);
		jf.add(draw1);
		draw1.setHorizontalAlignment(SwingConstants.CENTER);
		draw1.setFont(new Font("Arial", Font.PLAIN, 18));
		
		pcpoints=new JLabel(pcp);
		pcpoints.setBounds(250, 60, 75, 75);
		pcpoints.setFont(new Font("Arial", Font.PLAIN, 24));
		jf.add(pcpoints);
		pcpoints.setBackground(Color.gray);
		pcpoints.setHorizontalAlignment(SwingConstants.CENTER);
		pcpoints.setForeground(Color.white);
		pcpoints.setOpaque(true);
		
		pcname=new JLabel("PC");
		pcname.setBounds(250, 130, 75, 75);
		pcname.setForeground(Color.black);
		jf.add(pcname);
		pcname.setHorizontalAlignment(SwingConstants.CENTER);
		pcname.setFont(new Font("Arial", Font.PLAIN, 24));
		
		
		stone=new JButton("Stone");
		stone.setBounds(15,210, 100, 25);
		stone.setFont(new Font("Arial",Font.BOLD,15));
		jf.add(stone);
		stone.addActionListener(this);
		
		paper=new JButton("Paper");
		paper.setBounds(125,210, 100, 25);
		paper.setFont(new Font("Arial",Font.BOLD,15));
		jf.add(paper);
		paper.addActionListener(this);
		
		scissor=new JButton("Scissors");
		scissor.setBounds(235,210, 100, 25);
		scissor.setFont(new Font("Arial",Font.BOLD,15));
		jf.add(scissor);
		scissor.addActionListener(this);
		
		win_points = JOptionPane.showInputDialog(jf, "Enter The Win Points :");
		
		pcout=new JLabel();
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		
	}
		
		
		
	
	public static void main(String args[])

	{
		new SPS(); 
		
	}
	


	
	public void check()
	{
		if(Integer.parseInt(up)==Integer.parseInt(win_points))
		{
			JOptionPane.showMessageDialog(jf, user_name+" Wins");
		}
		else if(Integer.parseInt(pcp)==Integer.parseInt(win_points))
		{
			JOptionPane.showMessageDialog(jf, "Opponent Wins");
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==stone)
		{
			user_choice=1;
			if(PC()==1)
			{
				dr=Integer.toString((Integer.parseInt(dr)+1));		  //USER AND PC STONE
				draw.setText(dr);
				pcout();
				pc_choice=0;
			}
			else if(pc_choice==2)
			{
				pcp=Integer.toString((Integer.parseInt(pcp)+1));     //USER STONE AND PC PAPER
				pcpoints.setText(pcp);
				pcout();
				pc_choice=0;
			}
			else if(pc_choice==3)									
			{
				up=Integer.toString((Integer.parseInt(up)+1));     	//USER STONE AND PC SCISSORS
				userpoints.setText(up);
				pcout();
				pc_choice=0;
			}
			
			
		}
		else if(e.getSource()==paper)
		{
			user_choice=2;
			if(PC()==2)
			{
				dr=Integer.toString((Integer.parseInt(dr)+1));	
				draw.setText(dr);
				pcout();
				pc_choice=0;
			}
			else if(pc_choice==1)
			{
				up=Integer.toString((Integer.parseInt(up)+1));     	//USER PAPER AND PC STONE
				userpoints.setText(up);
				pcout();
				pc_choice=0;
			}
			else if(pc_choice==3)
			{
				pcp=Integer.toString((Integer.parseInt(pcp)+1));     //USER PAPER AND PC SCISSORS
				pcpoints.setText(pcp);
				pcout();
				pc_choice=0;
			}
			
		}
		else if(e.getSource()==scissor)
		{
			user_choice=3;
			if(PC()==3)
			{
				dr=Integer.toString((Integer.parseInt(dr)+1));
				draw.setText(dr);
				pcout();
				pc_choice=0;
			}
			else if(pc_choice==2)
			{
				up=Integer.toString((Integer.parseInt(up)+1));     	//USER SCISSOR AND PC PAPER
				userpoints.setText(up);
				pcout();
				pc_choice=0;
			}
			else if(pc_choice==1)
			{
				pcp=Integer.toString((Integer.parseInt(pcp)+1));     //USER SCISSOR AND PC STONE
				pcpoints.setText(pcp);
				pcout();
				pc_choice=0;
			}
			
			
		}
		check();
		
	}

}
