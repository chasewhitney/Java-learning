public class Outer {
    public Outer() {
    }

    public void saySomething() {
        System.out.println("Outer something");
    }

    public void saySomethingElse() {
        System.out.println("Outer something else");
    }

    public class Inner {
        public Inner() {
        }

        public void saySomething(){
            System.out.println("Inner something");
        }

    }
}
