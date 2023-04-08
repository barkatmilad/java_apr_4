package demo2;

import demo.Calculator;
import demo.Months;
import demo.Printer;

public class Test2 {public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(1, 10);
	
	//Call printName() method from printer class in this class;
	//Class object = new Class();
	Printer printer = new Printer();
	printer.printName("Barkat");
	// call march() method from months class in this class
	Months months = new Months();
	months.march("Latifa wants to celebrate this day");
	Human.exam();
	
	}
	public void good () {
		System.out.println(" I am trying to be good person");
	}
}

