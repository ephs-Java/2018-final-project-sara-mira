package notes;

import java.util.Scanner;

public class meeme {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int total = 0;
		System.out.println("Hello! This quiz will determine "
				+ "what vine best decribes you!");
		System.out.println("What is your favorite color?"+
				"\na. pink"
				+"\nb. blue"
				+"\nc. orange"
				+"\nd. green");
		String ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite animal?"+
				"\na. dog"
				+"\nb. cat"
				+"\nc. horse"
				+"\nd. bird");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite food?"+
				"\na. avocado"
				+"\nb. fresh avocado"
				+"\nc. beef"
				+"\nd. tortilla chip");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite school subject?"+
				"\na. math"
				+"\nb. science"
				+"\nc. english"
				+"\nd. social studies");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite game?"+
				"\na. uno"
				+"\nb. monopoly"
				+"\nc. clue"
				+"\nd. fortnite");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite book?"+
				"\na. Harry Potter"
				+"\nb. Hunger Games"
				+"\nc. Lord of the Rings"
				+"\nd. I never learned how to read");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite movie?"+
				"\na. Harry Potter"
				+"\nb. La La Land"
				+"\nc. Black Panther"
				+"\nd. Breakfast Club");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite ice cream flavor?"+
				"\na. mint"
				+"\nb. vanilla"
				+"\nc. chocolate"
				+"\nd. cookie dough");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite java thing?"+
				"\na. for"
				+"\nb. if"
				+"\nc. while"
				+"\nd. boolean");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println("What is your favorite sport?"+
				"\na. soccer"
				+"\nb. football"
				+"\nc. swimming"
				+"\nd. hockey");
		ans = keyboard.nextLine();
		if(ans.equals("a")){
			total += 1;
		}
		if(ans.equals("b")){
			total += 2;
		}
		if(ans.equals("c")){
			total += 3;
		}
		if(ans.equals("d")){
			total += 4;
		}
		System.out.println(total);

	}
}
