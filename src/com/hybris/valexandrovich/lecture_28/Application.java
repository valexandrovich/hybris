package com.hybris.valexandrovich.lecture_28;

import com.hybris.valexandrovich.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("Mike", 3500, "Accounting"));
        hashSet.add(new Employee("Paul", 3000, "Admin"));
        hashSet.add(new Employee("Peter", 4000, "IT"));
        hashSet.add(new Employee("Angel", 2000, "Maintenance"));

        ArrayList<Employee> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        for (Employee employee : list){
            System.out.println(employee);
            Logger.addLine(String.valueOf(employee));
        }


    }
}
