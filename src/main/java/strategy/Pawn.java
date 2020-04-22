package strategy;

public class Pawn extends ChessPiece {
    public Pawn() {
        setMovementBehaviour(new SingleMovementAnyDirection());
    }
}
