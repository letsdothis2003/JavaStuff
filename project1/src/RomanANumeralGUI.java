//Fahim Tanvir
//Project1
//CS212 LAB SECTION 22F

import java.util.*;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;
;
public class RomanANumeralGUI extends JFrame {
static String[] roman;
static int[] arabic;
static TextArea input, output;

public static void print(RomanANumeralGUI window, ArrayList<String> numeral, ArrayList<Integer> numbers) {
	window = new RomanANumeralGUI(); //*Similar to the code from lab 11, this should make the code
	window.setVisible(true);		//pop out in in the left hand corner.*
	window.setTitle("Project 1");
	window.setLocation(100,100);
	window.setSize(500,500);	
	window.setLayout(new GridLayout(1,2));
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	Container column = window.getContentPane(); //Container setup so everything is in a concise package
	input = new TextArea();	//Input is for the roman numerals
	output = new TextArea(); //Output is for regular numbers
	
	roman = new String[numeral.size()]; 
	input.setEditable(false); //This is here so text can't be altered or changed in the window.
	for(int i = 0; i < numeral.size(); i++) { //For loop is there to print out everything in a column
		roman[i] = numeral.get(i);
	    input.append(roman[i] + "\n");
	}
	arabic = new int[numbers.size()]; //Ditto for arabic numerals
	output.setEditable(false); 
	
	for(int j = 0; j < numbers.size(); j++) { 
		arabic[j] = numbers.get(j);
		output.append(arabic[j] + "\n");
}
	column.add(input); //This in conjunction with Project1.java's data should make the 
	column.add(output);	
}
}
