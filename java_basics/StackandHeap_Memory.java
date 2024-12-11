package java_basics;

class Calculator
{
	int num=5;
	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;
	}
}


public class StackandHeap_Memory {
	public static void main(String[] args) {
		int data=10;
		Calculator obj=new Calculator();
		Calculator obj1=new Calculator();
		int r1=obj.add(3,4);
		//System.out.println(r1);
		obj.num=8;
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
}

//-- instance variable stored in object and object are in heap therefore we can say that instance variable created in heap.
//-- method declaration and definition is present in object but actual implementation present in stack frame of stack.
//-- local variable created in stack during call of method.
//-- stack frame of called method is present in stack area.
//-- st is reference variable created inside the current stack frame and it is reference variable store address of student object created in heap area.
//-- new Student() create object in heap area and pointed by his reference variable.