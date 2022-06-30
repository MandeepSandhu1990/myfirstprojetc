package com.company;

import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person(12));
        set.add(new Person(4));
        set.add(new Person(10));
        System.out.println(set);
    }
        static class Person implements Comparable<Person>{
            private int age;

            @Override
            public String toString() {
                return "Person{" +
                        "age=" + age +
                        '}';
            }

            public Person(int age) {
                this.age = age;
            }

            @Override
            public int compareTo(Person o) {
                return this.age-o.age;
            }
        }

//        List<String> list = new ArrayList<>();
//        list.add("mandeep");
//        list.add("sandhu");
//        list.stream().count();
//        Collections.sort(list);
//        List<Employeee> list1 = new ArrayList<>();
//        list1.add(new Employeee("mandeep"));
//        list1.add(new Employeee("sandhu"));

//        Collections.sort(list1);
//        Vector v = new Vector();
//        v.add(2);
//
//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        for(String s:list){
//
//        }

    }


