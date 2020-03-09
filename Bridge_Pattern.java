package Structural_Pattern;
import java.util.*;
interface Element {  
    public void nextElement();  
    public void previousElement();  
    public void newElement(String q);  
    public void deleteElement(String q);  
    public void displayElement();
    public void displayAllElements();  
}  
class JavaQuestions implements Element {  
	 private List <String> e = new ArrayList<String>();  
	 private int current = 0;  
	 public JavaQuestions(){  
	    e.add("What is class? ");  
	    e.add("What is interface? ");  
	    e.add("What is abstraction? ");  
	    e.add("How multiple polymorphism is achieved in java? ");  
	    e.add("How many types of exception  handling are there in java? ");  
	    e.add("Define the keyword final for  variable, method, and class in java? ");  
	    e.add("What is abstract class? ");  
	    e.add("What is multi-threading? ");  
	 }  
	 public void nextElement() {  
	    if( current <= e.size()-1 )  
	    current++;  
	    System.out.print(current);  
	 }  
	  
	 public void previousElement() {  
	    if( current > 0 )  
	    current--;  
	 }  
	  
	 public void newElement(String quest) {  
	    e.add(quest);  
	 }  
	  
	 public void deleteElement(String quest) {  
	    e.remove(quest);  
	 }  
	  
	 public void displayElement() {  
	    System.out.println(e.get(current) );  
	 }  
	 public void displayAllElements() {  
	    for (String quest : e) {  
	    System.out.println(quest);  
	 }  
	}  
	}
class QuestionManager  {  
    protected Element q;  
    public String catalog;  
    public QuestionManager(String catalog) {  
    this.catalog=catalog;  
    }  
    public void next() {  
    q.nextElement();  
    }  
    public void previous() {  
    q.previousElement();  
    }  
    public void newOne(String quest) {  
    q.newElement(quest);  
    }  
    public void delete(String quest) {  
    q.deleteElement(quest);  
    }  
    public void display() {  
    q.displayElement();  
    }  
    public void displayAll() {  
        System.out.println("Question Paper: " + catalog);  
    q.displayAllElements();  
    }  
}
class ElementFormat extends QuestionManager {  
    public ElementFormat(String catalog){  
        super(catalog);  
    }  
    public void displayAll() {  
        System.out.println("\n---------------------------------------------------------");  
        super.displayAll();  
        System.out.println("-----------------------------------------------------------");  
    }  
}
public class Bridge_Pattern 
{
public static void main(String args[])
{
	
	ElementFormat ef = new ElementFormat("Java Programming Language");  
    ef.q = new JavaQuestions();  
        ef.delete("what is class?");  
        ef.display();  
    ef.newOne("What is inheritance? ");  
      
  ef.newOne("How many types of inheritance are there in java?");  
    ef.displayAll();  
    }  
}
	

