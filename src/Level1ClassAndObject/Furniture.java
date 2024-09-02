//Write a Java program to create a class called "Furniture" with instance variables "type," "material," and
//"price." Include a method to calculate the discount on the furniture based on its material and a method to
//print the furniture's type, material, and discounted price.

package Level1ClassAndObject;

public class Furniture {
	private String type;
    private String material;
    private double price;
    
    public Furniture(String type, String material, double price)
    {
    	this.material=material;
    	this.type=type;
    	this.price=price;
    }
    public double calculateDiscount()
    {
    	double discount;
    	switch(material.toLowerCase())
    	{
    	case "wood" :
    		discount=0.15;
    		break;
    	case "metal":
            discount = 0.10; // 10% discount for metal furniture
            break;
        case "plastic":
            discount = 0.05; // 5% discount for plastic furniture
            break;
        default:
            discount = 0.02; // 2% discount for other materials
            break;
    	}
    	return price*discount;
    }
    public double getDiscountedPrice() {
        return price - calculateDiscount();
    }
    public void printFurnituredetails()
    {
    	System.out.println("Furniture Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + getDiscountedPrice());
    }
    public static void main(String args[])
    {
    	Furniture chair = new Furniture("Chair", "Wood", 150.0);
        Furniture table = new Furniture("Table", "Metal", 200.0);
        Furniture shelf = new Furniture("Shelf", "Plastic", 75.0);
        
        chair.printFurnituredetails();
        System.out.println();
        table.printFurnituredetails();
        System.out.println();
        shelf.printFurnituredetails();
    }
}
