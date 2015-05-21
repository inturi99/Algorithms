package com.technoidentity.algorithms;
import java.util.Arrays;
import java.util.Random;
class AnalysisAlgorithms{
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public static int countStart(int  n) {
        int []  n1= new int[n];
        for (int i = 0; i < n; i++)
            n1[i] = (int)(Math.random());
        int cnt1= count(n1);
        return cnt1 ;
    }

    public static void main(String[] args)  {
        Stopwatch timer=new Stopwatch();
        int n=countStart(1000);
        System.out.println("Count "+ n + " elapsed time "+timer.elapsedTime());

    }

}
