package com.test.mavenproject1.p6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CoreJavaSchedulerExample {

	public static void main(String[] args) {
		// create a ScheduledExcecutorService with a single thread
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
		
		//DEFINE THE TASK TO BE Scheduled
		Runnable task=()->{System.out.println("Task executed at:" +System.currentTimeMillis());
		};
		  
		//schedule the task to run  after an initial delay of second.
		//and then repeatedly every 2 seconds
		scheduler.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
		
		//optionally ,shutdown the scheduler after sometime (eg 10s)
		//This is important to prevent the program from running indefinitely
		scheduler.schedule(() ->{ scheduler.shutdown();
		System.out.println("scheduler shut down");
		},10,TimeUnit.SECONDS);
		
		
		
		
		
		
		
		

	}

}
