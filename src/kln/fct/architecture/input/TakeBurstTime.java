package kln.fct.architecture.input;

import java.util.Scanner;

public class TakeBurstTime implements Input {

    //variable declaration

    int bt;

    public int getInput(int n){

        System.out.println("Enter the Burst Time of "+(n+1)+" : ");

        Scanner sc = new Scanner(System.in);
        bt = sc.nextInt();

        return bt;
    }

}
