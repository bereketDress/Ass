package week1.Assignment.prob2B;

public class OrderLine {
    private Order ord;

    public OrderLine(Order ord){
        this.ord=ord;// OrderLine stores a single Order object — same as 1-1
        ord.addOrderLine(this);//method call coz Order stores a List of OrderLine

    }
    public Order getOrd() {
        return ord;
    }
}
