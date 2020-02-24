package BasicJv;

public class Constructor_concept {
	public Constructor_concept() {
		System.out.println("Default constr, does not have void or static not passing anything");
	}
	public Constructor_concept( int i) {
		System.out.println("parametrise constr"+i);
	}
	
	public Constructor_concept( int i, String s) {
		System.out.println("overload constr 2 two para constructor"+i+s);
	}
	public static void main(String[] args) {
		Constructor_concept obj = new Constructor_concept(); // default constructor
		Constructor_concept obj1 = new Constructor_concept(5);
		Constructor_concept obj2 = new Constructor_concept(5, "agama");
	}
	
	
}




//int empId;  
//String empName; 
//
////parameterized constructor with two parameters
//Employee(int id, String name){  
//    this.empId = id;  
//    this.empName = name;  
//}  
//void info(){
//     System.out.println("Id: "+empId+" Name: "+empName);
//}  
//	   
//public static void main(String args[]){  
//	Employee obj1 = new Employee(10245,"Chaitanya");  
//	Employee obj2 = new Employee(92232,"Negan");  
//	obj1.info();  
//	obj2.info();  
//}  
//}