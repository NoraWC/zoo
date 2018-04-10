public class Animal {
    String name;
    String favoriteFood;
    static int population;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population+=1;
    }

    static int populationCount() {
        return population;
    }

    public void sleep() {
        System.out.print(this.name +" sleeps for 8 hours");
    }
    public void eat(String food) {
        System.out.print(this.name +" eats "+food);
        if(food.equals(favoriteFood)) {
            System.out.print("YUM!!! "+this.name+" wants more "+food);
        } else {
            sleep();
        }
    }
}
