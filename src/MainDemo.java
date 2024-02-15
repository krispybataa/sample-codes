import io.OutputDemo;
import io.InputDemo;
import conditionals.IfDemo;
import conditionals.WhenDemo;
import flow.WhileDemo;
import flow.ForDemo;
public class MainDemo {
    public static void main(String[] args) {
        OutputDemo outdemo = new OutputDemo();
        InputDemo indemo = new InputDemo();
        IfDemo ifDemo = new IfDemo();
        WhenDemo whenDemo = new WhenDemo();
        WhileDemo whileDemo = new WhileDemo();
        ForDemo forDemo = new ForDemo();

        System.out.println("====OUTPUT DEMO====\n");
        //Calling Output Codes
        outdemo.basicOut();
        System.out.println();
        outdemo.compare();
        System.out.println();
        outdemo.printVariables();
        System.out.println();

        System.out.println("\n====INPUT DEMO====\n");
        //Calling Input codes
        indemo.inputString();
        System.out.println();
        //indemo.inputviaScanner();
        System.out.println();
        indemo.inputInteger();
        System.out.println();

        System.out.println("\n====IF DEMO====\n");
        ifDemo.traditionalIf();
        System.out.println();
        ifDemo.kotlinIf();
        System.out.println();
        ifDemo.kotlinMultiIf();
        System.out.println();
        ifDemo.kotlinLadderIf();
        System.out.println();
        ifDemo.kotlinNestedIf();

        System.out.println("\n====WHEN DEMO====\n");
        whenDemo.basicWhen();
        System.out.println();
        whenDemo.branchedWhen();
        System.out.println();
        whenDemo.rangedWhen();
        System.out.println();
        whenDemo.expressionWhen();

        System.out.println("\n====WHILE DEMO====\n");
        whileDemo.basicWhile();
        System.out.println();
        whileDemo.computeWhile();
        System.out.println();
        whileDemo.kotlinDoWhile();

        System.out.println("\n====FOR DEMO====\n");
        forDemo.rangedFor();
        System.out.println();
        forDemo.rangedForComparison();
        System.out.println();
        forDemo.forArray();
        System.out.println();
        forDemo.forIndexedArray();
        System.out.println();
        forDemo.forString();
        System.out.println();
        forDemo.forIndexedString();


        System.out.println("\n\t !!!END OF DEMO!!!\n");
    }
}
