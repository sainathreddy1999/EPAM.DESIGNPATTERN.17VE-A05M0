package Creational_Pattern;
import java.util.*;
interface prototype
{
	public prototype clone();
}
class Car implements prototype
{
	public int car_id,Price,Mileage;
	public String Car_name;
   public Car()
    {
	   
    	System.out.println("\t"+"LIST OF ALL CARS:"+"\t");
    	System.out.println("**********************************************");
    	System.out.println("C_ID"+"\t"+"C_NAME"+"\t"+"PRICE"+"\t"+"MILEAGE");
    }
    public Car(int car_id,String Car_name,int Price,int Mileage)
    {
    	this();
    	this.car_id=car_id;
    	this.Car_name=Car_name;
    	this.Price=Price;
    	this.Mileage=Mileage;
    }
    public void DisplayCarList()
    {
    	System.out.println(car_id+"\t"+Car_name+"\t"+Price+"\t"+Mileage);
    }
    public prototype clone()
    {
    	return new Car(car_id,Car_name,Price,Mileage);
    }
}
public class Prototype_Demo
{
	public static void main(String args[])
	{
		int n,Price,Mileage;
		String car_name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID of the Car :");
	     n=sc.nextInt();
		System.out.println("Name of Car:");
		 car_name=sc.next();
		System.out.println("Price of car is:");
		Price=sc.nextInt();
		System.out.println("Mileage of car is:");
		Mileage=sc.nextInt();
		Car c=new Car(n,car_name,Price,Mileage);
		c.DisplayCarList();
        Car c1=(Car)c.clone();
		c1.DisplayCarList();
		
		
		sc.close();
	}

}
