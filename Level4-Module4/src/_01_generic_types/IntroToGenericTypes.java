package _01_generic_types;

import java.util.Random;

// A Generic Type is a way to define one variable that can act as different types.
// Templates can be used in methods and classes. 
// The syntax for generic types are the angle brackets <>


public class IntroToGenericTypes {
	public static void main(String[] args) {
		IntroToGenericTypes i = new IntroToGenericTypes();
		
		String s = "taco";
		//Here we are calling calcStuff and passing in a String
		i.calcStuff(s, 5);
		
		Random r = new Random();
		//Here we are calling calcStuff and passing in a Random object
		i.calcStuff(r, 6);
		
		//Here we create two object of the SomeClass class and 
		//define them to be two different types, String and Integer
		SomeClass<String> scObj = new SomeClass<String>("sodapop");
		SomeClass<Integer> scObj2 = new SomeClass<Integer>(412);
	}
	
	//Here a generic  is created as part of the calcStuff method
	//The variable t can be any type: String, Object, Robot... whatever
	public <Generic> Generic calcStuff(Generic t, int r) {
		for (int i = 0; i < r; i++) {
			System.out.println(t);
		}
		
		return t;
	}
}

//Here a class is created that has a generic called AnotherGeneric
//Class generics must be a class, not a primitive data type: int, float, double, boolean, long, short, byte
class SomeClass<AnotherGeneric>{
	//Here the t variable can be any object type
	AnotherGeneric t;
	
	//Here the t2t variable can be any object type
	SomeClass(AnotherGeneric t2){
		this.t = t2;
	}
}


