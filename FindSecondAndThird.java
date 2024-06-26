package com.proretention.scrm.calendar;

import java.util.Arrays;

public class FindSecondAndThird {
    public static void main(String[] args) {
        int no[]={4,5,6,8,0,1,2,3,7,9};
        String n="";
        for(int i=0;i<=no.length-1;i++)
        {
            for(int j=0;j<=no.length-1;j++)
            {
                if(no[i]>no[j]|| i == no.length - 1)
                {
                   if(!n.contains(String.valueOf(no[j]))){
                       n+=no[j];
                   }
                }
            }
        }
        System.out.println(n);

        System.out.println(n.charAt(n.length()-2));
        System.out.println(n.charAt(n.length()-3));
    }
}
