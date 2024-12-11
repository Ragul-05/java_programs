package java_basics;

public class CreationofArray {
	public static void main(String[] args) {
//      int nums[]= {3,7,2,4};
//		nums[1]=6;
//		System.out.println(nums[1]);
		
		int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		
	}
}

/*
 #1
Ways to create array in java
a)Literal notation
Literal notation: int[] arr = {1, 2, 3};
b)Object notation
Array constructor: int[] arr = new int[]{1, 2, 3}; // this is not literal notation ,this is object notation with assignment of value
Array constructor with size: int[] arr = new int[3]; arr[0] = 1; arr[1] = 2; arr[2] = 3; //in this we manually assign value but by default 0 is assign in this case 

#2
default value which store array when we create using object notation for primitive datatype.

-- When you create an array of primitive data types in Java using the object notation, the default value stored in the array depends on the data type:

 -- int arrays: default value is 0
 -- boolean arrays: default value is false
 -- char arrays: default value is '\u0000' (null character)
 -- byte, short, long arrays: default value is 0
 -- float arrays: default value is 0.0f
 -- double arrays: default value is 0.0d
 */