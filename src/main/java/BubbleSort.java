package main.java;


    public class BubbleSort{
        public void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp=0;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j <n-1-i ; j++) {
                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;

                    }
                }

            }

        }



    public void printArray(int sortedArray[]) {
        // write your code here
        System.out.println("Sorted Array :");
        for (int i = 0; i <sortedArray.length ; i++) {
            System.out.print(sortedArray[i]+";");
        }

        }
    }

