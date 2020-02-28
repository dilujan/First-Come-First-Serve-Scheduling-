package kln.fct.architecture.calculation;

public class CompletionTime {

    //variable declaration

    int ft;

    public int calCompletionTime(int n, int [] ct, int [] at, int []bt){

        if(n == 0){

            ct[n]=at[n]+bt[n];
        }

        else{
            if( at[n] > ct[n-1])
            {
                ct[n] = at[n] + bt[n];
            }
            else
                ct[n] = ct[n-1] + bt[n];
        }

        ft=ct[n];

        return ft;
    }
}
