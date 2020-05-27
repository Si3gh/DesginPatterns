package builderStrategy;

public class BuilderStrategyDemo {
    public static void main(String[] args) {
        DungeonMaster dungeonMaster = new DungeonMaster();
        CharacterBuilder kgnitCharacterBuilder = new KnightBuilder();
        CharacterBuilder MageCharacterBuilder = new MageBuilder();

        dungeonMaster.setCharacterBuilder(kgnitCharacterBuilder);
        dungeonMaster.constructCharacter();

        GenericRPGCharacter knight = dungeonMaster.getCharacter();
        System.out.println(knight.toString());


        dungeonMaster.setCharacterBuilder(MageCharacterBuilder);
        dungeonMaster.constructCharacter();

        GenericRPGCharacter mage = dungeonMaster.getCharacter();
        System.out.println(mage.toString());
    }
}
