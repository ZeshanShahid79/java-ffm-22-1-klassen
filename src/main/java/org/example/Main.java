package org.example;

import people.Student;

public class Main {
    public static void main(String[] args) {

        FlowerPot anasPot = new FlowerPot();
        anasPot.color = "braun";
        anasPot.size = "middle";
        anasPot.shape = "round";
        anasPot.material = "iron";
        anasPot.diameter = 30;
        anasPot.hole = true;


        FlowerPot stevensPot = new FlowerPot();
        stevensPot.color = "silver";
        stevensPot.size = "large";
        stevensPot.shape = "curved";
        stevensPot.material = "stone";
        stevensPot.diameter = 60;
        stevensPot.hole = false;


        Student zeshan = new Student();
        zeshan.setProgrammingLanguage("Java");
        zeshan.setGender("Male");
        zeshan.setAge(29);
        System.out.println("Zeshan´s age is "+zeshan.getAge());
        System.out.println(zeshan);


    }

}