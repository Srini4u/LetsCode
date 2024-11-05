package org.array;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        //int maxAreaOfWater = bruteForceMaxArea(height);
        int maxAreaOfWater = mostContainerArea(height);
        System.out.println("Max Area: "+maxAreaOfWater);
    }

    private static int bruteForceMaxArea(int[] verticalHeight){
        int maxArea = 0;
        for(int i =0; i < verticalHeight.length; i++){
            for(int j = i+1; j < verticalHeight.length; j++){
                int width = j - i;
                int minHeight = Math.min(verticalHeight[i], verticalHeight[j]);
                int area = width * minHeight;
                System.out.println("Width: "+width+" minHeight: "+minHeight+ "==> Area: "+area);

                //update the maxArea
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static int mostContainerArea(int[] verticalHeight){
        int maxArea = 0;
        int left = 0;
        int right = verticalHeight.length -1;

        while(left < right){
            int width = right-left;
            int minHeight = Math.min(verticalHeight[left], verticalHeight[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if(verticalHeight[left] < verticalHeight[right]){
                left++;
            }else{
                right--;
            }

        }

        return maxArea;
    }


}
