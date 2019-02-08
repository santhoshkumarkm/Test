package timer;

import java.util.*;

public class JavaTimerCancleExample1 {
	public static void main(String[] args) {
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("working on");
					if (i >= 5) {
						System.out.println("Task is stop");
						t.cancel();
						break;
					}
				}
			};
		};
		t.schedule(tt, 1000, 1000);
	}
}