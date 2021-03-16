import java.util.Random;
import java.util.Arrays;

class DnDCharacter {

    private static final int BEST_ROLLS = 3;
    private static final int TOTAL_ROLLS = 4;
    private static final int DICE_SIDES = 6;

    private static final Random rand = new Random();

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = 10 + modifier(constitution);
    }

    int ability() {
        int[] rolls = new int[TOTAL_ROLLS];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = rand.nextInt(DICE_SIDES) + 1;
        }
        Arrays.sort(rolls);

        int result = 0;
        for (int i = rolls.length - BEST_ROLLS; i < rolls.length; i++) {
            result += rolls[i];
        }

        return result;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }

}
