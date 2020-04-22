package strategy;

public class AppStrategy {
    public static void main(String[] args) {
        King king = new King();
        Bishop bishop = new Bishop();
        Queen queen = new Queen();
        Pawn pawn = new Pawn();

        System.out.println("REI: " + king.move());
        System.out.println("BISPO: " + bishop.move());
        System.out.println("RAINHA: " + queen.move());
        System.out.println("PEÃO: " + pawn.move());
    }
}
