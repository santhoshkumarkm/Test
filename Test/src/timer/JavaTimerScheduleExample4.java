package timer;

import java.util.*;

public class JavaTimerScheduleExample4 {
	public static void main(String[] args) {
// creating timer task, timer  
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					System.out.println("working on " + i);

				}
			};
		};
		t.schedule(tt, new Date(), 10);
	}
}