package Constructor;

public class Constructors {

    public void foo(){
        Flower flower = new Flower();
        flower.name = "raraw";
        flower.colour = "green";

        Flower flower1 = new Flower("Rose","Red");

        System.out.println(flower.name +" " + flower.colour);
        System.out.println(flower1.name +" "+ flower1.colour);
    }
}
