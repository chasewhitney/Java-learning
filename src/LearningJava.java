import java.util.*;

public class LearningJava {

    public static void main(String[] args) {
        List myList = new LinkedList<String>();

        myList.add("b");
        myList.add("d");
        myList.add("y");

        String newEntry = "a";
        ListIterator<String> i = myList.listIterator();


        while(i.hasNext()) {
          int comparison = newEntry.compareTo(i.next());
          if(comparison <= 0) {
              i.previous();
              i.add(newEntry);
              break;
          }
          if(!i.hasNext()) i.add(newEntry);
        }

        System.out.println(myList);
    }
}

