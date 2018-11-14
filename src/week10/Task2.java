package week10;

import java.util.Random;

public class Task2 {
    static void bubbleSort(double arr[])
    {
        double n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
    }
    public static void main(String[] args){
        Random rd = new Random();
        double[] a = new double[1000];
        for (int i = 0 ;i<1000 ;i++)
            a[i] =(rd.nextDouble())*235;
        bubbleSort(a);
    }
}
