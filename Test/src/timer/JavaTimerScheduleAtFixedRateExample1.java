package timer;

import java.util.*;

public class JavaTimerScheduleAtFixedRateExample1 {
	public static void main(String[] args) {
// creating timer task, timer  
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println("Task Timer on Fixed Rate" + i);
				}
			};
		};
		t.scheduleAtFixedRate(tt, 1000, 1000);
	}
}