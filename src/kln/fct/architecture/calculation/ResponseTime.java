package kln.fct.architecture.calculation;

public class ResponseTime {

    //variable deceleration
    int ft;

    public int calResponse(int i, int  []rt, int []tt, int []bt){

        rt[i] = tt[i] - bt[i];
        ft = rt[i];
        return  ft;

    }
}
