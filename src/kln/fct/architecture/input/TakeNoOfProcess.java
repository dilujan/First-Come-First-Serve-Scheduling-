package kln.fct.architecture.input;

import java.util.Scanner;

public class TakeNoOfProcess {

    //variable declaration

    int nop;

    public int getInput(){

        System.out.println("Enter no of Process: ");

        Scanner sc = new Scanner(System.in);
        nop = sc.nextInt();

        return nop;
    }

}
