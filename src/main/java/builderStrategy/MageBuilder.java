package builderStrategy;

public class MageBuilder extends CharacterBuilder {
    @Override
    public void buildhealth() {
        genericRPGCharacter.setHealth(60);
    }

    @Override
    public void buildenergy() {
        genericRPGCharacter.setEnergy(100);
    }

    @Override
    public void buildmagicPoints() {
        genericRPGCharacter.setMagicPoints(150);
    }

    @Override
    public void buildattack() {
        genericRPGCharacter.setAttackType(new MagicAttack().attack());
    }
}
