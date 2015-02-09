package org.javaserverfaces.chapter02;

import java.util.Random;

/**
 * @author juneau
 */
public class RandomBean {
    Random randomGenerator = new Random();
    private int randomNumber = 0;

    /**
     * @return the randomNumber
     */
    public int getRandomNumber() {
        randomNumber = randomGenerator.nextInt();
        return randomNumber;
    }
    
}
