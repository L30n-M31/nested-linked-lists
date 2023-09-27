package academic;

public class Schedule extends Course {
    private String startTime;
    private String endTime;
    private String days;
    private String roomNumber;

    public Schedule() {
        super();
        setStartTime(null);
        setEndTime(null);
        setDays(null);
        setRoomNumber(null);
    } // end of default constructor

    public Schedule(String startTime, String endTime, String days, String roomNumber) {
        super();
        setStartTime(startTime);
        setEndTime(endTime);
        setDays(days);
        setRoomNumber(roomNumber);
    } // end of constructor

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getDays() {
        return days;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Time: " + startTime + " - " + endTime + "\n" +
                "Days: " + days + "\n" +
                "Room Number: " + roomNumber + "\n";
    } // end of toString method
} // end of Schedule class
