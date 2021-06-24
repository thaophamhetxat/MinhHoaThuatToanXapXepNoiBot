package com.codegym;

import java.util.Scanner;

public class BulbeSortStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size ");
         int size = scanner.nextInt();
         int []list  = new int[size];
        System.out.println("Enter "+list.length+" values:");
        for(int i=0;i<list.length;i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list");
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }

        System.out.println(" begin sort process..");
        bubleSortStep(list);
    }
    public static void bubleSortStep(int[]list){
        boolean needNextPass = true;
        for(int k=1;k< list.length&&needNextPass;k++){
            needNextPass = false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){

                    System.out.println("swap "+list[i]+" with "+ list[i+1]);
                int temp = list[i];
                list[i]=list[i+1];
                list[i+1]=temp;
                needNextPass = true;
                }
            }
            if(needNextPass==false){
                System.out.println("arr may be sorted");
                break;
            }
            System.out.println("list after the "+k+" sort");
            for(int j=0;j<list.length;j++){
                System.out.println(list[j]);
            }
            System.out.println();

        }
    }
}
