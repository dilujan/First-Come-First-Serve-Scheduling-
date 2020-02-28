package kln.fct.architecture.calculation;

public class AvgTurnaroundTime {

    //variable declaration
        int sum;

    public float avgTT(int [] tat){

        for(int i = 0; i < tat.length; i++){

            sum = sum + tat[i];

        }

        return (sum/tat.length);

    }
}
