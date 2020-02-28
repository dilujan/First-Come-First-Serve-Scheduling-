package kln.fct.architecture.input;

import java.util.Scanner;

public class TakeArrivalTime implements Input {

    //variable declaration

    int at;

    public int getInput(int n){

        System.out.println("Enter the Arrival Time of "+(n+1)+" : ");

        Scanner sc = new Scanner(System.in);
        at = sc.nextInt();

        return at;
    }

}
