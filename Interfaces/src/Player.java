import java.util.ArrayList;

public class Player implements Saveable {
    private String name;
    private String weapon = "Sword";
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> write = new ArrayList<>();
        Integer integer = hitPoints;
        Integer integer1 = strength;

        write.add(this.name);
        write.add(this.weapon);
        write.add(integer.toString());
        write.add(integer1.toString());
        return write;
    }

    @Override
    public void read(ArrayList<String> lines) {
        if (lines != null && lines.size() > 0) {
            System.out.print("Player{");
            for (int i = 0; i < lines.size(); i++) {

                if (lines.get(i).equals(getName())){
                    System.out.print("name='" + getName() + '\'');
                }
                if (lines.get(i).equals(getWeapon())){
                    System.out.print(", weapon='" + getWeapon() + '\'');
                }
                Integer integer=getHitPoints();
                if (lines.get(i).equals(integer.toString())){
                    System.out.print(", hitPoints=" + getHitPoints());
                }
                Integer integer1=getStrength();
                if (lines.get(i).equals(integer1.toString())){
                    System.out.print( ", strength=" + getStrength());
                }

            }
            System.out.print('}');
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }


    public String getWeapon() {
        return weapon;
    }



    public int getHitPoints() {
        return hitPoints;
    }



    public int getStrength() {
        return strength;
    }


}
