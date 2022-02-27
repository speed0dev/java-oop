package com.app.data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    //
    @Test
    void callA(){

        BubbleSort<Integer> b = new BubbleSort<Integer>();
        List<Integer> rList = b.sort(List.of(1,2,3,4,5));

        assertEquals(List.of(12,3,5,6), rList);


    }


    @Test
    void callTest() {
        BubbleSort<Integer> b = new BubbleSort<Integer>();
        String r = b.callTest();
        assertEquals("AAA", r);
    }
}