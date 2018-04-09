import java.util.ArrayList;
public class Zookeeper {
    String name;
    public Zookeeper(String name) {
        this.name = name;
    }
    public void feedAnimals(ArrayList<Animal> animals, String food) {
        for(int count = 0; count < animals.size(); count++) {
            System.out.print(this.name+" is feeding "+food+" to "+animals.get(count));
            animals.get(count).eat(food);
        }


    }
}
