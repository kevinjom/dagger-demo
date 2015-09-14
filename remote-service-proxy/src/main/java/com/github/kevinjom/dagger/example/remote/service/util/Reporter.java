package com.github.kevinjom.dagger.example.remote.service.util;

public abstract class Reporter {
    public static void report(String tag, String msg, Object... args) {
        String content = msg;

        if (args != null && args.length > 0) {
            content = String.format(msg, args);
        }
        StringBuilder sb = new StringBuilder().append("[").append(tag).append("] - ").append(content);
        System.out.println(sb.toString());
    }
}
