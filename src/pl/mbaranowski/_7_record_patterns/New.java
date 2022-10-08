package pl.mbaranowski._7_record_patterns;

public class New {

    public static void main(String[] args) {
        Object obj = blackbox();

        if (obj instanceof Rectangle(Point(int leftX, int topY), Point(int rightX, int bottomY))) {
            var width = rightX - leftX;
            var height = bottomY - topY;
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
        }

        System.out.println("Fin");
    }

    /**
     *  simulates blackbox - we don't know what exactly will come out
     *
     * @return either String or BigDecimal
     */
    private static Object blackbox() {
         return createRectangle();
    }

    private static Rectangle createRectangle() {
        return new Rectangle(new Point(0, 1), new Point(5, 12));
    }
}
