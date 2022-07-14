package Composition.challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AC sharpAC = new AC("sharp","2hp");
        Closet whiteRoom = new Closet(1, 2, 5);
        Furniture woodPiece = new Furniture(4, 1, 1, 5, new Size(40,60));
        Window slideGlass = new Window(1, true,new Measurement(40,60));

       Room room109 = new Room(sharpAC,whiteRoom,woodPiece,slideGlass);
//        room109.openWindow();
//        room109.cleanCloset("hypo");
//        room109.reduceTemp(18);
        Room room123 = new Room(sharpAC,whiteRoom,woodPiece,slideGlass);
        Room room124 = new Room(sharpAC,whiteRoom,woodPiece,slideGlass);
        Room room125 = new Room(sharpAC,whiteRoom,woodPiece,slideGlass);
        Room room126 = new Room(sharpAC,whiteRoom,woodPiece,slideGlass);

        Room [] rooms = new Room[5];
        rooms[0] = room109;
        rooms[0].reduceTemp(25);



    }
}
