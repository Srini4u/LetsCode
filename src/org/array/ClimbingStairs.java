package org.array;

public class ClimbingStairs {

    public static void main(String[] args){
        int n = 3; //total steps
        int resultWays = climb_stairs(0, n);
        System.out.println("resultWays: "+resultWays);

        int[] memoryArray = new int[n+1];
        int betterWays = climb_stairs_array(0, n, memoryArray);
        System.out.println("betterWays: "+betterWays);
    }

    public static int climb_stairs(int i, int n){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        return climb_stairs(i+1, n) + climb_stairs(i+2, n);
    }

    public static int climb_stairs_array(int i, int n, int[] memoryArray){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        if(memoryArray[i] > 0){
            return memoryArray[i];
        }
        memoryArray[i] = climb_stairs_array(i+1, n, memoryArray) + climb_stairs_array(i+2, n, memoryArray);
        return memoryArray[i];
    }

}
