package com.jdpattern.Esingleton.company;


import java.util.ArrayList;
import java.util.List;

public class CompanyTestDrive {

    //Singleton and Static Object needs to release memory
    public static String staticStr = "";
    public String inClassStr = "";
    public static void main(String[] args) {

        CompanyTestDrive ct = new CompanyTestDrive();
        try {
            ct.MemoryTest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void MemoryTest() throws Exception{
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();
        Company company3 = Company.getInstance();

        StringBuilder sb = new StringBuilder();
        List<MemoryClass> list = new ArrayList<>();
        for(int i=0; i<10000; i++){
            //String concatenation causes very large heap memory allocation
            //staticStr += "addString";
            //inClassStr += "addString";

            //list.add(new MemoryClass("name"+i, "12"+i, "united states of america area-"+i));
            sb.append("addString");
        }
        staticStr = sb.toString();
        sb = null;
        Thread.sleep(60000);

    }
}
