package com.app.data;

import java.util.List;

public interface Sort <T extends  Comparable<T>>{

    public List<T> sort (List<T> list);
}
