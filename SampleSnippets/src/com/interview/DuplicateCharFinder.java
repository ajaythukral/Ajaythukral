package com.interview;

public class DuplicateCharFinder {


	
	public static int sortData(char[] charArr)
	{
		int duplicateCount=0;
		boolean recflag=true;
		
		while (recflag== true) {
		
		for (int i = 0; i < charArr.length-1; i++) {
			if  (charArr[i]==charArr[i+1])
					{
					duplicateCount++;
					break;
					
					}else {
						recflag=false;
					}
		}
			
		}
		return duplicateCount;
	}
	
	public static int  sortData1(char[] charArr)
	{
		
		
		for (int i = 0; i < charArr.length; i++) {
			int distinct=0;
			for (int j =i+1; j < charArr.length; j++) {
				
				
				if(charArr[i]==charArr[j])
				{
				
					distinct=distinct+1;
					}
				
			
			}
			if(distinct>1)
			System.out.println("Value of occurerence of "+ charArr[i]+" is="+ distinct);
		}
			
	return 0;
	}
	
	
//Find Duplicate elements in an array	
	public static void  findDuplicateNumber(char[] charArr)
	{
		
		
		for (int i = 0; i < charArr.length; i++) {
			
			for (int j = i+1; j < charArr.length; j++) {
				
				
				if(charArr[i]==charArr[j])
				{
				System.out.println("Duplicate elements are " + charArr[i] );
				
				}
				
			}
		}

	}
	
	//Sort array in ascending order
	
	public static void  SortarrayAsc(int[] charArr)
	{
		
		
		int[] sortedArray=charArr;
		for (int i = 0; i < sortedArray.length; i++) {
			
			for (int j = i+1; j < sortedArray.length; j++) {
				
				
				if(sortedArray[j]<= sortedArray[i])
				{
					sortedArray[i]=sortedArray[j];
				
						
				}
				
			}
		}
		
		System.out.println("Sorted Array is "+ sortedArray);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println("Sorted Array element is"+ sortedArray[0]);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(DuplicateCharFinder.sortData("ajay".toCharArray()));
		int testArray[]= {2,4,15,8,7,10,13};
		SortarrayAsc(testArray);
		
	//	findDuplicateNumber("Test ajjjjjjjay".toCharArray());
	}

}
