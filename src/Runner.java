import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        Bear pooh = new Bear("Pooh");
        pooh.eat("honey");
        pooh.eat("fish");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("bacon");
        tigger.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("berries");
        rarity.eat("Marhsmallows");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("ham");

        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");
        stinger.eat("pinecones");

        ArrayList<Animal> animals = new ArrayList<Animal>(5);
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"cookies");
    }
}