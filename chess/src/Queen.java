public class Queen extends ChessPiece{

    String movement = " can move any number of squares in a straight line and in any direction.";

    public Queen(String pieceName, String position) {
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