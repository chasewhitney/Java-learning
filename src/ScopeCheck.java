public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;
    private static int classCounter = 0;
    private int instanceNumber = 0;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
        this.classCounter++;
        instanceNumber = classCounter;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i=0; i<10; i++){
            System.out.println(i + " times two is " + i * privateVar);
        }
        // privateVar is 2;
        // this.privateVar is 1;
    }

    public class InnerClass {
//        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
            for (int i=0; i<10; i++){
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }

        }
    }

}

// Incorporate into a project
//