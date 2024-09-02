//Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price."
//Include a method to calculate the discount on the TV based on its size and a method to print the TV's brand,
//size, and discounted price.

package Level1ClassAndObject;

public class TV {
        String brand;
        double size;
        double price;
        public TV(String brand,double size,double price)
        {
        	this.brand=brand;
        	this.size=size;
        	this.price=price;
        }
        public double Discount()
        {
        	double discount;
        	if(size >16.5 && size < 20.6)
        	{
        		discount=0.20;
        	}else if(size >55)
        	{
        		discount=0.50;
        	}else {
        		discount=0.12;
        	}
        	return price*discount;
        }
        public double CalculateDiscountPrice()
        {
        	return price-Discount();
        }
        public void PrintTVDeatails()
        {
        	 System.out.println("TV Brand: " + brand);
             System.out.println("TV Size: " + size + " inches");
             System.out.println("Original Price: $" + price);
             System.out.println("Discounted Price: $" + CalculateDiscountPrice());
        }
        public static void main(String args[])
        {
        	TV tv1 = new TV("Samsung", 65, 1200.0);
            TV tv2 = new TV("LG", 50, 800.0);
            TV tv3 = new TV("Sony", 32, 400.0);
            
            tv1.PrintTVDeatails();
            System.out.println();
            tv2.PrintTVDeatails();
            System.out.println();
            tv3.PrintTVDeatails();
        }
}
