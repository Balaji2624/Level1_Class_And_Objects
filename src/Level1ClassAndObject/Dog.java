//Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight."
//Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, and
//weight.

package Level1ClassAndObject;

public class Dog {
      String breed;
      int age;
      double weight;
      public Dog(String breed, int age, double weight)
      {
    	  this.breed=breed;
    	  this.age=age;
    	  this.weight=weight;
      }
      public int DogAgeInHumanAge()
      {
    	  return age*7;
      }
      public void PrintDogDeatails()
      {
    	  System.out.println("Dog breed is : "+breed);
    	  System.out.println("Dog age : "+age);
    	  System.out.println("Dog weight : "+weight);
      }
      public static void main(String args[])
      {
    	  Dog dog=new Dog("BullDog",12,45);
    	  dog.PrintDogDeatails();
    	  System.out.println("Dog life span in Human age is : "+dog.DogAgeInHumanAge());
      }
}
