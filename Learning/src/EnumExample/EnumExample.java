package EnumExample;

public class EnumExample {
    enum CoffeeSize {SMALL(100){
        String getCoffeeClass(){
            return "A";
        }
    }, MEDIUM(200), BIG(300);
    String coffeeClass= "B";

    int mililitres;
    CoffeeSize(int mililitres){
        this.mililitres = mililitres;
    }
    int getMillilitres(){
        return mililitres;
        }
     String getCoffeeClass(){
        return coffeeClass;
     }
    }
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.SMALL;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.getMillilitres());
        System.out.println(coffeeSize.getCoffeeClass());
    }

}
