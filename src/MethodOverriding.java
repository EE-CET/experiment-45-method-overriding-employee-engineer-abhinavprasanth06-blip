// Use this editor to write, compile and run your Java code online
 class employee {
    void display(){
        System.out.println("Name of class is Employee");
    }
}
  class Engineer extends employee  {
    void display(){
	super.display();
         System.out.println("Name of class is Engineer");
    }
/*
	void message(){
		display();
		super.display();
 	}
*/
}
public class MethodOverriding{
    public static void main(String[] args) {
       Engineer e1 = new Engineer();
       e1.message();
    }
}