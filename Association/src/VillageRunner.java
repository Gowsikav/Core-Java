public class VillageRunner
{
    public static void main(String[] args)
    {
        Property property1=new Property("laskmi","Raj");
        Property property2=new Property("Victory","Ram");
        Property[] property={property1,property2};

        Tickets ticket1=new Tickets(2001,"Max");
        Tickets ticket2=new Tickets(2004,"Dragon");
        Tickets[] ticket={ticket1,ticket2};

        Village village =new Village("kattuputhur",100,property,ticket);
        village.display();
    }
}
