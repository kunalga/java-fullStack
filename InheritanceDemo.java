class Animal {
    Animal(String type) {
        System.out.println("Animal constructor: " + type);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super("Dog");
        System.out.println("Dog constructor: " + name);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
    }
}

