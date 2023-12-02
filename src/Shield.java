public class Shield implements Equipable{
    private String name;
    private int durability;
    private String damageType;
    private int damageRange;

    public Shield(String name, int durability, String damageType, int damageRange) {
        this.name = name;
        this.durability = durability;
        this.damageType = damageType;
        this.damageRange = damageRange;
    }

    @Override
    public void equip() {
        System.out.println("Equipping " + name);
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + name);
        durability = 100; // Restoring durability to 100%
    }

    @Override
    public void upgrade() {
        System.out.println("Upgrading " + name);
        // Implementation for upgrade action
    }

    @Override
    public void compare(Equipable other) {
        System.out.println("Comparing " + name + " with " + other.getClass().getSimpleName());
        System.out.println("Durability of " + name + " is " + durability );
        System.out.println("Damage type of " + name + " is " + damageType );
        System.out.println("Damage range of " + name + " is " + damageRange );
        // Implementation for compare action
    }

    @Override
    public void useSkill(Character target) {
        System.out.println();
        // No special skill for shields
    }

    @Override
    public String getSpecialMove() {
        return null;
    }
}
