public class Zaki {


    private int instanceVar;


    private static int staticVar;

    public Zaki(int i) {
        
    }


    public void VariableDemo(int instanceVar) {
        this.instanceVar = instanceVar;
    }


    public void modifyVariables(int localVar) {

        System.out.println("Local variable: " + localVar);


        System.out.println("Instance variable before modification: " + instanceVar);
        this.instanceVar += localVar;
        System.out.println("Instance variable after modification: " + instanceVar);


        System.out.println("Static variable before modification: " + staticVar);
        staticVar += localVar;
        System.out.println("Static variable after modification: " + staticVar);
    }


    public static void staticMethodDemo() {

        System.out.println("Accessing static variable inside static method: " + staticVar);


    }


    public int getInstanceVar() {
        return instanceVar;
    }


    public static int getStaticVar() {
        return staticVar;
    }

    public static void main(String[] args) {

        Zaki obj1 = new Zaki(10);
        Zaki obj2 = new Zaki(20);


        System.out.println("==> Using obj1 to modify variables:");
        obj1.modifyVariables(5);

        System.out.println("\n==> Using obj2 to modify variables:");
        obj2.modifyVariables(10);


        System.out.println("\n==> Calling static method:");
        Zaki.staticMethodDemo();
    }
}