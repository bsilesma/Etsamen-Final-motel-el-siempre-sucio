/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel.de.paso.el.cariñoso;

/**
 *
 * @author brand
 */
public class Room {
    //Defining the atributes
    private String typeOfRoom;
    private String statusOfRoom;
    private int RoomId;
    private int priceOfRoom;

    //Empty Constructor
    public Room() {
    }

    //Full Constructor
    public Room(String typeOfRoom, String statusOfRoom, int RoomId, int priceOfRoom) {
        this.typeOfRoom = typeOfRoom;
        this.statusOfRoom = statusOfRoom;
        this.RoomId = RoomId;
        this.priceOfRoom = priceOfRoom;
    }
    
    //Setters and Getters
    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getStatusOfRoom() {
        return statusOfRoom;
    }

    public void setStatusOfRoom(String statusOfRoom) {
        this.statusOfRoom = statusOfRoom;
    }

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }

    public int getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(int priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    //toString
    @Override
    public String toString() {
        return "Room{" + "typeOfRoom=" + typeOfRoom + ", statusOfRoom=" + statusOfRoom + ", RoomId=" + RoomId + ", priceOfRoom=" + priceOfRoom + '}';
    }
    
    
}
