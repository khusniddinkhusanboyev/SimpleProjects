import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


       Saveable monster=new Monster("Werewolf" ,20,40 );
        monster.read(monster.write());
        System.out.println(monster.toString());


       Saveable player=new Player("tim",10,15);
        player.read(player.write());
        System.out.println(player.toString());

    }
}