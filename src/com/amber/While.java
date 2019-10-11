package com.amber;

import java.util.Scanner;

public class While {
    private int principal;


    public void whilingOut(){

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Principal amount?");
            principal = scan.nextInt();
            if(principal > 1000 && principal < 1000000) break;
            System.out.println("Please enter an amount between 1K - 1M");
        }
        this.principal = principal;
    }
}
