public class Tiger {
    String name;
    String favoriteFood;
    public Tiger (String name) {
        this.name = name;
        this.favoriteFood = "meat";

    }
    public void sleep (){
        System.out.print(this.name+" sleeps for 8 hours");
    }
    public void eat (String food){
        if(food.equals(this.favoriteFood)) {
            System.out.print("YUM!!! "+this.name+" wants more "+food);
        }
        sleep();
    }
    public static void main (String[] args) {
        Tiger Tigger = new Tiger("Tigger");
        Tigger.eat("meat");
        Tigger.eat("bacon");
    }
}
