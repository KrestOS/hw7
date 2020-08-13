public class MainHW7 {
    public static void main(String[] args) {

        Plate plate = new Plate(45);

        Cat[] cats = new Cat[]{
                new Cat("Barsik"),
                new Cat("Myrka"),
                new Cat("Bars"),
                new Cat("Kitty"),
                new Cat("Gimmy"),
        };
        for (Cat cat: cats){
            cat.eat(plate);
            if (cat.isFull()){
              System.out.println(cat.getName() + " is full" );
            }else {
                System.out.println(cat.getName() + " no full" );
            };
        }
    plate.addFood(50);
    }
}
