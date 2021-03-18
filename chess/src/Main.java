public class Main {
    public static void main(String[] args){

        /*Rook newRook = new Rook("Rook","corner");
        Bishop newBishop = new Bishop("Bishop","next to Knight");
        Knight newKnight = new Knight("Knight","next to Rook");
        Queen newQueen = new Queen("Queen","between Bishop and King");
        King newKing = new King("King","between Bishop and Queen");
        Pawn newPawn = new Pawn("Pawn","Whole second last line of chess board");

        newRook.movementDescription();
        newBishop.movementDescription();
        newKnight.movementDescription();
        newQueen.movementDescription();
        newKing.movementDescription();
        newPawn.movementDescription();*/

        ChessBoard board1 = new ChessBoard(8, 8);
        System.out.println(board1.getHeight());
        System.out.println(board1.getChesspiece());
        //pawn on board1
        System.out.println(board1.pawn.position);

    }
}
