package com.company;

public class Faculty {
    private int size;
    private int group;
    private String name;
    private double minimumGrid;

    Faculty() {
    }

    public Faculty(String name, int size, int group, double minimumGrid) {

        this.size = size;
        this.group = group;
        this.name = name;
        this.minimumGrid = minimumGrid;
    }


    public int getSize() {

        return size;
    }


    public int getGroup() {

        return group;
    }


    public String getName() {

        return name;
    }


    public double getMinimumGrid() {

        return minimumGrid;
    }


}
