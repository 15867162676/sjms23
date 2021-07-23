package prototype.Demo1;

/**
 * @author TF014268
 * @description 地址
 * @since 2021/7/16 0016 17:29
 */
public class Location {
    String adress;
    int roomNumber;

    public Location(String adress, int roomNumber) {
        this.adress = adress;
        this.roomNumber = roomNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Location{" +
                "adress='" + adress + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
