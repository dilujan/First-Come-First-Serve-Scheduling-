package kln.fct.architecture.calculation;

public class TurnaroundTime {

    //variable deceleration
        int ft;

    public int calTurnaround(int i, int  []tt, int []ct, int []at){

        tt[i] = ct[i] - at[i];
        ft = tt[i];
        return  ft;

    }
}
