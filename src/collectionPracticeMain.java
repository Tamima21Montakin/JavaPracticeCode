import java.util.List;
import java.util.Collection;

public class collectionPracticeMain {
    public static void main(String[] args) {
      //  collectionPracticeMain roomRate = new collectionPracticeMain();
            hotelRoom supreme = new hotelRoom("room1", "supreme", 4, 220.0);
            hotelRoom  deluxe = new hotelRoom("room2", "deluxe", 6, 520.0);
            hotelRoom basic = new hotelRoom("room3", "basic", 2, 100.0);
            hotelRoom standard = new hotelRoom("room4", "standard", 3, 150.0);

            Collection<hotelRoom> rooms = List.of(supreme,deluxe,basic,standard);
            double total = getRoomRate(rooms);
            System.out.println(total);


    }
    public static double getRoomRate(Collection<hotelRoom> rooms)
    {
        return rooms.stream().mapToDouble(r->r.getRate()).sum();
    }

}