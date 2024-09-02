//Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price."
//Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price."
//Include a method to calculate the discount on the shirt based on  its size and a method to print the shirt's
//size, color, and discounted price

package Level1ClassAndObject;

public class Shirt {

	    
	    private String size;
	    private String color;
	    private double price;

	    public Shirt(String size, String color, double price) {
	        this.size = size;
	        this.color = color;
	        this.price = price;
	    }

	    public double calculateDiscount() {
	        double discount;

	        switch (size.toLowerCase()) {
	            case "l":
	                discount = 0.10; // 10% discount for Large and Extra Large shirts
	                break;
	            case "m":
	                discount = 0.05; // 5% discount for Medium shirts
	                break;
	            case "s":
	                discount = 0.03; // 3% discount for Small shirts
	                break;
	            default:
	                discount = 0.0; // No discount for other sizes
	                break;
	        }

	        return price * discount;
	    }

	    public double getDiscountedPrice() {
	        return price - calculateDiscount();
	    }

	    public void printShirtDetails() {
	        System.out.println("Shirt Size: " + size);
	        System.out.println("Color: " + color);
	        System.out.println("Original Price: $" + price);
	        System.out.println("Discounted Price: $" + getDiscountedPrice());
	    }

	    public static void main(String[] args) {
	        Shirt shirt1 = new Shirt("L", "Red", 50.0);
	        Shirt shirt2 = new Shirt("M", "Blue", 40.0);
	        Shirt shirt3 = new Shirt("S", "Green", 30.0);

	        shirt1.printShirtDetails();
	        System.out.println(); 
	        shirt2.printShirtDetails();
	        System.out.println();
	        shirt3.printShirtDetails();
	    }
	}
  

