package HomeWork4.Com.Organization.Booking;

public class BookingManager {
    private MeetingRoom[] rooms = new MeetingRoom[3];

    public BookingManager() {
        rooms[0] = new MeetingRoom("Room A", 10);
        rooms[1] = new MeetingRoom("Room B", 15);
        rooms[2] = new MeetingRoom("Room C", 20);
    }
  
    public MeetingRoom findSuitableRooom(int people) {
        for (MeetingRoom room : rooms) {
            if (room.getCapacity() >= people) {
                return room;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BookingManager bm = new BookingManager();
        int people = 12;

        MeetingRoom result = bm.findSuitableRooom(people);

        if (result != null) {
            System.out.println("Best room for " + people + " people:");
            result.displayInfo();
        } else {
            System.out.println("No suitable room found");
        }
    }
}
