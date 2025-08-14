package HomeWork3.GameSetting;

public class Player {
    public String name;
    public int health;
    public int mana;

    public Player(String name){
        this.name = name;
        this.health = GameSetting.MAX_HEALTH;
        this.mana = GameSetting.MAX_MANA;
    }

    public void disPlayStats(){
        System.out.println(name + "|HP :" + health + "|MANA :" + mana);
    }
}
