package com.vincent.vincentlibrary;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VincentLog {
    public final static String TAG = "VincentLog";

    public static void log(String msg) {
        Logger.getLogger(TAG).log(Level.INFO, msg);
    }
}
