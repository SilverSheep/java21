package pl.mbaranowski._7_record_patterns;

public class Old {

    public static void main(String[] args) {
        Object obj = blackbox();

        if (obj instanceof Rectangle rect) {
            var topLeft = rect.topLeft();
            var bottomRight = rect.bottomRight();
            var left = topLeft.x();
            var right = bottomRight.x();
            var width = right - left;

            var top = topLeft.y();
            var bottom = bottomRight.y();
            var height = bottom - top;
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
