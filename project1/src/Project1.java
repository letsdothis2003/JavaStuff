//Fahim Tanvir
//Project1
//CS212 LAB SECTION 22F



import java.util.*;
import java.awt.GridLayout;
import javax.swing.*;

public class Project1 {  
	static RomanANumeralGUI window; //*Declaring variable in which data here will go to RomanANNumeralGUI*
	public static void main(String [] args){
	        RomanANumeralGUI.print(window,read(),conversion ());
	    }   //*This will make a window pop using the methods below*
			//This will siphon all the data and inputs and methods below. Acting as a bridge between
			//Project1.java and RomanANumeralAGUI.java.*
	

    static ArrayList<String> stored; 
    static TextFileInput txtfile; //This is what hooks Project 1 to TextFileInput. 

    //This will read the input file
public static ArrayList<String> read() {
	txtfile = new TextFileInput("input.txt");//Where input file will go
    String row;
    stored = new ArrayList<>();//This will separate each numeral based on row or line
        while ((row = txtfile.readLine()) != null) {
            String[] splitArray = row.split(",");//This will separate each numeral by comma
        for (String str : splitArray) {
                stored.add(str);
            }
        }
        return stored;
    } 
    	
    
    
public static ArrayList<Integer> conversion(){ //*This converts the roman numeral to decimals(whole numbers ideally) 
	ArrayList<Integer> out = new ArrayList<Integer>();//using the array below.*
    
    for(int i=0;i<stored.size(); i++) {//*For loops check the index of each value from  
    int New = 0;				//start to finish 
    String term = stored.get(i);//Get roman numeral.
    for(int j = 0; j < term.length(); j++) { 
    int curr = value(term.charAt(j)); //This converts it to a decimal.
    if(j + 1 < term.length()) { //Rest of this skips to the next numeral or prevents. 
    int next = value(term.charAt(j + 1)); //*decimal values from being added to eachother.
    if(curr >= next){ 
    	New = New+curr;
             }
            else {
        New = New+next-curr;  
            j++;
                 }
             } 
            else {
        New = New+curr;
                }
            }
     out.add(New);
        }
    return out;
        }
  
static char[] romans = {'I', 'V', 'X', 'L', 'C', 'D', 'M'}; //*These arrays store roman and arabic numerals.
static int[] arabic = {1, 5, 10, 50, 100, 500, 1000};     
	public static int value(char r) {
        for (int i = 0; i < romans.length; i++) { //*This will let the program know which roman numeral is which arabic
            if (r == romans[i]) {                //numeral based on index of both arrays.*
                return arabic[i];
            }
        }
        return 0;
    }   
    }
//*Unrelated to code but related to the program, adding  spaces after comma in the txtfile will
// cause the converted numerals too add up by 1.*

    
 