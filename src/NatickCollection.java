
import java.util.ArrayList;

public class NatickCollection extends Mall {


    public NatickCollection(){
        super();
        Store appleStore = new Store("Apple Store");

        stores.add(appleStore);
        Store starbucks = new Store("Starbucks");

        stores.add(starbucks);


    }

    public void visit(Shopper theShopper) {
        String name = theShopper.getName();
        welcome(name);
        Boolean done = false;
        while (!done){
            Store currentStore = chooseStore();
            if (currentStore == null){
                done = true;
            } else {
                currentStore.visit(theShopper);
            }
        }
        System.out.println("Goodbye.");
    }

    public void welcome(String name){
        System.out.println( name +  " ,welcome to the Natick Collection.");

    }
}
