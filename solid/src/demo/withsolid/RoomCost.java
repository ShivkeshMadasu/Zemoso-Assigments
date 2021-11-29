package demo.withsolid;

public class RoomCost {
    private RoomInformation roomInfo;
    private double costOfRoom;
    RoomCost(RoomInformation roomInfo)
    {
        this.roomInfo= roomInfo;
    }
    public double getCost()
    {
        return roomInfo.cost();
    }
}
