public class Pawn extends ChessPiece{

    String movement = " only move one or two square forward, never backward or sideways.";

    public Pawn(String pieceName, String position) {
        super(pieceName, position);
    }

    @Override
    public void move() {
        System.out.println("Movement!");
    }

    public void movementDescription(){
        System.out.println(pieceName+movement);
    }
}
