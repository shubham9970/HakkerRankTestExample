package Threading;

import java.util.Scanner;

public class BasicCode extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
				//Scanner scan = new Scanner(System.in);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		BasicCode c=new BasicCode();
		c.start();
	}

}
