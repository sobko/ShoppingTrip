public class Main {


    public static void main(String[] args)
    {
        System.out.println("Welcome to the Shoppening!");

        Mall myMall = new NatickCollection();
        Shopper theShopper = new Shopper("Mark", 6000);

        myMall.visit(theShopper);


    }
}
