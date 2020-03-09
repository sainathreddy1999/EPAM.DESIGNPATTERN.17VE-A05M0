package Creational_Pattern;
class SingleObject 
{
	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();
	   //make the constructor private so that this class cannot be instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello EPAM!");
	   }
	} 
public class Single_Ton {
	 public static void main(String[] args) {
		 SingleObject so = SingleObject.getInstance();
	      so.showMessage();
	 }


}
