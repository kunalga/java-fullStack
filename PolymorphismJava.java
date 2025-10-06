// Base class
class Plane {
    void takeoff() {
        System.out.println("Plane is taking off");
    }
    void landing() {
        System.out.println("Plane is landing");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
}

// Derived class 1
class CargoPlane extends Plane {
    @Override
    void takeoff() {
        System.out.println("CargoPlane takes off with heavy load");
    }
    void landing() {
        System.out.println("CargoPlane lands on a long runway");
    }
    @Override
    void fly() {
        System.out.println("CargoPlane flies at medium speed");
    }
}

// Derived class 2
class PassengerPlane extends Plane {
    @Override
    void takeoff() {
        System.out.println("PassengerPlane takes off with passengers");
    }
    @Override
    void landing() {
        System.out.println("PassengerPlane lands on a medium runway");
    }
    void fly() {
        System.out.println("PassengerPlane flies at high speed");
    }
}

// Derived class 3
class FighterPlane extends Plane {
    void takeoff() {
        System.out.println("FighterPlane takes off vertically");
    }
    void landing() {
        System.out.println("FighterPlane lands on a short runway");
    }
    void fly() {
        System.out.println("FighterPlane flies at supersonic speed");
    }
}

// Airport class
class Airport {
    public void permit(Plane plane) {
        plane.takeoff();
        plane.landing();
        plane.fly();
    }
}

// Main class
public class PolymorphismJava {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}
