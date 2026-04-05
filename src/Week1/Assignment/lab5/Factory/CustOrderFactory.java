package week1.Assignment.Lab5.Factory;

public class CustOrderFactory {
    private CustOrderFactory(){};
    public static Customer creatCustomer(String name){
        return new Customer(name);
    }
   public static Order createOrder(Customer cust){
        Order ord= new Order();
        cust.addOrd(ord);
        return ord;
    }
    public static Item createItem(Order ord, String name, double price){
        Item it = new Item(name, price);
        ord.addItems(it);
        return it;
    }

}
