//public class Main {
//    public static void main(String[] args) {
//        // Create characters and equipment
//        Character warrior = new Warrior( 5);
//        Character magician = new Magician(5);
//
//        Equipable sword = new Sword("Sword of Wisdom", 80, "Slash", 20);
//        Equipable wand = new Wand("The Holy Wand", 90, "Magic", 15);
//        Equipable shield = new Shield("Shield", 100, "Block", 10);
//
//        // Equip characters with equipment
//        warrior.setEquipment(sword);
//        magician.setEquipment(wand);
//        // Perform actions
//        warrior.attack(magician);
//        magician.attack(warrior);
//
//
//        // Perform equipment actions
//        sword.repair();
//        wand.upgrade();
//        shield.compare(sword);
//
//        // Use special skills
//        magician.useSkill(warrior);
//        warrior.useSkill(magician);
//
//        // ask fo r max HP
//
//
//    }
//}




public class Main {
    public static void main(String[] args) {
        // Create characters and equipment
        Character warrior = new Warrior(5 , 100 , 60 , 60 , 90 , 90 , 20);
        Character magician = new Magician(5 , 80 , 80 , 100 , 65 , 40 , 15);
        // Show character information
        showInfo(warrior);
        System.out.println("----------------------------------------------");
        showInfo(magician);
        System.out.println("----------------------------------------------");

        Equipable sword = new Sword("Sword of Wisdom", warrior);
        Equipable wand = new Wand("The Holy Wand", magician);
        Equipable shield = new Shield("Shield", 100, "Block", 10);

        // Equip characters with equipment
        warrior.setEquipment(sword);
        magician.setEquipment(wand);
        System.out.println("----------------------------------------------");

        // Perform actions
        warrior.attack(magician);
        magician.attack(warrior);
        System.out.println("----------------------------------------------");

        // Perform equipment actions
        sword.repair();
        wand.upgrade();
        shield.compare(sword);
        System.out.println("----------------------------------------------");

        // Use special skills
        magician.useSkill(warrior);
        warrior.useSkill(magician);
        System.out.println("----------------------------------------------");

        // Print max HP of characters
        System.out.println("Warrior's Max HP: " + ((Warrior) warrior).getMaxHp());
        System.out.println("Magician's Max HP: " + ((Magician) magician).getMaxHp());
        System.out.println("----------------------------------------------");

        wand.equip();
        wand.repair();
        wand.upgrade();
        wand.useSkill(warrior);
        wand.compare(sword);
        System.out.println("----------------------------------------------");

        // Print the special move of the Wand
        System.out.println("Wand's Special Move: " + wand.getSpecialMove());
        System.out.println("----------------------------------------------");

        System.out.println();
    }
    public static void showInfo(Character someoneelse){
        System.out.println("↓ Character Information ↓");
        System.out.println("Character Name : " + someoneelse.name);
        System.out.println("Character Hp : " + someoneelse.maxHp);
        System.out.println("Character Mana : " + someoneelse.maxMana);
        System.out.println("Character Strength : " + someoneelse.Strength);
        System.out.println("Character Agility : " + someoneelse.Agility);
        System.out.println("Character Endurance : " + someoneelse.Endurance);
        System.out.println("Character Damege : " + someoneelse.Damage);
    }
}
