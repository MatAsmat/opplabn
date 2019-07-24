package chap5;
//Supperclass
public class LivingThing {

    protected String name = "Living Thing";
//Method1
    public void grow() {
        System.out.println("LivingThing: grow");
    }
//Method2
    public void reproduce() {
        System.out.println("LivingThing: reproduce");
    }
}
//Subclass
class Animal extends LivingThing {
//Attribute
    private String color;
    protected int leg;
//Method
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color + " Animal";
    }

    public void move() {
        System.out.println("Animal : move");
    }
}
//Subclass

class Dog extends Animal {
    //Shadow Attribute
    protected int leg = 4;
    public void bark(){
        System.out.println("Dog : bark");
    }

    @Override
    public void move() {
        System.out.println("Dog : Walk and Run"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Plant extends LivingThing{ }
