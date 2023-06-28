package ch12_thread.sec01_single;

import java.awt.Toolkit;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(1000);
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}
	}

}
