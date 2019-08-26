import java.util.Scanner;
public class PrintThreeName {

	public static void main(String[] args) 
	{
		String input;
		String[] word;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three name");
		input=sc.nextLine();
		word=input.split(" ");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i] +" ");
		}
	

	}

}
