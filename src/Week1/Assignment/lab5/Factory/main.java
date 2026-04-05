package week1.Assignment.Lab5.Factory;

public class main {
    public static void main(String [] args){
        Customer cust1= CustOrderFactory.creatCustomer("Alice");
        Customer cust2=CustOrderFactory.creatCustomer("bob");

        Order ord1=CustOrderFactory.createOrder(cust1);
        Order ord2=CustOrderFactory.createOrder(cust1);
        Order ord3=CustOrderFactory.createOrder(cust2);

        Item it1= CustOrderFactory.createItem(ord1,"book",34);
        Item it2= CustOrderFactory.createItem(ord2,"pen",36);
        Item it3= CustOrderFactory.createItem(ord3,"laptop",20);
        Item it4= CustOrderFactory.createItem(ord3,"bag",30);

        System.out.println("customer1 name:"+ cust1.getName());
        for(Order order1: cust1.getOrd()){
            System.out.println(order1);
        }
        System.out.println("customer2 name:"+ cust2.getName());
        for(Order order2: cust2.getOrd()){
            System.out.println(order2);
        }



    }
}
