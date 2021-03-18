public class Knight extends ChessPiece{

    String movement = " moves two squares horizontally or vertically, and then turns at a right or left angle to move one more square.";

    public Knight(String pieceName, String position) {
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
