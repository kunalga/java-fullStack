class A {
    public synchronized void d1(B b) {
        System.out.println("Thread-1 starts execution of d1()");

        try {
            Thread.sleep(5000); // 5 seconds delay
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread-1 trying to call b.last()");
        b.last(); // trying to call synchronized method of B
    }

    public synchronized void last() {
        System.out.println("Inside A's last() method");
    }
}

class B {
    public synchronized void d2(A a) {
        System.out.println("Thread-2 starts execution of d2()");

        try {
            Thread.sleep(5000); // 5 seconds delay
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread-2 trying to call a.last()");
        a.last(); // trying to call synchronized method of A
    }

    public synchronized void last() {
        System.out.println("Inside B's last() method");
    }
}

public class DeadlockDemo extends Thread {
    A a = new A();  
    B b = new B();

    public void m1() {
        this.start(); // start Thread-0
        a.d1(b);      // main thread calls d1()
    }

    public void run() {
        b.d2(a);      // child thread calls d2()
    }

    public static void main(String[] args) {
        DeadlockDemo d = new DeadlockDemo();
        d.m1();
    }
}
