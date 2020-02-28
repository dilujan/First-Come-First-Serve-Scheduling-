package kln.fct.architecture.calculation;

public class WaitingTime {

    //variable deceleration
    int ft;

    public int calWaiting(int i, int  []wt, int []tt, int []bt){

        wt[i] = tt[i] - bt[i];
        ft = wt[i];
        return  ft;

    }
}
