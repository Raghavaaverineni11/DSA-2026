package org.example;

public class Run {

    public static void main(String[] args){
        int arr[]={2,0,3,0,7};
        int left=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
