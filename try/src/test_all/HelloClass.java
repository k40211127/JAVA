package test_all;

public class HelloClass {
	private String hello = "A";

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		if(hello !="") 
		this.hello = hello;
	}
	
	public static void main(String args[]) {
		HelloClass hello = new HelloClass();
		hello.setHello("");
		System.out.println(hello.getHello());
	}
	
}
