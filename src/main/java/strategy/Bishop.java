package strategy;

public class Bishop extends ChessPiece{
    public Bishop() {
        setMovementBehaviour(new DiagonalMovement());
    }
}
