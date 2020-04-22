package strategy;

public class Queen extends ChessPiece {
    public Queen() {
        setMovementBehaviour(new MovementAnyDirection());
    }
}
