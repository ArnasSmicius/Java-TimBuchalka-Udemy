package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Arnas on 2017.05.23.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please write a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x = 1; x < 13 ; x++){
            System.out.println(x + " times " + this.x + " equals: " + x * this.x);
        }
    }
}
