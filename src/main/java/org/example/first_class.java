package org.example;

public class first_class
{
    static boolean first_method(int a,int b)
    {
        if(a+b>10 && a+b<20) {
            return true;
        }
        else return false;
    }
    static void second_method(int a)
    {
        if(a>=0) {
            System.out.println("positive");
        }
        else System.out.println("negative") ;
    }
    static boolean third_method(int a)
    {
        if(a>0) {
            return true;
        } else if (a<0)
        {
            return false;
        }
        return true;
    }
    static void fourth_method(String a,int count)
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(a);
        }
    }
    static boolean sixth_method(int a)
    {
        if(a%4==0 && a%100!=0 || a%400==0) {
            return true;
        } else return false;
    }
}

