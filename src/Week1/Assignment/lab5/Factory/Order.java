package week1.Assignment.Lab5.Factory;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        this.items =  new ArrayList<>();
    }

   public void addItems(Item it){
        items.add(it);
   }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                '}';
    }
}
