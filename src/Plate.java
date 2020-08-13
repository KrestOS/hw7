public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount){
        if (amount < 0){
            return;
        }else{

            food += amount;
            System.out.printf("В тарелку добавлено %d еды, теперь там %d еды",amount,food);
        }
    }
    public boolean decreaseFood(int amount) {
        if (food >= amount){

            food -= amount;
            return true;

        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
