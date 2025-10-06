class Plane {
    void fly() {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("CargoPlane flies at medium height");
    }
    void carryGoods() {
        System.out.println("CargoPlane carries goods");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        Plane p = new CargoPlane();  // Upcasting     
        p.fly();

        // Downcasting
        CargoPlane cp = (CargoPlane) p; // parent → child
        cp.carryGoods();  // ✅ Now accessible
    }
}
