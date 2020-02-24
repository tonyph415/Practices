package BasicJv;

public class Inheritance {
//	Ans: Inheritance means one class can extend to another class. So that the codes can be reused from one class to another class.
//	Existing class is known as Super class whereas the derived class is known as a sub class.
	
//	Super class:
		// public class Parent(){
//		}
//		Sub class:
		//public class Child extends Parent(){
//		}
//		Inheritance is applicable for public and protected members only. Private members can’t be inherited.
	
	public class teacher {
		String designation = "Teacher";
		String college = "Agama Collecge";
		void does () {
			System.out.println("Teaching is general");
		}
	}
	
}

////	public class JavaTeacher extends teacher {
////		String mainSubject = "Java";
////		public static void main (String args[]) {
////			JavaTeacher obj = new JavaTeacher ();
////			
////			System.out.println(obj.college);
////			System.out.println(obj.designation);
////			System.out.println(obj.mainSubject);
////			
////		}
////		
////		
//	}
	