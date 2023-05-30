/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author ASUS
 */
public class Renter {
    private String id;
    private String Name;
    private String Contact;
    private String duration;
    private String Status;
    private String Room;

    public Renter(String id, String Name, String Contact, String duration, String totalPrice, String Status, String Room) {
        this.id = id;
        this.Name = Name;
        this.Contact = Contact;
        this.duration = duration;
        this.Status = Status;
        this.Room = Room;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }
    
    @Override
    public double totalPrice() {
        return (duration*room(price));
    }
    
}
