public class zoo {

    String favoriteFood = "bacon";

   public static void main (String[] args) {
        zoo z = new zoo();
        z.sleep("Tigger");
        z.eat("Tigger","venison");
        z.eat("Tigger","bacon");
   }
    public void sleep (String name){
        System.out.print(name+" sleeps for 8 hours");
    }
    public void eat (String name, String food){
        System.out.print(name+" eats "+food);
        if(food.equals(favoriteFood)) {
            System.out.print("YUM!!! "+name+" wants more "+food);
        }else {
            sleep(name);
        }
    }
}
