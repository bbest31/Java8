package executable;

import abstraction.DefaultInterfaceMethod;
import abstraction.LambdaFunc;
import abstraction.VoidLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main implements DefaultInterfaceMethod {

    public static void main(String[] args){
        Main main = new Main();

        LambdaFunc func1 = (int a, int b) -> a+b;
        LambdaFunc func2 = (int a, int b) -> a-b;

        VoidLambda msg1 = msg -> System.out.println(msg+"1");
        VoidLambda msg2 = msg -> System.out.println(msg+"2");

        msg1.voidfunc("Brandon");
        msg2.voidfunc("Best");

        //Functional Interfaces
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*Predicate<Integer> predicate = n -> true
        n is passed as parameter to test method of the Predicate interface
        test method will always return true no matter what value n has.
        */

        //pass n as a parameter
        eval(myList,n->true);

        /*
        * Predicate<Integer> predicate1 = n -> n%2 == 0
        * n is passed as a parameter to test method of predicate interface
        * and returns true if n%2 == 0
        * */
        eval(myList,n -> n%2 ==0);

        System.out.println("Print numbers greater than 3");

        eval(myList,n-> n > 3);


        //Method Reference
        //the double colon automatically knows to use each element in myList in that method being referenced.
        myList.forEach(System.out::println);

        myList.forEach(Integer::numberOfLeadingZeros);

        main.print();
        //if we implement two interfaces that have default classes with the same name we call the Interface.sys....
        //this is so we can be explicit as to which one we want to use.
    }

    private int function(int a, int b, LambdaFunc func){
        return func.function(a,b);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){

        for(Integer n: list){
            if(predicate.test(n)){
                System.out.println(n+" ");
            }
        }
    }
}
