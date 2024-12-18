public interface ArenaMediator {
    void addCharacter(Character character);
    void moveCharacter(Character character, int x, int y);
    void initiateAttackCharacter(Character character);
    void notifyAllCharacters(String message);
}
