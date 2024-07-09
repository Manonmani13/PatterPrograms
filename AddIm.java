package com.proretention.scrm.calendar;

public class AddIm {
    public static void main(String[] args) {
        String n="ABC#$%78sdfsd";
        int cc=0,nc=0,sc=0;
        for(int i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if((c>='A' && c<='Z') || (c>='a'&& c<='z'))
                cc++;
            else if(c>='0' && c<='9' )
                nc++;
            else
                sc++;


        }
        System.out.println("cc "+cc +" nc "+nc+ " sn "+sc);
    }
}
