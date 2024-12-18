public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Arena arena = new Arena();

        Character warrior = warriorFactory.createCharacter("Thor");
        Character mage = mageFactory.createCharacter("Merlin");
        Character archer = archerFactory.createCharacter("Legolas");

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.moveCharacter(warrior, 5, 10);
        arena.moveCharacter(mage, 3, 7);
        arena.moveCharacter(archer, 8, 2);
        arena.initiateAttackCharacter(warrior);
        arena.initiateAttackCharacter(mage);
        arena.initiateAttackCharacter(archer);
    }
}
