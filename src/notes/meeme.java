package notes;
//
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class meeme {

	public static void main(String[] args) throws URISyntaxException, IOException {
		Scanner keyboard = new Scanner(System.in);
		int total = 0;
		System.out.println("Hello! This quiz will determine " 
		+ "what vine best decribes you!"
				+"\nType a letter");
		System.out.println("What is your favorite color?" 
		+ "\na. pink" + "\nb. blue" + "\nc. orange" + "\nd. green");
		String ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println("What is your favorite animal?" 
		+ "\na. dog" + "\nb. cat" + "\nc. horse" + "\nd. bird");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println("What is your favorite food?" 
		+ "\na. avocado" + "\nb. fresh avocado" + "\nc. beef"
				+ "\nd. tortilla chip");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println("What is your favorite school subject?" 
		+ "\na. math" + "\nb. science" + "\nc. english"
				+ "\nd. social studies");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out
				.println("What is your favorite game?" 
		+ "\na. uno" + "\nb. monopoly" + "\nc. clue" + "\nd. fortnite");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println("What is your favorite book?" 
		+ "\na. Harry Potter" + "\nb. Hunger Games"
				+ "\nc. Lord of the Rings" + "\nd. I never learned how to read");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println("What is your favorite movie?" 
		+ "\na. Harry Potter" + "\nb. La La Land"
				+ "\nc. Black Panther" + "\nd. Breakfast Club");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println("What is your favorite ice cream flavor?" 
		+ "\na. mint" + "\nb. vanilla" + "\nc. chocolate"
				+ "\nd. cookie dough");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out
				.println("What is your favorite java thing?" 
		+ "\na. for" + "\nb. if" + "\nc. while" + "\nd. boolean");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println(
				"What is your favorite sport?" 
		+ "\na. soccer" + "\nb. football" + "\nc. swimming" + "\nd. hockey");
		ans = keyboard.nextLine();
		if (ans.equals("a")) {
			total += 1;
		}
		else if (ans.equals("b")) {
			total += 2;
		}
		else if (ans.equals("c")) {
			total += 3;
		}
		else if (ans.equals("d")) {
			total += 4;
		}
		System.out.println(total);
		Desktop d = Desktop.getDesktop();
		if (total < 15) {
			System.out.println("You are the croissant vine!\nYou love baked goods and are caring!"
					+"\nYou can be overprotective, but its okay!\nDo you want to see the vine?");
			String response = keyboard.nextLine();
			if(response.equals("yes")){
				URI croissant = new URI("https://www.youtube.com/watch?v=ZzWqfJFxC0w");
				d.browse(croissant);	
			}
		} else if (total >= 15 && total < 20) {
			System.out.println("You are the rat in grocery store vine!\nYou love to shop and you are pretty stealthy!"
					+"\nYou can be nerve wracking!\nDo you want to see the vine?");
			String response = keyboard.nextLine();
			if(response.equals("yes")){
				URI rat = new URI("https://www.youtube.com/watch?v=JVQSBm_dpTg");
				d.browse(rat);
			}
		} else if (total >= 20 && total < 25) {
			System.out.println("You are the road work ahead vine!\nYou are super sarcastic!"
					+"\nYou can be pessimistic, but its okay!\nDo you want to see the vine?");
			String response = keyboard.nextLine();
			if(response.equals("yes")){
				URI road = new URI("https://www.youtube.com/watch?v=6AYv6rV3NXE");
				d.browse(road);
			}
		} else if (total >= 25 && total < 30) {
			System.out.println("You are the oovoo javer vine!\nYou don't care about the newest trends."
					+"\nYou live for yourself and not for others!\nDo you want to see the vine?");
			String response = keyboard.nextLine();
			if(response.equals("yes")){
				URI oovoo = new URI("https://www.youtube.com/watch?v=_cW-QwnzdI0");
				d.browse(oovoo);
			}
		} else if (total >= 30 && total < 35) {
			System.out.println("You are the chickens vine!\nYou love birds and appreciate nature!"
					+"\nYou are ecofriendly!\nDo you want to see the vine?");
			String response = keyboard.nextLine();
			if(response.equals("yes")){
				URI chickens = new URI("https://www.youtube.com/watch?v=NsLKQTh-Bqo");
				d.browse(chickens);
			}
		} else {
			System.out.println("You are the tortilla vine! \nYou love mexican food!"
					+"\nYou love puns and food!\nDo you want to see the vine?");
			String response = keyboard.nextLine();
			if(response.equals("yes")){
				URI tortilla = new URI("https://www.youtube.com/watch?v=21jLmc_Il3o");
				d.browse(tortilla);
				
			}
		}
		

	}

}
