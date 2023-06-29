package com.snaping.waitandnotify;

public class Desk {
    /*
    *
    * 作用：控制生产者和消费者执行
    * */

    // 是否有面条 false：没有面条 true：有面条
    public static boolean foodFlag = false;
    public static int count = 10;

    public static Object lock = new Object();

}
