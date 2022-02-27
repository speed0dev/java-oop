package com.app.oop;

import com.app.data.BubbleSort;
import com.app.data.Sort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args){
        //
        System.out.println("@@@ main run ####");

        Sort<String> sort =  new BubbleSort<String>();
        sort.sort(Arrays.asList(args));

    }


    public String callApp(){
        return "App call";

    }

}
