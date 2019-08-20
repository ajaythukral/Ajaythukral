package com.interview;


class RepeatElement  
{ 
    void printRepeating(int arr[])  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < arr.length; i++)  
        { 
            for (j = i + 1; j < arr.length; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        RepeatElement repeat = new RepeatElement(); 
        int arr[] = {4, 2, 4, 5,4, 2, 3, 1}; 
        int arr_size = arr.length; 
        repeat.printRepeating(arr); 
    } 
}