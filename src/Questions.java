import java.util.*;
import java.io.*;

public class Questions {
	
	public static String ans_array[]=new String[23];
	public static Scanner scr=new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("   *****//////////Welcome to 20 Questions\\\\\\\\\\\\\\\\\\\\*****"+
							"\n\nWith my mystical powers, I can figure out what you're thinking!"+
							"\nJust type 'yes' or 'no' for each question\n\t\t   Are you ready?");
		
		array_saver(1,question1());
		
		if(ans_array[1].equals("A")){
			Animal.main(args);
		}else if(ans_array[1].equals("V")){
			Vegetable.main(args);
		}else if(ans_array[1].equals("M")){
			Mineral.main(args);
		}else{
			Other.main(args);
		}
			
	}
	

	public static void FileWriter(String word_and_def) throws IOException{

		FileWriter fw=new FileWriter("E:\\School\\Programming\\Java\\20Q\\Answers Arrays.txt", true);
		PrintWriter pw=new PrintWriter(fw, true);
		pw.print(word_and_def+", "); //File Writing Method so I don't have to type this every time
		pw.close();
		fw.close();
	}
	
	public static void FileReader(String word) throws IOException{
		
		Scanner scan=new Scanner(new File("E:\\School\\Programming\\Java\\20Q\\Answers Arrays.txt"));
		String word_list[]=new String[1000]; //reads the file up to 1000 lines (words&definitions)
		int i=0;
		while(scan.hasNextLine()){
			final String find_line=scan.nextLine();
			if(find_line.toLowerCase().contains(word.toLowerCase())){//checks if the word (lower case) is in any words or 
				word_list[i]=find_line;								//definitions (also lower case)
				i++;
			}
		}
	}
	
	public static void array_saver(int q_num, String s) throws IOException{
		ans_array[q_num]=s;
			FileWriter(ans_array[q_num]);
		System.out.println("Array Saved");
	}
	
	public static String question1() {
		String q1_ans;
		System.out.println("\n\n\t\t   Question 1");
		boolean b=true;
		
		do{
			System.out.println("\nIs it animal?");
			String q1=scr.nextLine();
				if(q1.contains("yes")){
					System.out.println("\n\t\tAnimal it is!");
					q1_ans="A";
					return q1_ans; //FIX THIS AND MAKE IT GO TO THE NEXT QUESTION
				}else if(q1.contains("no")){
					System.out.println("\n\t\tNot animal, got it...");
					b=false;
				}else{
					System.out.println("Just answer yes or no...");
					b=true;
				}
		}while(b);
		
		do{
			System.out.println("\nIs it Vegetable?");
			String q2=scr.nextLine();
				if(q2.contains("yes")){
					System.out.println("\n\t\tVegetable it is!");
					q1_ans="V";
					return q1_ans;//FIX THIS AND MAKE IT GO TO THE NEXT QUESTION
				}else if(q2.contains("no")){
					System.out.println("\n\t\tNot Vegetable, got it...");
					b=false;
				}else{
					System.out.println("Just answer yes or no...");
					b=true;
				}
		}while(b);
		
		do{
			System.out.println("\nIs it Mineral?");
			String q3=scr.nextLine();
				if(q3.contains("yes")){
					System.out.println("\n\t\tMineral it is!");
					q1_ans="M";
					return q1_ans;//FIX THIS AND MAKE IT GO TO THE NEXT QUESTION
				}else if(q3.contains("no")){
					System.out.println("\n\t\tNot Mineral, got it...");
					b=false;
				}else{
					System.out.println("Just answer yes or no...");
					b=true;
				}
		}while(b);
		
		do{
			System.out.println("\nIs it Other?");
			String q4=scr.nextLine();
				if(q4.contains("yes")){
					System.out.println("\n\t\tOther it is!");
					q1_ans="O";
					return q1_ans;//FIX THIS AND MAKE IT GO TO THE NEXT QUESTION
				}else if(q4.contains("no")){
					System.out.println("\n\t\tNot animal, got it...");
					b=false;
				}else{
					System.out.println("Just answer yes or no...");
					b=true;
				}
		}while(b);
		return null;
		
	}
	
	public static String question_layout(String question, int num){
		String q_ans=null;
		boolean b=true;
		System.out.println("\n\t\t    Question "+num);
		do{
			System.out.println(question);
			String q=scr.nextLine();
				if(q.contains("yes")){
					System.out.println("\n\t\tGetting Closer...");
					q_ans="yes";
					return q_ans;
				}else if(q.contains("n")){
					System.out.println("\n\t\tHmmm negatory");
					b=false;
				}else{
					System.out.println("Just answer yes or no...");
					b=true;
				}
		}while(b);
		
		return null;
	}
				
}
	
	
