public class Village
{
    String name;
    int noOfHouse;
    Property[] property;
    Tickets[] ticket;

    public Village(String name, int noOfHouse, Property[] property, Tickets[] ticket)
    {
        this.name=name;
        this.noOfHouse=noOfHouse;
        this.property=property;
        this.ticket=ticket;

    }

    public void display()
    {
        System.out.println("Village name: "+name);
        System.out.println("No of Houses in village: "+noOfHouse);
        for(Property p:property)
           p.display();
        for(Tickets t:ticket)
            t.display();
    }
}
