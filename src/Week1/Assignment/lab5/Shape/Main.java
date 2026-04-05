package week1.Assignment.Lab5.Shape;

public class Main {
    public static void main(String[] args) {

        Shape[] type={
                new Circle(4),
                new Rectangle(2,4),
                new Triangle(3,6)
        };
        double sum=0.0;
        for(Shape s:type){
           double m= s.computeArea();
            System.out.println(s.getClass().getSimpleName()+","+String.format("%.2f", m));
            sum+=s.computeArea();
        }
        System.out.println("Total area:" +sum);

    }
}
