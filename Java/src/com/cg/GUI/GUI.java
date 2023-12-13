package com.cg.GUI;

import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello" +name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"Your"+ age+"is years old");
		
		double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null,"Your height"+height+"cm tall");
		

	}

}

