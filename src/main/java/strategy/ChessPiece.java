package strategy;

public class ChessPiece {
    private MovementBehaviour movementBehaviour;

    String move(){
        return movementBehaviour.move();
    }

    public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
        this.movementBehaviour = movementBehaviour;
    }
}
