package HomeWork4.Com.Organization.Booking;


class MeetingRoom{
    private String name;
    private int capacity;
    private boolean hasProject;

    // Constructor
    public MeetingRoom(String name, int capacity, boolean hasProject) {
        this.name = name;
        this.capacity = capacity;
        this.hasProject = hasProject;
    }

    public MeetingRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    } 

    public boolean canAccommodate(int people){
        return true;
    }

    public void displayInfo(){
        System.out.println("Room: " + name + " Capcity: " + capacity + "Project: " + (hasProject ? "Yes" : "No"));
    }

    public int getCapacity(){
        return capacity;
    }


    
}