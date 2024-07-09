package com.proretention.scrm.calendar.utill;

public class StaticDynamic {
    public static void main(String[] args) {
        Parent obj=new Child();
        obj.print();
    }
}

class  Parent{
    public static void  print()
    {
        System.out.println("This message is from parent");
    }
}

class Child extends Parent{
    public static  void print()
    {
        System.out.println("This message is from child");
    }
}

