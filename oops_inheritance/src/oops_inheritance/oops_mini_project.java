package oops_inheritance;

import java.util.*;

class Video {
	private String videoName;
	private boolean checkout;
	private int rating;

	Video(String name) {
		this.videoName=name;
		this.checkout=false;
		this.rating=0;
	}

	String getName() {
		return videoName;
	}

	void doCheckout() {
		checkout=true;
	}

	void doReturn() {
		checkout=false;
	}

	void receiveRating(int rating) {
		this.rating=rating;
	}

	int getRating() {
		return rating;
	}

	boolean getCheckout() {
		return checkout;
	}

}

class VideoStore {
	Video[] store=new Video[100];
	int count=0;
	void addVideo(String name) {
		store[count++]=new Video(name);
		System.out.println("Video "+name+" added successfully.");
	}

	void doCheckout(String name) {
		for(int i=0;i<count;i++) {
			if(store[i].getName().equals(name)) {
				store[i].doCheckout();
				System.out.println("Video "+name+" checked out successfully.");
				return;
			}
		}
		System.out.println("Video \"" + name + "\" not found.");
	}

	void doReturn(String name) {
		for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
	}

	void receiveRating(String name, int rating) {
		for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
	}

	void listInventory() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Video Name\t|\tCheckout Status  |\tRating");
		for (int i = 0; i < count; i++) {
            System.out.printf("%-16s\t|\t%-15s\t|\t%d\n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }
		System.out.println("--------------------------------------------------------");
	}
}

public class oops_mini_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		VideoStore vs=new VideoStore();
		while (true) {
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.print("1.Add Videos : \n2.Check Out Video : \n3.Return Video :\n4.Receive Rating :\n5.List Inventory :\n6.Exit :\nEnter your choice(1..6): ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1:
				System.out.print("Enter the name of the video you want to add: ");
				vs.addVideo(sc.nextLine());
				break;
			case 2:
				System.out.print("Enter the name of the video you want to check out: ");
				vs.doCheckout(sc.nextLine());
				break;
			case 3:
				System.out.print("Enter the name of the video you want to Return: ");
				vs.doReturn(sc.nextLine());
				break;
			case 4:
				System.out.print("Enter the name of the video you want to Rate: ");
				String name=sc.nextLine();
				System.out.println("Enter the rating for this video: ");
				int rating=sc.nextInt();
				vs.receiveRating(name, rating);
				break;
			case 5:
				vs.listInventory();
				break;
			case 6:
				System.out.println("Exiting...!! Thanks for using the application.");
				return;
			default:
				System.out.println("Invalid choice. Please enter between 1 and 6.");
			}
			
		}

	}

}
