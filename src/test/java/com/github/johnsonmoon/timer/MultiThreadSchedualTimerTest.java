package com.github.johnsonmoon.timer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Xuyh at 2016/08/04 下午 04:29.
 */
public class MultiThreadSchedualTimerTest {
    public static void test(String args[]) {
        //testExecute();
    }

    public static void testExecute() {
        MultiThreadScheduleTimer timer = new MultiThreadScheduleTimer(2);
        timer.execute(new Task() {
            private int i = 0;

            @Override
            public void taskForJob() {
                i++;
                System.out.println("执行" + i + "次");
            }
        }, 3000, 2000);
        try {
            if (new BufferedReader(new InputStreamReader(System.in)).readLine().equals("stop")) {
                timer.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
