package com.example.myapplication2.Kotlin.lesson4;

import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) {
        //как бы использовали find let
        List<String> list = new ArrayList<>();
        String outer = null;
        for (String it: list){
            if (!it.isEmpty()){
                outer = it;
                break;
            }
        }
        if (outer != null)
            System.out.println(outer);


    }


}
