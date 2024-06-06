package com.jdpattern.Esingleton.company;

import com.xains.log.XAConsole;

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

        XAConsole.wdf(1, "C1 ADR : %s", "43;97", company1);
        XAConsole.wdf(1, "C1 ADR : %s", "43;97", company2);
        XAConsole.wdf(1, "C1 ADR : %s", "43;97", company3);

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
