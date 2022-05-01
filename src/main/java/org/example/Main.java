package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //first homework below
        System.out.println("123");
        System.out.println(first_class.first_method(20, 10));
        first_class.second_method(10);
        first_class.fourth_method("hi", 3);
        System.out.println(first_class.sixth_method(400));
        //second homework below
        int[] mas1={1,0,1,0,1};
        for(int i=0;i<5;i++)
        {
            if(mas1[i]==1)mas1[i]=0;
            else mas1[i]=1;
        }
        int[] mas2=new int[100];
        for(int i=0;i<100;i++)
        {
            mas2[i]=i+1;
        }
        int[] mas3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0;i<12;i++)
        {
            if(mas3[i]<6)mas3[i]=mas3[i]*2;
        }
        int[][] mas4=new int[10][10];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==j)
                {
                    mas4[i][j]=1;
                    mas4[i][10-j-1]=1;
                }
            }
        }
        //first
        for(int i=0;i<mas1.length;i++)System.out.println(mas1[i]);
        //second
        for(int i=0;i<mas2.length;i++)System.out.println(mas2[i]);
        //third
        for(int i=0;i<mas3.length;i++)System.out.println(mas3[i]);
        //fourth
        for(int i=0;i<mas4.length;i++)System.out.println(mas4[i][i]);
        //fifth
        for(int i=0;i<second_class.first_method(10,5).length;i++)System.out.println(second_class.first_method(10,5)[i]);
        //sixth
        System.out.println(Arrays.stream(mas2).max().getAsInt());
        //seventh
        int[] mas7={1,1,1,3};
        System.out.println(second_class.second_method(mas7));
    }
}
