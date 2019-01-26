public class Game {
    public static void main(String[] args) {
        Player plr = new Player();
        World terrain = new World(11, 11, plr);
        plr.init(terrain, 5, 5);

        terrain.display();

    }
}
