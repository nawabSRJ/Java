class First{
    int a,b;

    // ? Default Constructor
    public First()  // * no return type (like void)
    {
        a = 10;
        b = 20;
    }

    // ? Parameterized Constructor
    public First(int a , int b)
    {
        this.a = a;     // this keyword will refer to class variables
        this.b = b;
    }

    // ? Copy Constructor
    public First(First M)   
    {
        this.a = M.a;
        this.b = M.b;
    }
}

class constructors{
    public static void main(String args[])
    {
        First obj = new First();
        System.out.println(obj.a + " " + obj.b);

        First obj2 = new First(32 , 52);
        System.out.println(obj2.a + " " + obj2.b);

        First obj3 = new First(obj);
        System.out.println(obj3.a + " " + obj3.b);

    }
}