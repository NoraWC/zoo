public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }
    public void sleep() {
        System.out.print(this.name+" never sleeps");
    }
    public void eat(String food) {
        if(food.equals(this.favoriteFood)){
            super.eat(food);
            this.sleep();
        } else {
            System.out.print("YUCK!!! "+this.name+" will not eat "+food);
        }
    }
}
