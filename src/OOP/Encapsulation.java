package OOP;


public class Encapsulation
{
    private int age; // Private Variable :: Access have within Class &  Only Class Methods Can access this Variable
    private String name;

    // Public Getter for Age
    public int getAge()
    {
        return age;
    }

    // Public Setter for Age
    public void setAge(int a)
    {
        this.age = a;
    }

    // Public Getter for Name
    public String getName()
    {
        return name;
    }

//    Public Setter for Name
    public void setName(String n)
    {
        this.name = n;
    }
    public static void main(String[] args) {
        Encapsulation s1 = new Encapsulation();
//        Here We only Access Methods of Class , Not Private Data Members
        s1.setAge(18);
        s1.setName("Musaib Tamboli");
        System.out.println(s1.getName() + " : "+ s1.getAge());
    }
}
