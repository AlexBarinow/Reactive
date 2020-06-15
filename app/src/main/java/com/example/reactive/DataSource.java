package com.example.reactive;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public  static List<Anything> createAnythingList(){
        List<Anything> anythingList = new ArrayList<>();
        anythingList.add(new Anything("Text1", "title 1"));
        anythingList.add(new Anything("Text 2", "Title 2"));
        return anythingList;
    }

}
