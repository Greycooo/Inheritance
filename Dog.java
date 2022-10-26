public class Dog extends Animal
{
     String dogName;
     public Dog()
     {
         
     }
    
     public String dogName()
     {
         return dogName;
     }
     public void dogName(String dogName)
     {
         this.dogName = dogName;
     }
    
     public Dog(String legs, String color)
     {
         super(legs, color);
         this.dogName();
     }
     
     public void showInfo()
    {
        System.out.println("My Dog Name is " + dogName + "and the color of my dog is " + color + " and it has " + legs + " legs");
        
        
    }
    
}