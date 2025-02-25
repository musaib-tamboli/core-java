package Enums;
enum Car
{
    Ferrari(10000),
    Lambogini(20000),
    Rolls_Royace(30000),
    Bently(40000),
    Audi,
    ;

    private int price;

    Car() // Default Constructor
    {
        this.price = 1000;
    }
    Car(int price) {                // Parameterized Constructor
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice()
    {
        this.price = price;
    }
}

public class EnumMethod {
    public static void main(String[] args) {
//        Car c = Car.Ferrari;
//        System.out.println(c + " : "+c.getPrice());

//        Printing All Cars & their Prices
        for (Car c1 : Car.values())
        {
            System.out.println(c1 + " : "+c1.getPrice());
        }

    }
}
