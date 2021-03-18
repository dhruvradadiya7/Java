public abstract class ChessPiece {
    public String pieceName;
    public String position;

    public ChessPiece(String pieceName, String position){
        this.pieceName = pieceName;
        this.position = position;
    }

    public abstract void move();
  
}
