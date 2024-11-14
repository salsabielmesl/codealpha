package javaintern;
import java.util.Scanner;
public class onlinequizplatform {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		double b = 0.0;
		boolean is_running = true;
		
		System.out.println("Welcom to this application!");
		
		while(is_running) {
			System.out.println("Choose option:");
			System.out.println("1) deposit");
			System.out.println("2) withdraw");
			System.out.println("3) check the balance");
			System.out.println("4) exit");
			
			int c = in.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("enter deposit amount: ");
				double dep = in.nextDouble();
				if(dep>0) {
					b+=dep;
					System.out.println("deposited: " + dep);
				}else {
					System.out.println("Invalid");
				}
				break;
			case 2:
				System.out.println("enter withdrawl amount: ");
				double wdrawl = in.nextDouble();
				if(wdrawl>0 && wdrawl<=b) {
					b-=wdrawl;
					System.out.println("withdrew: " + wdrawl);
				}else {
					System.out.println("Invalid or insufficient");
				}
				break;
			case 3:
				System.out.println("current balance: " + b);
				break;
			case 4:
				is_running = false;
				System.out.println("exiting!");
				break;
			default:
				System.out.println("Invalid. Please try again!");
				}
			}

		}

	}


