import java.util.logging.Level;

public class Warrior extends Character {
    public Warrior(int level , int Hp , int Runspeed , int Mana , int Strength , int Endurance , int Damage) {
        super("Nae" , "Warrior", level , Hp , Runspeed , Mana , Strength , "Slow" , Endurance , Damage);
    }

    @Override
    protected int calculateBaseDamage() {
        return 10 + getLevel() * 2;
    }

    @Override
    protected int calculateBaseDefense() {
        return 5 + getLevel();
    }

    @Override
    protected int calculateSwordDamage() {
        return (int) (calculateBaseDamage() * (1 + 0.1 * getLevel()));
    }

    @Override
    protected int calculateShieldDefense() {
        return (int) (calculateBaseDefense() * (1 + 0.05 * getLevel()));
    }
    
    @Override
    protected void calculateAttributes() {
        int strength = 20 + 2 * getLevel();
         int agility = 15 + getLevel();
         int endurance = 25 + 3 * getLevel();
         int baseRunSpeed = 5 + getLevel();
         double maxRunSpeed = calculateMaxRunSpeed();

    }

    private int callculateMaxHp(){
        return 100+5*getLevel();
    }
    public  int getMaxHp(){
        return callculateMaxHp();
    }
}