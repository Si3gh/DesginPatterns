package strategy;

public class King extends ChessPiece {
    public King() {
        setMovementBehaviour(new SingleMovementAnyDirection());
    }
}
