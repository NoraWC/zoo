public class Bear {
    String name;
    String favoriteFood;

    public Bear(String name) {
        this.name = name;
        favoriteFood = "fish";
    }

    public void sleep() {
        System.out.print(this.name+" hibernates for 4 months");
    }

    public void eat (String food) {
        if(food.equals(this.favoriteFood)) {
            System.out.print("YUM!!! "+this.name +" wants more "+food);
        } else {
            sleep();
        }
    }
}
