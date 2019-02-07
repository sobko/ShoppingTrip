import java.util.ArrayList;
import java.util.Scanner;

public abstract class Mall {

    public ArrayList<Store> stores;

    public Mall(){
        stores =  new ArrayList<Store>(0);
    }

    public void visit(Shopper theShopper) {
        System.out.println("Please implement visit");

    }

    public Store chooseStore(){
        //list the stores
        Scanner scan = new Scanner(System.in);
        int numberOfStores = stores.size();
        for (int i = 0; i < numberOfStores; i++ ){
            System.out.print(i + ". " + stores.get(i).name + "\n");
        }
        String s = scan.next();
        int n = Integer.parseInt(s);
        try {
            return stores.get(n);
        }
        catch(Exception ex) {
            return null;
        }

    }
}
