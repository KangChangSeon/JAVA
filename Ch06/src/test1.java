class Data {int x;}
public class test1 
{
    public static void main(String[] args)
    {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        chage(d.x);
        System.out.println("After chage(d.x)");
        System.out.println("main() : x = "+ d.x);
    }

    static void chage(int x)
    {
        x = 1000;
        System.out.println("change() : x = "+ x);
    }
    
}