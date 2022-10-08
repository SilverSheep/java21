package pl.mbaranowski._5_records;

import java.util.Objects;

public final class Old {
    private final boolean isAwesome;
    private final String title;

    public Old(boolean isAwesome, String title) {
        this.isAwesome = isAwesome;
        this.title = title;
    }

    public static void main(String[] args) {
        Old instance = new Old(true, "Awesome record");
        System.out.println(instance);
    }

    public boolean isAwesome() {
        return isAwesome;
    }

    public String title() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Old) obj;
        return this.isAwesome == that.isAwesome &&
               Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAwesome, title);
    }

    @Override
    public String toString() {
        return "Old[" +
               "isAwesome=" + isAwesome + ", " +
               "title=" + title + ']';
    }

}
