import java.util.ArrayList;


public class Monster implements Saveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write() {
        Integer integer = hitPoints;
        Integer integer1 = strength;
        ArrayList<String> writeLines = new ArrayList<>();
        writeLines.add(this.name);
        writeLines.add(integer.toString());
        writeLines.add(integer1.toString());
        return writeLines;
    }

    @Override
    public void read(ArrayList<String> lines) {
        if (lines != null && lines.size() > 0) {
            System.out.print("Monster{");
            for (int i = 0; i < lines.size(); i++) {

                if (lines.get(i).equals(getName())) {
                    System.out.print("name='" + getName() + '\'');
                }

                Integer integer = getHitPoints();
                if (lines.get(i).equals(integer.toString())) {
                    System.out.print(", hitPoints=" + getHitPoints());
                }
                Integer integer1 = getStrength();
                if (lines.get(i).equals(integer1.toString())) {
                    System.out.print(", strength=" + getStrength());
                }

            }
            System.out.print('}' + "\n");
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
