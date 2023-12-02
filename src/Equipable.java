public interface Equipable {
    void equip();
    void repair();
    void upgrade();
    void compare(Equipable other);
    void useSkill(Character target);

    String getSpecialMove();
}
