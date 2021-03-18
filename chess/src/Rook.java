public class Rook extends ChessPiece{

    String movement = " moves any number of squares horizontally or vertically in a straight line.";

    public Rook(String pieceName, String position) {
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
