public class ChessBoard {
    private int height;
    private int width;

    private int[][] Chesspiece = new int[height][width];

    ChessPiece pawn = new Pawn("ThePawn","pawn");
    ChessPiece king = new King("TheKing","king");
    ChessPiece knight = new Knight("TheKnight","knight");
    ChessPiece queen = new Queen("TheQueen","queen");
    ChessPiece rook = new Rook("TheRook", "rook");
    ChessPiece bishop = new Bishop("TheBishop","bishop");


    public ChessBoard(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int[][] getChesspiece() {

        return Chesspiece;
    }

    public void setChesspiece(int[][] chesspiece) {

        Chesspiece = chesspiece;
    }

}
