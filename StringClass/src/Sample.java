public class Sample
{
    public static void main(String[] args) {
        String name="Ram";
        String updated=name.concat("Kumar");
        System.out.println("Name: "+name);
        System.out.println("Updated name: "+updated);
        String u_name="RamKumar";
        if(updated==u_name) {
            System.out.println("Matching");
        }
        else {
            System.out.println("Not matching");
        }
    }

}
