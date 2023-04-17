package com.kbstar.app;

import com.kbstar.frame.TV;
import com.kbstar.tv.*;

public class App {
    public static void main(String args[]){
        TV tv = new LGTV();
        tv.turnOn();
    }
}
