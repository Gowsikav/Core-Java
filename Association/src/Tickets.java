public class Tickets
{
    private int ticketno;
    private String movieName;

    public Tickets(int ticketno,String movieName){
        this.ticketno=ticketno;
        this.movieName=movieName;
    }
    public void display()
    {
        System.out.println("Ticket Number: "+ticketno);
        System.out.println("Movie Name: "+movieName);
    }

}
