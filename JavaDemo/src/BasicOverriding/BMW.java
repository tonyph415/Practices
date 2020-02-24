package BasicOverriding;

public class BMW extends Cars {
	public void white () {
		System.out.println("BMW is white");
	}
	
	public void main( String args[]) {
		BMW obj = new BMW();
		obj.white();
		System.out.println(obj);
	}

}
