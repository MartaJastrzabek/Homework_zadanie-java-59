public class Shop {

    public static void main(String[] args) {

        Category sweets = new Category("Sweets", "Chocolate, biscuits and other treats.");
        Category dairy = new Category("Dairy", "Milk, cream, cheese and other dairy products");

        Product chocolate1 = new Product("Chocolate Wedel", 2.19, "Milk chocolate with nuts.", sweets);
        Product biscuits1 = new Product("Delicje", 3.5, "Soft sponge with orange jelly coated in milk chocolate.", sweets);

        Product milk = new Product("Mleko Mlekowita", 2.40, "Semi-skimmed milk", dairy);

        Product bread = new Product("Bread", 3.0, "Plain bread");

        SpecialOffer offer1 = new SpecialOffer(chocolate1, "Wedel chocolates 20% discount", "20.07.2019 - 1.08.2019", 0.2);

        chocolate1.printInfo();
        offer1.offerInfo();
        System.out.println();

        milk.printInfo();
        biscuits1.printInfo();
        bread.printInfoNoCategory();

    }
}
