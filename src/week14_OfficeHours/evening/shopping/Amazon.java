package week14_OfficeHours.evening.shopping;

public class Amazon extends OnlineShopping{
    @Override
    void viewCart() {
        System.out.println("Amazon has view cart option ");
    }

    @Override
    public void shipItem() {
        System.out.println("Amazon has ship item options");
    }

    @Override
    void buyItem() {
        System.out.println("You can buy item from Amazon");
    }

    @Override
    void returnItem() {
        System.out.println("You can return your item in Amazon");
    }
}
