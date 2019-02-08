package timer;

import java.util.*;

public class JavaTimerScheduleAtFixedRateExample1 {
	
	
	public static void main(String[] args) {
// creating timer task, timer  
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			int index;
			@Override
			public void run() {
				System.out.println("Index : " + index);
				for (int i = 1; i <= 10; i++) {
					System.out.println("Task Timer on Fixed Rate" + i);
				}
				index++;
			};
		};
		t.scheduleAtFixedRate(tt, 1000, 100);
	}
}