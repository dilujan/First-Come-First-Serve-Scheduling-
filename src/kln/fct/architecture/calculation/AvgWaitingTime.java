package kln.fct.architecture.calculation;

public class AvgWaitingTime {

    //variable declaration
    int sum;

    public float avgWt(int [] wt){

        for(int i = 0; i < wt.length; i++){

            sum = sum + wt[i];

        }

        return (sum/wt.length);

    }
}
