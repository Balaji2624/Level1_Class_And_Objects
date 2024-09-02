//Write a Java program to create a class called "Phone" with instance variables "make," "model," and "storage."
//Include a method to calculate the price of the phone based on the make, model, and storage capacity and a
//method to print the phone's make, model, and storage capacity.

package Level1ClassAndObject;

public class Phone {
       String make;
       String model;
       int storage;
       public Phone(String make, String model, int storage)
       {
    	   this.make=make;
    	   this.model=model;
    	   this.storage=storage;
       }
       public double calculatePrice()
       {
    	   double basePrice;
    	   switch(make.toLowerCase())
    	   {
    	   case "apple" :
    		   basePrice=800;
    		   break;
    	   case "samsung" :
    		   basePrice=500;
    		   break;
    	   case "google" :
    		   basePrice=200;
    		   break;
    	   default :
    		   basePrice=1000;
    		   
    	   }
    	   return basePrice;
       }
       public void PhoneDeatails()
       {
    	   System.out.println("Phone Make: " + make);
           System.out.println("Phone Model: " + model);
           System.out.println("Storage Capacity: " + storage + "GB");
           System.out.println("Price: $" + calculatePrice());
       }
       public static void main(String args[])
       {
    	   Phone phone1 = new Phone("Apple", "iPhone 13", 256);
           Phone phone2 = new Phone("Samsung", "Galaxy S21", 128);
           Phone phone3 = new Phone("Google", "Pixel 6", 64);
           
           phone1.PhoneDeatails();
           System.out.println();
           phone2.PhoneDeatails();
           System.out.println();
           phone3.PhoneDeatails();
       }
}
