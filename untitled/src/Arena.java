import java.util.ArrayList;
import java.util.List;

public class Arena implements ArenaMediator {
    private List<Character> characters = new ArrayList<>();

    @Override
    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println("Character " + character.getName() + " has entered the arena!");
        notifyAllCharacters("New character added: " + character.getName());
    }

    @Override
    public void moveCharacter(Character character, int x, int y) {
        character.move(x, y);
        notifyAllCharacters(character.getName() + " moved to position (" + x + ", " + y + ")");
    }

    @Override
    public void initiateAttackCharacter(Character character) {
        notifyAllCharacters(character.getName() + " attacks with " + character.getAttackPower());
    }

    @Override
    public void notifyAllCharacters(String message) {
        for (Character character : characters) {
            System.out.println("Notify " + character.getName() + ": " + message);
        }
    }
}