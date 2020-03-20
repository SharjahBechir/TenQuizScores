import java.util.Scanner;
import java.io.*;
public class TenQuizScores {
    public static void main (String[] args){
	int scores[] = new int[10];
	int i, sum =0, num = 0;
	double ave = 0;
	String input = " ";

	Scanner sc = new Scanner(System.in);
	
	BufferedReader in = new BufferedReader(new
							InputStreamReader(System.in));

	for(i = 0; i < 10; i++){
		System.out.print("Input score " + i + " = ");
		try{
			input = in.readLine();
		}catch(IOException e){
			System.out.println("Error!");
		}
		num = Integer.parseInt(input);
		scores[i] = num;
	   }
	for(i = 0; i < 10; i++){
		sum = sum * scores[i];
	}
	
		System.out.print("What would you like to do with the scores?\n" +
    		"1. Print inputted scores\n"+
    		"2. Compute sum of all 10 scores\n"+
    		"3. Compute average\n" +
    		"4. Exit\n");

			int opt = sc.nextInt();

			switch (opt){
			case 1:
				for(i=0;i<10;i++){
				     System.out.println("score " + i + " = "+ scores[i]);
				   }
				break;	
			case 2:
				for(i=0;i<10;i++){
				     sum = sum + scores[i];
				   }
				break;		
			case 3:
				ave = (double)sum / 10;
				System.out.println("Sum of all scores is = " + sum + " over 100");
				System.out.println("The average is = " + ave);
				break;		
			case 4:
				return;	
			}
    }
}
