package com.jdpattern.Esingleton.company;

public class Company {
    //static class private
    private static Company instance = new Company();

    public String name = "IBM";
    //method private
    private Company(){
        //Constructor
    }

    //static method public
    public static Company getInstance(){
        if(instance == null){
            instance= new Company();
        }
        return instance;
    }


}
