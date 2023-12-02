public class Sword implements Equipable{
    private String name;
    private int durability;
    private int maxdurability;
    private String damageType;
    private int damageRange;
    private int maxdamageRange;
    private int level;
    public Sword(String name,Character character) {
        this.level = character.getLevel();
        this.name = "Sword of Wisdom";
        this.durability = 80;
        this.damageType = "Slash";
        this.damageRange = 15;
        this.maxdurability = 80 + level;
        this.maxdamageRange =20+ level;
    }
    @Override
    public void equip() {
        // Implement Sword-specific equip logic
        System.out.println("Sword equipped.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + name);
        durability = maxdurability; // Restoring durability to 100%
    }

    @Override
    public void upgrade() {
        System.out.println("Upgrading " + name);
        maxdurability = 90 + level;
        maxdamageRange = 20 + level;
        // Implementation for upgrade action
    }

    @Override
    public void compare(Equipable other) {
        System.out.println("Comparing " + name + " with " + other.getClass().getSimpleName());
        System.out.println("Durability of " + name + " is " + maxdurability );
        System.out.println("Damage type of " + name + " is " + damageType );
        System.out.println("Damage range of " + name + " is " + maxdamageRange );


        // Implementation for compare action
    }

    @Override
    public void useSkill(Character target) {
        // Implement Sword-specific skill logic
        System.out.println("Slashing attack on " + target.getJob() + ".");
    }

    @Override
    public String getSpecialMove() {
        return "Powerful Slash";
    }


}
