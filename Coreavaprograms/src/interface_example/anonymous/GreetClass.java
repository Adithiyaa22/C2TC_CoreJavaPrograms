package interface_example.anonymous;

public class GreetClass implements GreetInterface{

	public String greet()
	{
		return "Hello";
	}
	
	public void display() {
		System.out.println(greet());
	}
}
