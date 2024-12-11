package java_basics;


/**
class Calculator{
	int a;
	public int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
}

public class Demo {

	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		int result = calc.add(num1,num2);
		System.out.println(result);
	}
}
	**/

class Computer
{
	public void playMusic()
	{
		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}
}


public class Method {
	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.playMusic();
		String src=obj.getMeAPen(10);
		System.out.println(src);
	}
}
/*
Method overloading:- In Java, there can be more than one method with the same name but the number of parameters or type of parameters should be different.

Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java.
In Method overloading compared to parent argument, child argument will get the highest priority.

Different ways of Method Overloading in Java:-
1. Changing the number of parameters
Method overloading can be achieved by changing the number of parameters while passing to different methods.

2. Changing Data Types of the Arguments
If methods have the same name but have different parameter types then also methods are considered as overloaded.

3. Changing the Order of the Parameters of Methods
By rearranging the parameters of two or more overloaded methods.  */