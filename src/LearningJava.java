import java.util.*;

public class LearningJava {



    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);


        printDoubledItems(items);
    }

    public static void printDoubledItems(ArrayList<Integer> items){
        for(Object i : items) {
            System.out.println((Integer) i * 2);
        }
    }
}

