package timer;

import java.util.*;

public class JavaTimerScheduleAtFixedRateExample2 {
	public static void main(String[] args) {
// creating timer task, timer  
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task Timer on Fixed Rate");
			};
		};
		t.scheduleAtFixedRate(tt, 500, 10000);
	}
}