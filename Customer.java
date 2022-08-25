package collections;
import java.util.Scanner;
public class Customer {
	static Hotel h=new Hotel();
	static char choice;
	static Food f;
	static Veg v;
	static NonVeg n;
	static boolean flag=true;
	static double cost;
	static double price;
	static int count=0;
	static double billing() {
		cost+=getPrice();
		System.out.println("The total amount payable is: "+cost);
		return cost;	
	}
	public static double getPrice() {
		return price;
	}
	public static void setPrice(double price) {
		Customer.price = price;
	}
	static void helper1() {
		Scanner sc=new Scanner(System.in);
		v=h.orderFood1(choice);
		if(v instanceof Idly) {
			setPrice(40.0);
			System.out.println("The price of the Idly is: "+getPrice());
			billing();
			System.out.println("Idly Ordered Successfully....\n");
		}
		else if(v instanceof Dosa) {
			setPrice(50.0);
			System.out.println("The price of the Dosa is: "+getPrice());
			billing();
			System.out.println("Eating Dosa....\n");
		}
		else if(v instanceof Poori) {
			setPrice(55.0);
			System.out.println("The price of the Poori is: "+getPrice());
			billing();
			System.out.println("Eating Poori....\n");
		}
		else {
			char ch;
			System.out.println("Sorry, Not available in Today's Menu....");
			System.out.println("Would you like to have something else?\n Press y for Yes and n for No....");
			ch=sc.next().charAt(0);
			if(ch=='y') {
			}
			else {
				System.out.println("Thank You.... Please Visit again!!");
				System.out.println("The total amount payable is: "+cost);
				flag=false;
			}
		}
	}
	static void helper2() {
		Scanner sc=new Scanner(System.in);
		n=h.orderFood2(choice);
		if(n instanceof Biriyani) {
			setPrice(100.0);
			System.out.println("The price of the Biryani is: "+getPrice());
			billing();
			System.out.println("Eating Idly....\n");
		}
		else if(n instanceof Soup) {
			setPrice(150.0);
			System.out.println("The price of the Soup is: "+getPrice());
			billing();
			System.out.println("Eating Dosa....\n");
		}
		else {
			char ch;
			System.out.println("Sorry, Not available in Today's Menu....");
			System.out.println("Would you like to have something else?\n Press y for Yes and n for No....");
			ch=sc.next().charAt(0);
			if(ch=='y') {
			}
			else {
				System.out.println("Thank You.... Please Visit again!!");
				System.out.println("The total amount payable is: "+cost);
				flag=false;
			}
		}
	}   

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		flag=true;
		while(flag) {
			System.out.println("Today's Menu....\n 1.Veg Items\n 2.Non-Veg Items");
			System.out.println("Enter your choice");
			choice=sc.next().charAt(0);
			if(choice=='1') {
				System.out.println("Veg menu is as Follows...\n 1: Idly\n 2: Dosa\n 3: Poori");
				System.out.println("Enter your Choice!");
				choice=sc.next().charAt(0);
				helper1();	
			}
			else if(choice=='2') {
				System.out.println("Non-Veg menu is as Follows...\n 1: Biryani\n 2: Soup");
				System.out.println("Enter your Choice!");
				choice=sc.next().charAt(0);
				helper2();	
			}
			else {
				char ch;
				System.out.println("Sorry, Not available in Today's Menu....");
				System.out.println("Would you like to have something else?\n Press y for Yes and n for No....");
				ch=sc.next().charAt(0);
				if(ch=='y') {
				}
				else {
					System.out.println("Thank You.... Please Visit again!!");
					System.out.println("The total amount payable is: "+cost);
					flag=false;
				}
			}
		}
	}

}