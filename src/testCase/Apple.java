package testCase;

public class Apple extends Sb implements Food, Fruit {
	
	public Apple(){}
	
	public Apple(String color){
		this.color = color;
	}

	private String color;
	
	public void state(){
		System.out.println("I am an apple");
	}
	
	public String showColor(){
		return color + "123";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

class Sb extends Kb{
	
}

class Kb{
	
}
