import java.util.ArrayList;

public class LearningJava {

    public static void main(String[] args) {


        ArrayList<Car> myArr = new ArrayList<Car>();
        myArr.add(new Car());

        Car myCar = myArr.get(0);

        System.out.println(myCar.getDoors());

    }


}

// ---- Parse -----
// int myInt = Integer.parseInt(myString);

// ---- Scanner/Input ----
// import java.util.Scanner;
// Scanner scanner = new Scanner(System.in);
//
// String myString = scanner.nextLine();

// boolean hasNextInt = scanner.hasNextInt();
// if(hasNextInt) -->
// int myInt = scanner.nextInt();
// scanner.nextLine(); // handle next line character (enter key)

// ---- Classes ----
// So far do not need to be imported
// Overload constructor, first statement must be: this(fields...)
// Static methods:
// Can't access instance methods or instance variables directly
// Called with methodName() if in same class, else ClassName.methodName()
// Static variables:
// Every instance shares same static variable. Change to 1 instance affects all instances
// Usage: private String Name --> private static String name

// ---- Arrays ----
// int[] myArray = new int[10]; // 10 element array of integers
// int[] anotherArray = {1,2,3,4,5};
// anotherArray[10] is NOT undefined, throws exception "out of bounds" ***
// initialization: int 0, bool false, string/obj null

// ---- ArrayList ----
// import java.util.ArrayList;
// ArrayList<String> myArray = new ArrayList<String>()
//
// -- Methods --
// .push(v) ==> .add(v)
// .length ==> .size()
// arr[i] ==> arr.get(i)
// arr[i] = "Hi" ==> arr.set(i, "Hi")
// arr.splice(i, 1) ==> arr.remove(i)
// arr.includes(v) ==> arr.contains(v)
// ArrayList<String> newArr = new ArrayList<String>(arrToCopy)
// or - newArr.addAll(arrayToCopy)
// or to String[] - newArr = arrToCopy.toArray(newArr)


// ---- Lookup / Not yet covered ----
// if(non-boolean), truthy/falsy equivalent


