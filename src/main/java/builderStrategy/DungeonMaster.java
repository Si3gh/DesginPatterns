package builderStrategy;

public class DungeonMaster {
    private CharacterBuilder characterBuilder;

    public void setCharacterBuilder(CharacterBuilder cb) {
        characterBuilder = cb;
    }

    public GenericRPGCharacter getCharacter() {
        return characterBuilder.getGenericRPGCharacter();
    }

    public void constructCharacter() {
        characterBuilder.createNewCharacter();
        characterBuilder.buildhealth();
        characterBuilder.buildattack();
        characterBuilder.buildenergy();
        characterBuilder.buildmagicPoints();
    }
}
