public class SpecialOffer {
    Product product;
    String description;
    String offerDates;
    double discount;

    SpecialOffer(Product p, String d, String dates, double disc){
        product = p;
        description = d;
        offerDates = dates;
        discount = disc;
    }

    double priceAfterDiscount(Product product){
        double newPrice = product.price - (product.price * discount);
        return newPrice;
    }

    void offerInfo(){
        System.out.println(product.name + ", " + description + ". Offer price: " + priceAfterDiscount(product) + " offer valid: " + offerDates);
    }
}
