package week1.Assignment.Lab5.Factory;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    private List<Order> ord;
    Customer(String name){
        this.name= name;
        ord= new ArrayList<>();
    }
    public void addOrd(Order order){
        ord.add(order);
    }
    public List<Order> getOrd(){
        return ord;
    }
    public String getName(){
        return name;
    }
}
