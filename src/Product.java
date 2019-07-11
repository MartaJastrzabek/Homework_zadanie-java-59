public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double p, String d, Category cat){
        name = n;
        price = p;
        description = d;
        category = cat;
    }

    Product(String n, double p, String d){
        name = n;
        price = p;
        description = d;
    }

    void printInfo(){
        System.out.println(name + ", " + price + ", " + description );
        System.out.println(category.name + category.description);
    }

    void printInfoNoCategory(){
            System.out.println(name + ", " + price + ", " + description );
    }
}
