package org.frozenarc.standalone;

/*
 * Author: manan
 * Date: 5/18/19 3:37 PM
 * Platform: Linux
 */
public class RabbitPair {

    public static int noOfPairAtMonth(int n) {
        if(n == 0) {
            throw new RuntimeException("Month should be greater then 0");
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        return noOfPairAtMonth(n - 2) + noOfPairAtMonth(n - 1);
    }
}
