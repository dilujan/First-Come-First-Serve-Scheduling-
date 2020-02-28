package kln.fct.architecture.main;

import kln.fct.architecture.calculation.*;
import kln.fct.architecture.output.Display;
import kln.fct.architecture.input.Input;
import kln.fct.architecture.input.TakeArrivalTime;
import kln.fct.architecture.input.TakeBurstTime;
import kln.fct.architecture.input.TakeNoOfProcess;

public class Main {
    public static void main(String [] args){

        //variable declaration

        int nop;

        TakeNoOfProcess takeNoOfProcess = new TakeNoOfProcess();
        nop = takeNoOfProcess.getInput();

        int pid[] = new int[nop];

        for(int p = 0; p < nop; p++){

            pid[p] = p+1;
        }

        int at[] = new int[nop];
        int bt[] = new int[nop];
        int tt[] = new int[nop];
        int rt[] = new int[nop];
        int wt[] = new int[nop];
        int ct[] = new int[nop];

        Input takeArrivalTime = new TakeArrivalTime();

        for(int a = 0; a < nop; a++){

            at[a] = takeArrivalTime.getInput(a);

        }

        Input takeBurstTime = new TakeBurstTime();

        for(int b = 0; b < nop; b++) {

            bt[b] = takeBurstTime.getInput(b);

        }

        CompletionTime completionTime = new CompletionTime();
        ResponseTime responseTime = new ResponseTime();
        TurnaroundTime turnaroundTime = new TurnaroundTime();
        WaitingTime waitingTime = new WaitingTime();

        for(int c = 0; c < nop; c++){

            ct[c] = completionTime.calCompletionTime(c,ct,at,bt);
            tt[c] = turnaroundTime.calTurnaround(c,tt,ct,at);
            wt[c] = waitingTime.calWaiting(c,wt,tt,bt);
            rt[c] = responseTime.calResponse(c,rt,tt,bt);

        }

        Display display = new Display();

        display.display("Process | Turnaround time | Response time | Waiting time");

        for(int k = 0; k < nop; k++){

            display.display(pid[k]+ " \t\t\t\t " +tt[k]+ " \t\t\t\t " +rt[k]+ " \t\t\t\t " +wt[k]);

        }

        AvgTurnaroundTime avgTurnaroundTime = new  AvgTurnaroundTime();
        Display tatOut = new Display();
        tatOut.display("Average turnaround time: "+avgTurnaroundTime.avgTT(tt));

        AvgWaitingTime avgWaitingTime = new AvgWaitingTime();
        Display avgOut = new Display();
        avgOut.display("Average turnaround time: "+ avgWaitingTime.avgWt(wt));

    }
}
