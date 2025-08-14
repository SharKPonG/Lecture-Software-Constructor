package HomeWork3.GameSetting;

public class Mage extends Player {
    Mage(String name){
        super(name);
    }
    public void castSpell(){
        System.out.println(name + "Spell :");
        this.mana -= 10;
    }
}
