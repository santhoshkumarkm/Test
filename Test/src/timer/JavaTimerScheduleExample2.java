package timer;

import java.util.*;

public class JavaTimerScheduleExample2 {
	public static void main(String[] args) {
// creating timer task, timer  
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("working on");
				}
			};
		};
		t.schedule(tt, new Date());
	}
}