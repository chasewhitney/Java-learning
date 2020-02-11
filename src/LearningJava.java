public class LearningJava {

    public static void main(String[] args) {
        
//        overloadArea(5);
//        overloadArea(3,4);
    }

    // Overload methods
    public static void overloadArea(double radius) {
        if(radius < 0) invalidEntry();
        else System.out.println(radius * radius * Math.PI);
    }

    public static void overloadArea(double x, double y){
        if(x < 0 || y < 0) invalidEntry();
        else System.out.println(x * y);
    }

    // Handle invalid entry
    public static void invalidEntry(){
        System.out.println("Invalid Entry");
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