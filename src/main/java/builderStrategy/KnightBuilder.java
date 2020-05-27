package builderStrategy;

public class KnightBuilder extends CharacterBuilder {

    @Override
    public void buildhealth() {
        genericRPGCharacter.setHealth(150);
    }

    @Override
    public void buildenergy() {
        genericRPGCharacter.setEnergy(100);
    }

    @Override
    public void buildmagicPoints() {
        genericRPGCharacter.setMagicPoints(60);
    }

    @Override
    public void buildattack() {
        genericRPGCharacter.setAttackType(new PhysicalAttack().attack());
    }

}
