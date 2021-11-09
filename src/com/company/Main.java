package com.company;


public class Main {

    public static void main(String[] args) {
        University.Yale Yale = new University.Yale(1, "Yale");
        University.Cambridge Cambridge = new University.Cambridge(2, "Cambridge");
        Student Bob = new Student("Bob", Yale.ComputerScience);
        Student Sam = new Student("Sam", Cambridge.ComputerScience);


    }

}
