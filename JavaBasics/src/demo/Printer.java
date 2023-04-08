package demo;

public class Printer{
	public void printName(String name) {
		System.out.println("My name is"+ name);
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.printName(" Barkat");
		printer.printName(" Barkat My nike name is M"); 
		printer.printName(" Barkat. What is your name?");
		
	}

}
