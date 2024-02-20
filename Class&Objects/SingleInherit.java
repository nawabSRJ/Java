class A {
    int a , b;
    public A()
    {
        a = 10;
        b = 20;
    }

}
class SingleInherit {
    public static void main(String args[])    
    {
        A obj = new A();
        System.out.println(obj.a + " " + obj.b);
    }
}
