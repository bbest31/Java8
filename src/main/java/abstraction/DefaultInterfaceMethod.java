package abstraction;

public interface DefaultInterfaceMethod {

    /**
     * This default method gives all classes implementing this interface a defaulted implementation of the method
     * incase they don't override it.
     */
    default void print(){
        System.out.println("Default print");
    }

}
