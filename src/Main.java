import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        String privateVar = "I belong to Main()";
//
//        ScopeCheck scopeInstance = new ScopeCheck();
//        System.out.println("scopeInstance privateVar: " + scopeInstance.getPrivateVar());
//        System.out.println("Main(): " + privateVar);
//
//        scopeInstance.timesTwo();
//
//        System.out.println("============================================");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();

        System.out.println(returnStuff(556));

        System.out.println("======================");



    }

    public static int returnStuff(int x) {
        int a = 567;
        return x ^ a;
    }
}

