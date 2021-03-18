public class Bishop extends ChessPiece{
    String movement = " moves any number of squares diagonally in a straight line.";

    public Bishop(String pieceName, String position) {
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
