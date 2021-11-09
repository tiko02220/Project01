package com.company;

public class University extends Faculty {


    protected int id;
    protected String universityName;


    public static class Yale extends University {

        Faculty Business = new Faculty("Business", 10, 10, 40.4);
        Faculty ComputerScience = new Faculty("ComputerScience", 10, 10, 40.4);

        Yale(int id, String universityName) {
            this.universityName = universityName;
            this.id = id;
            System.out.println(getUniversityName());
        }


        public String getUniversityName() {
            return universityName;
        }
    }

    public static class Cambridge extends University {

        Faculty Business = new Faculty("Business", 30, 30, 30.4);
        Faculty ComputerScience = new Faculty("ComputerScience", 30, 30, 30.4);

        Cambridge(int id, String universityName) {
            this.universityName = universityName;
            this.id = id;
            System.out.println(getUniversityName());
        }


        public String getUniversityName() {
            return universityName;
        }
    }

}
