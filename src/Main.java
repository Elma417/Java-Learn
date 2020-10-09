class Hero
{
    String Name;
    float HP;
    float armor;
    int movespeed;
}
class item
{
    String name;
    int price;
}
public class Main
{
    public static void  main(String[] args)
    {
        Hero Garen =new Hero();
        Garen.Name="NOOB";
        Garen.HP=6655;
        item bloodBottle=new item();
        bloodBottle.price=50;
        bloodBottle.name="血瓶";
    }
}
