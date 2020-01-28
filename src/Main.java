public class Main
{
    public static void main(String[] args)
    {
        MonetaryCoin dime = new MonetaryCoin(10);
        MonetaryCoin nickel = new MonetaryCoin(5);
        MonetaryCoin penny = new MonetaryCoin(1);
        MonetaryCoin quarter = new MonetaryCoin(25);

        int sum = dime.getValue() + nickel.getValue() +
                penny.getValue() + quarter.getValue();

        System.out.println("The sum of coins is " + sum);
        penny.flip();
        System.out.println("The penny landed on " + penny.toString());

        System.out.println("Nathan Dilla");
    }
}
