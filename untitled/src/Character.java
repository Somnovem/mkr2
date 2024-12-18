public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = 0;
        this.y = 0;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }
}

class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150, 20);
    }
}

class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 40);
    }
}

class Archer extends Character {
    public Archer(String name) {
        super(name, 120, 30);
    }
}

interface CharacterFactory {
    Character createCharacter(String name);
}

class WarriorFactory implements CharacterFactory {
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}

class MageFactory implements CharacterFactory {
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}

class ArcherFactory implements CharacterFactory {
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
