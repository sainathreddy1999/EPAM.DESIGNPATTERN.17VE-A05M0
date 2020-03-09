package Structural_Pattern;
import java.util.*;
interface Mobile {  
    public void modelNo();  
    public void price();  
}  
class Iphone implements Mobile {  
    public void modelNo()
    {  
        System.out.println(" Iphone 7 ");  
    }  
    public void price()
    {  
    System.out.println(" Rs 65000.00 ");  
    }  
}  
class Redmi implements Mobile{  
     
    public void modelNo() 
    {  
    System.out.println(" Redmi note ");  
    }    
    public void price() {  
        System.out.println(" Rs 45000.00 ");  
    }  
} 
class Blackberry implements Mobile {  
    
    public void modelNo() 
    {  
    System.out.println(" Blackberry Z10 ");  
    } 
    public void price() {  
        System.out.println(" Rs 55000.00 ");  
    }  
}  
class Customer_care {  
    private Mobile iphone;  
    private Mobile redmi;  
    private Mobile blackberry;  
      
    public Customer_care(){  
        iphone= new Iphone();  
        redmi=new Redmi();  
        blackberry=new Blackberry();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void redmiSale(){  
        redmi.modelNo();  
        redmi.price();  
    }  
   public void blackberrySale(){  
    blackberry.modelNo();  
    blackberry.price();  
        }  
}  
public class Facade_Pattern {

public static void main(String args[])
{
	Customer_care sk=new Customer_care();  
int choice;
	Scanner sc=new Scanner(System.in);
	do{       
         System.out.print("========= Mobile Shop ============ \n");  
         System.out.print("1. IPHONE.              \n");  
         System.out.print("2. REDMI.              \n");  
         System.out.print("3. BLACKBERRY.            \n");  
         System.out.print("4. Exit.                     \n");  
         System.out.print("Enter your choice: ");  
           choice=sc.nextInt();
           switch (choice) {  
           case 1:  
               {   
                 sk.iphoneSale();  
               }  
               break;  
      case 2:  
               {  
                 sk.redmiSale();        
               }  
               break;    
      case 3:  
               {  
                  sk.blackberrySale();       
               }  
                  break;     
           default:  
           {    
               System.out.println("Nothing You purchased");  
           }         
               return;  
           }  
             
     } while(choice!=4); 
	sc.close();
		
	}

}
