package AWT;

import java.awt.*;
import javax.swing.*;
public class awt_events {

	public static void main(String[] args) {
		//Frame
		
		JFrame f=new JFrame("Events");
		f.setSize(500,700);
		f.setVisible(true);
		f.setLayout(null);
		
		// Header
		
		Label l=new Label("REGISTRATION FORM");
		l.setBounds(170,20,150,30);
		f.add(l);
		
		// First Name
		Label fn=new Label("First Name :");
		fn.setBounds(40,60,80,20);
		f.add(fn);
		TextField Fn=new TextField();
		Fn.setBounds(120,60,150,20);
		f.add(Fn);
		
		// Last Name
		Label ln=new Label("Last Name :");
		ln.setBounds(40,90,80,20);
		f.add(ln);		
		TextField Ln=new TextField();
		Ln.setBounds(120,90,150,20);
		f.add(Ln);
		
		// Gender
		
		Label gender=new Label("Gender :");
		gender.setBounds(40,120,80,20);
		f.add(gender);
		
		CheckboxGroup CG=new CheckboxGroup();
		Checkbox ch1=new Checkbox("Male",CG,true);
		ch1.setBounds(120,120,50,20);
		f.add(ch1);
		Checkbox ch2=new Checkbox("Female",CG,false);
		ch2.setBounds(170,120,60,20);
		f.add(ch2);
		Checkbox ch3=new Checkbox("Others",CG,false);
		ch3.setBounds(240,120,60,20);
		f.add(ch3);
		
		// Contact 
		
		Label con=new Label("Contact No :");
		con.setBounds(40,150,80,20);
		f.add(con);
		
		TextField Con=new TextField();
		Con.setBounds(120,150,150,20);
		f.add(Con);
		
		// Email
		
		Label email=new Label("Email ID :");
		email.setBounds(40,180,80,20);
		f.add(email);
		
		TextField Email=new TextField();
		Email.setBounds(120,180,150,20);
		f.add(Email);
		
		//Address
		
		Label add=new Label("Address :");
		add.setBounds(40,210,80,20);
		f.add(add);
		
		TextArea Add=new TextArea();
		Add.setBounds(120,210,150,60);
		f.add(Add);
		
		// State
		
		Label state=new Label("State :");
		state.setBounds(40,280,80,20);
		f.add(state);
		
		Choice State=new Choice();
		State.setBounds(120,280,100,20);
		State.add("Maharashtra");
		State.add("Madhya Pradesh");
		State.add("Uttar Pradesh");
		State.add("Karnataka");
		f.add(State);
		
		//City
		Label city=new Label("City :");
		city.setBounds(40,310,80,20);
		f.add(city);
		
		Choice City=new Choice();
		City.setBounds(120,310,100,20);
		City.add("Mumbai");
		City.add("Pune");
		City.add("Nashik");
		City.add("Bhopal");
		City.add("Jabalpur");
		City.add("Indore");
		City.add("Lucknow");
		City.add("Prayagraj");
		City.add("Varanasi");
		f.add(City);
		
		// Hobbies
		
		Label hobby=new Label("Hobbies :");
		hobby.setBounds(40,340,80,20);
		f.add(hobby);
		
		Checkbox c1=new Checkbox("Coding");
		c1.setBounds(120,340,60,20);
		f.add(c1);
		Checkbox c2=new Checkbox("Error Detection");
		c2.setBounds(200,340,100,20);
		f.add(c2);
		Checkbox c3=new Checkbox("Solving Problems");
		c3.setBounds(120,360,120,20);
		f.add(c3);
		Checkbox c4=new Checkbox("Walking");
		c4.setBounds(240,360,120,20);
		f.add(c4);	
		
		
		// Year
		
		Label year=new Label("Year :");
		year.setBounds(40,390,80,20);
		f.add(year);
		
		TextField Year=new TextField();
		Year.setBounds(120,390,80,20);
		f.add(Year);
		
		//Semester
		
		Label sem=new Label("Semester :");
		sem.setBounds(40,420,80,20);
		f.add(sem);
		
		TextField Sem=new TextField();
		Sem.setBounds(120,420,80,20);
		f.add(Sem);
		
		//button
		
		Button btn=new Button("SUBMIT");
		btn.setBounds(190,470,70,20);
		f.add(btn);
	}
}
