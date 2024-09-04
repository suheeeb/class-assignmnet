public class Suhayb {

   
    int instanceVariable;

  
    static int staticVariable;

    public void demonstrateVariables() {
        
        int localVariable = 10;

     
        instanceVariable = localVariable * 2;
        System.out.println("Instance Variable: " + instanceVariable);

       
        staticVariable = localVariable * 3;
        System.out.println("Static Variable: " + staticVariable);

        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
      
        VariableExample example1 = new VariableExample();
        example1.demonstrateVariables();

       
        VariableExample example2 = new VariableExample();
        example2.demonstrateVariables();

       
        System.out.println("Static Variable accessed from class: " + VariableExample.staticVariable);
    }
}