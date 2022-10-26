public class Animal
{
    String color;
    String legs;
    
    public Animal() 
    {
        
    }
    
    public Animal(String color, String legs)
    {
        this.color = color;
        this.legs = legs;
        
    }
    
    public String color()
    {
        return color;
    }
    
    public String legs()
    {
        return legs;
    }
    
    public void legs(String legs)
    {
        this.legs = legs;
    }
    
    public void color(String color)
    {
        this.color = color;
    }
    
    public void showInfo()
    {
        System.out.println(color);
        System.out.println(legs);
        
    }
}
