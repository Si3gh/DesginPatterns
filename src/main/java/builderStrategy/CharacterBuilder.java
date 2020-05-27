package builderStrategy;

public abstract class CharacterBuilder {
    protected GenericRPGCharacter genericRPGCharacter;

    public GenericRPGCharacter getGenericRPGCharacter(){
        return genericRPGCharacter;
    }

    public void createNewCharacter() {
        genericRPGCharacter = new GenericRPGCharacter();
    }

    public abstract void buildhealth();
    public abstract void buildenergy();
    public abstract void buildmagicPoints();
    public abstract void buildattack();

}

