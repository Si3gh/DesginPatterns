package builderStrategy;

public class GenericRPGCharacter {
    protected int health;
    protected int energy;
    protected int magicPoints;
    protected String attackType;
    protected int xPos;
    protected int yPos;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public Object getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public String toString() {
        return "GenericRPGCharacter{" +
                "health=" + health +
                ", energy=" + energy +
                ", magicPoints=" + magicPoints +
                ", attackType=" + attackType +
                '}';
    }
}
