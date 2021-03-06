package com.andrewgiang.textspritzer.lib;

/**
 * Created by andrewgiang on 3/19/14.
 * 
 * 
 * Edited by nlantz on 3/22/14
 */
public class DefaultDelayStrategy implements DelayStrategy {
    @Override
    public int delayMultiplier(String word) {
        if (word.contains(".") || word.contains("?") || word.contains("!")) {
            return 3;
        }else if( word.length() >= 13) {
            return 2;
        }
        return 1;
    }
}
