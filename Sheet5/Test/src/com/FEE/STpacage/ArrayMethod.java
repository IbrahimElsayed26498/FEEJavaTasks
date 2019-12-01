package com.FEE.STpacage;

public class ArrayMethod {
    public static double getMax(double a[]){
        double max = a[0];
        for(int i = 1; i < a.length; i++){
            if(max < a[i])
                max = a[i];
        }
        return max;
    }
    
    public static void reverse(int a[]) {
        int length = a.length - 1;
        int temp;
        for(int i = 0; i < a.length/2; i++){
            temp = a[i];
            a[i] = a[length];
            a[length] = temp;
            length--;
        }
    }
    
    public static int occurence(int a[], int x){
        int counter = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == x)
                counter++;
        }
        return counter;
    }
    
    public static int occurence(char a[], char x){
        int counter = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == x)
                counter++;
        }
        return counter;
    }
    
    public static char[] score(double a[]){
        int best = 100;
        char score [] = new char[a.length];
        double e;
        for(int i = 0; i < a.length; i++){
            e = a[i];
            if(e >= best - 10)
                score[i] = 'A';
            else if(e >= best - 20)
                score[i] = 'B';
            else if(e >= best - 30)
                score[i] = 'C';
            else if(e >= best - 40)
                score[i] = 'D';
            else
                score[i] = 'F';
            
        }
        
        return score;
    }
}
