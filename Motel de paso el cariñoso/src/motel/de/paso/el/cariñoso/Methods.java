/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel.de.paso.el.cariñoso;

import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class Methods {

    Methods() {
    }

    public void greetings() { //Introducing the program to the user
        JOptionPane.showMessageDialog(null, "Welcome to the cheapest ass and dirtiest motel of all Costa Rica");
        JOptionPane.showMessageDialog(null, "And ofcourse the uglier program ever made, please follow the following instructions");
    }
    
    public void menu() {  //Method to introduce the menu
        int lecture;
        do{
            lecture = Integer.parseInt(JOptionPane.showInputDialog("Type 1 for see a room. Type 2 for modify a room. Type 3 for see all rooms. Type 4 to exit: "));
            
            switch (lecture) {
                case 1 -> //Option for see a room
                    lookingRooms();
                case 2 -> //Option for see modify the room
                    modifyRoom();
                case 3 -> //Option for see all rooms
                    seeAllRooms();
                case 4 -> //Option for exit
                    JOptionPane.showMessageDialog(null, "Bye bye");
                default -> JOptionPane.showMessageDialog(null, "Invalid option"); //If user type anything else, system will show
            }
        } while (lecture!=4); //This allow the program to always keep working
        
    }

    public Room[][] rooms; //Creating the Bimensional Matriz

    public Methods(int pisos, int roomFloors) {
    }

    public void lookingRooms() {         //Create method to looking for the rooms (option #1)
        //Create the variable for use in this method
        for (int i = rooms.length - 1; i >= 0; i++) {             for (Room room : rooms[i]) {
            room.toString(); //Print in console the Matriz
            }
        }
    }

    public void modifyRoom(){ //Method to modify a room (Option #2

        JOptionPane.showMessageDialog(null, "Esto aun no está hecho");
        
    }
    public void seeAllRooms() { //Method to see all the rooms (option #3)
        int roomsFree = 0;
        int dirtyRoom = 0;

        //For used to collect the data
        for (Room[] room : rooms) {
            for (Room room1 : rooms[1]) {
                String statusAllRooms = room1.getStatusOfRoom(); //Create de variable to use in the if
                //if used to verify the status of the room (free,, full or dirty)
                switch (statusAllRooms) {
                    case "free" -> //
                        roomsFree++; //Add +1 to the
                    case "Full" -> dirtyRoom++; //Add +1 to the quantity of dirty room
                    case "Dirty" -> {
                    }
                    default -> {
                    }
                }
            }
        }

    }

}
