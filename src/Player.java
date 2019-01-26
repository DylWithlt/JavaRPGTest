public class Player {

    Tile current_Tile;
    World world;

    public void init(World world, int x, int y) {
        this.world = world;
        this.current_Tile = world.get_Tile(x, y);
    }
    public Tile get_Current_Tile() {
        return this.current_Tile;
    }
}
