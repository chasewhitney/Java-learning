import java.util.ArrayList;

public class LearningJava {

    public static void main(String[] args) {

    ArrayList<Integer> intArr = new ArrayList<Integer>();

    intArr.add(5);
        System.out.println(intArr.get(0));
    }


}

// ---- Parse -----
// int myInt = Integer.parseInt(myString);

// ---- Scanner/Input ----
// Scanner scanner = new Scanner(System.in);
//
// String myString = scanner.nextLine();

// boolean hasNextInt = scanner.hasNextInt();
// if(hasNextInt) -->
// int myInt = scanner.nextInt();
// scanner.nextLine(); // handle next line character (enter key)

// ---- Classes ----
// Overload constructor, first statement must be: this(fields...)
// Static methods:
// Can't access instance methods or instance variables directly
// Static variables:
// Every instance shares same static variable. Change to 1 instance affects all instances
// println(myInstance) == println(myInstance.toString()) -- override toString()

// ---- Arrays ----
// int[] myArray = new int[10]; // 10 element array of integers
// int[] anotherArray = {1,2,3,4,5};
// anotherArray[10] is NOT undefined, throws exception "out of bounds" ***
// initialization: int 0, bool false, string/obj null

// ---- ArrayList ----
// import java.util.ArrayList;
// use ArrayList<CLASS> instead of ArrayList<PRIMITIVE> and that's it
//
// -- Methods --
// .push(v) ==> .add(v), .add(i,v)
// .length ==> .size()
// arr[i] ==> arr.get(i)
// arr[i] = "Hi" ==> arr.set(i, "Hi")
// arr.splice(i, 1) ==> arr.remove(i)
// arr.includes(v) ==> arr.contains(v)
// ArrayList<String> newArr = new ArrayList<String>(arrToCopy)
// or - newArr.addAll(arrayToCopy)
// or to String[] - newArr = arrToCopy.toArray(newArr)

// -- LinkedList<String> --
// -- LL methods --
// .isEmpty()
// ----------
// Iterator<String> i = linkedList.iterator();
// while i.hasNext(), i.next() // i.next() returns value and increments i
// .add(i, v), .remove(i)
// ListIterator<String> sLI i = linkedList.listIterator();
// while sLI.hasNext(), int comparison = sLI.next().compareTo(newEntry);
// -- 0: equal --> >0: sLI.previous(), sLI.add() --> >0: continue.. automatic
// -- because .next() was used in comparison declaration
// -- which must use .next() to get to the first entry
// -- Iterator Methods --
// .next(), .previous()

// -- Interfaces --
// -- Provides common behavior, usable my multiple classes
// -- Standardize the way a particular set of classes are used
// -- A contract/commitment saying the variables and methods will not change
// public class MyClass implements IMyInterface
// multiple inheritance only done through Interfaces
// Animal Class, Walk Interface, Fly Interface
// -- Dog extends Animal, implements walk
// -- Bird extends Animal, implements walk and fly

//// -- Inner/Nested classes----------------------------------------------------------

// static, non-static (inner), local (defined in scope block, method), anonymous (nested without classname)
// static nested class

// Static
// Used to associate a class with its outter-class
// Behavior same as top level class, except packaged within class
// Cannot access the non-static methods of its outter-class without first creating an instance of that class

// Non-static (inner) : CAN access outer private methods/fields : this == inner;

// local, inner class defined within a scope block, usually a method

// anonymous, also local, declared and instantiated at the same time, used only once
// common for attaching event-handlers to buttons in UI like while programming Android apps





// ---- Lookup / Not yet covered ----
// truthy/falsy for conditionals?


