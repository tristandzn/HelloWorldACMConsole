public class Square {
    int side=10;

    int getArea() {
        return side*side;
    }
    int getPerimeter() {
        return 4*side;
    }
    public static void main (String[] args) {
        Square sq = new Square();
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
    }
}

