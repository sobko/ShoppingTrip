

public class Store {
    public String name;


    public Store(String theName){
        name = theName;

    }
    public void visit(Shopper theShopper){
        //implement a loop with choices here!
        System.out.println("Thanks for visiting " + name + ", " + theShopper.getName());
    }
}
