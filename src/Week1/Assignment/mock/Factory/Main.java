package week1.Assignment.mock.Factory;

public class Main {
    public static void main(String[] args) {

        //  Create rectangle using length and width
        Rectangle rect1 = Rectangle.createFromDimensions(5.0, 3.0);
        System.out.println("Rectangle 1 Area: " + rect1.computeArea());

        //  Create rectangle using width and diagonal
        Rectangle rect2 = Rectangle.createFromWidthAndDiagonal(3.0, 5.0);
        System.out.println("Rectangle 2 Area: " + rect2.computeArea());
    }
}
