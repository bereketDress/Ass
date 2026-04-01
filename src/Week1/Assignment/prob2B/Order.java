package week1.Assignment.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> coll;

    public Order(int OrderNum){
        this.orderNum=OrderNum;
        coll= new ArrayList<>();
    }
    public void addOrderLine(OrderLine ol) {
        coll.add(ol);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public List<OrderLine> getColl() {
        return coll;
    }
}
