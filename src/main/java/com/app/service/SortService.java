package com.app.service;

import com.app.data.BubbleSort;
import com.app.data.Sort;

import java.util.List;

public class SortService {

    private Sort<String> sort;

    public SortService(Sort<String> sort){
        sort = new BubbleSort<String>();
    }


    public List<String> sort(List<String> list){

        return sort.sort(list);

    }

}
