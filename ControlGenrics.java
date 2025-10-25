class Boxs<T extends Number> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
public class ControlGenrics {
    public static void main(String[] args) {
        Boxs<Integer> intBox = new Boxs<>();
        intBox.setItem(456);
        System.out.println("Integer Value: " + intBox.getItem());

    }
}