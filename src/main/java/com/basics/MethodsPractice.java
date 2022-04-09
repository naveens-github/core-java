package com.basics;

import java.util.ArrayList;
import java.util.List;

public class MethodsPractice {

    public void method10(){
    }

    public int method11(){
        return 10;
    }

    public double method12(){
        return 1.23D;
    }

    public List<String> method13(){
        List<String> list1 = new ArrayList<>();
        list1.add("Naveen");
        list1.add("Mahomes");

        return list1;
    }

    public List<Student> method14(){
        List<Student> list2 = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setName("Hill");

        list2.add(student);

        return list2;

    }
}
