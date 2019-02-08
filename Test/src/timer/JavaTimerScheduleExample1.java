package timer;

import java.util.*;

public class JavaTimerScheduleExample1 {
	public static void main(String[] args) {
// creating timer task, timer  
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task is on");
			};
		};
		t.schedule(tt, new Date());
	}
}