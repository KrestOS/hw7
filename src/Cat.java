public class Cat {

    private String name;
    private int appetite = 10;
    private boolean full;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFull(){

        return full;

    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)){

            full = true;
            System.out.println(name + " eat");

        }else {

            System.out.println(name + " no eat");

        }

    }

}
