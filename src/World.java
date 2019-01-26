import java.util.ArrayList;

public class World {
    int maxX = 10;
    int maxY = 10;

    private ArrayList<ArrayList<Tile>> terrain;
    private Player plr;


    public World(int x, int y, Player plr) {
        this.maxX = x;
        this.maxY = y;
        this.plr = plr;
        this.terrain = new ArrayList<>();
        for (int j = 0; j < y; j++) {
            ArrayList<Tile> new_tile_list = new ArrayList<>();
            this.terrain.add(new_tile_list);
            for (int i = 0; i < x; i++) {
                Tile new_tile = new Tile(0, i, j);
                this.terrain.get(j).add(new_tile);
            }
        }
        Nickel nickel = new Nickel("Nickel");
        terrain.get(4).get(3).place_item(nickel);
    }

    public void display() {
        for (int j = 0; j < this.terrain.size(); j++) {
            for (int i = 0; i < this.terrain.get(j).size(); i++) {
                Tile cTile = this.terrain.get(j).get(i);
                if (this.plr.get_Plr_Tile() == cTile) {
                    System.out.print(" P");
                } else if (!(cTile.get_items().isEmpty())) {
                    System.out.print(" I");
                } else if (cTile.get_type() == 0) {
                    System.out.print(" _");
                } else {
                    System.out.print(" /");
                }
            }
            System.out.print("\n");
        }
    }

    public Tile get_Tile(int x, int y) {
        if (x < 0 || x > this.maxX || y < 0 || y > this.maxY) {
            return null;
        } else {
            return this.terrain.get(y).get(x);
        }
    }
}
