class A 
{
    public void show() 
    {
        System.out.println("in show");
    }

    class B 
    {
        public void config() 
        {
            System.out.println("in config");
        }
    }
}

public class FirstInner 
{
    public static void main(String[] args) 
    {
        A obj = new A();          // Create outer class object
        obj.show();               // Call outer class method

        A.B obj2 = obj.new B();   // Create inner class object
        obj2.config();            // Call inner class method
    }
}
