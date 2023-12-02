public class Magician extends Character{
    public Magician(int level , int Hp , int Runspeed , int Mana , int Strength , int Endurance , int Damage) {
        super("Neuah" , "Magician", level , Hp , Runspeed , Mana , Strength , "Fast" , Endurance , Damage);
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
    public void calculateAttributes() {
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
