package week14_OfficeHours.evening.shopping;

public class Warehouse {
    public static void main(String[] args) {

        Target target=new Target();
        Amazon amazon=new Amazon();
        amazon.returnItem();
        Ebay ebay=new Ebay();
        ebay.returnItem();

        OnlineShopping onlineShopping=new Amazon();
        onlineShopping.buyItem();

        onlineShopping=new Ebay();
        onlineShopping.buyItem();


    }
}
