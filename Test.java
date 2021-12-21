import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a list of words");
		String word = in.next();
		boolean sorted=true;
		while (!word.equals("end")) {
			String word2 = in.next();
			if (word2.compareTo(word) < 0) {
				sorted=false;
				break;
			}
			word = word2;	
		}
		System.out.println(sorted ? "SORTED": "NOT SORTED");
	}

}
