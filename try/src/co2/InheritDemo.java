package co2;

public class InheritDemo {
	double startTime=0;
    public static void main(String[] args) {    	
       Subclass demo = new Subclass();
       demo.submethod();
   }
}
class Superclass {
	public Superclass() {
		System.out.println("Superclass");}
	public void supermethod() {
		System.out.println("supermethod");}
}

class Subclass extends Superclass{
	private int startTime;
	public Subclass() {
		super();
//		super.supermethod();
		System.out.println("Subclas");
	}
	public void submethod() {
		startTime= 3;
		System.out.println("submethod");}
	public void subsubmethod() {
		System.out.println("submethodddddddddddd");
	}
}



