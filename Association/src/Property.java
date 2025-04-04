public class Property
{
    private String propertyName;
    private String ownerName;

    public Property(String propertyName,String ownerName){
        this.propertyName=propertyName;
        this.ownerName=ownerName;
    }
    public void display()
    {
        System.out.println("Property name: "+propertyName);
        System.out.println("Property owner name: "+ownerName);
    }
}
