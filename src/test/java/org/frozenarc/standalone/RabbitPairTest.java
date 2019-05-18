package org.frozenarc.standalone;

import org.junit.Test;

/*
 * Author: manan
 * Date: 5/18/19 3:43 PM
 * Platform: Linux
 */
public class RabbitPairTest {

    @Test
    public void test() {
        System.out.println(RabbitPair.noOfPairAtMonth(1));
        System.out.println(RabbitPair.noOfPairAtMonth(2));
        System.out.println(RabbitPair.noOfPairAtMonth(3));
        System.out.println(RabbitPair.noOfPairAtMonth(4));
        System.out.println(RabbitPair.noOfPairAtMonth(5));
        System.out.println(RabbitPair.noOfPairAtMonth(6));
        System.out.println(RabbitPair.noOfPairAtMonth(7));
        System.out.println(RabbitPair.noOfPairAtMonth(8));
    }
}
