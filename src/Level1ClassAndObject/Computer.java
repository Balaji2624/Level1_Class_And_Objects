//Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and
//"storage." Include a method to calculate the price of the computer based on the processor, RAM, and storage
//capacity and a method to print the computer's processor, RAM, and storage capacity.

package Level1ClassAndObject;

public class Computer {
	private String processor;
    private int RAM;
    private int storage; 

    
    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
      }
    public double calculatePrice() {
        double basePrice = 500; 

        
        switch (processor.toLowerCase()) {
            case "intel i7":
                basePrice += 300;
                break;
            case "intel i5":
                basePrice += 200;
                break;
            case "intel i3":
                basePrice += 100;
                break;
            default:
                basePrice += 50;
                break;
        }
        if (RAM >= 32) {
            basePrice =basePrice+200; 
        } else if (RAM >= 16) {
            basePrice =basePrice+100;
        } else if (RAM >= 8) {
            basePrice =basePrice+50; 
        }
        return basePrice;
    }
    public void printComputerDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + calculatePrice());
    }
    public static void main(String args[])
    {
    	Computer comp1 = new Computer("Intel i7", 32, 1000);
        Computer comp2 = new Computer("AMD Ryzen 5", 16, 512);
        Computer comp3 = new Computer("Intel i3", 8, 256);
        
        comp1.printComputerDetails();
        System.out.println();
        comp2.printComputerDetails();
        System.out.println();
        comp3.printComputerDetails();
    }
}