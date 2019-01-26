import java.util.ArrayList;

public class Player {

    int x = 0;
    int y = 0;

    Tile current_Tile;
    World world;

    private ArrayList<Item> inventory = new ArrayList<>();



    public void init(World world, int x, int y) {
        this.world = world;
        this.current_Tile = world.get_Tile(x, y);
        this.x = x;
        this.y = y;
    }

    // Direction Codes
    // 0 1 2
    // 3 P 4
    // 5 6 7

    public void move(int dir) {
        Tile target = null;
        switch(dir){
            case 0: // UL
                target = this.world.get_Tile(this.current_Tile.get_x() - 1, this.current_Tile.get_y() - 1);
                break;
            case 1: // U
                target = this.world.get_Tile(   this.current_Tile.get_x()    , this.current_Tile.get_y() - 1);
                break;
            case 2: // UR
                target = this.world.get_Tile(this.current_Tile.get_x() + 1, this.current_Tile.get_y() - 1);
                break;
            case 3: // L
                target = this.world.get_Tile(this.current_Tile.get_x() - 1,    this.current_Tile.get_y()    );
                break;
            case 4: // R
                target = this.world.get_Tile(this.current_Tile.get_x() + 1,    this.current_Tile.get_y()    );
                break;
            case 5: // DL
                target = this.world.get_Tile(this.current_Tile.get_x() - 1, this.current_Tile.get_y() + 1);
                break;
            case 6: // D
                target = this.world.get_Tile(   this.current_Tile.get_x()    , this.current_Tile.get_y() + 1);
                break;
            case 7: // DR
                target = this.world.get_Tile(this.current_Tile.get_x() + 1, this.current_Tile.get_y() + 1);
                break;
            default:
                System.out.println("Invalid Move.");
        }
        if (target != null) {
            this.current_Tile = target;
        } else {
            System.out.println("Invalid Move.");
        }
    }

    public Item get_item(String name) {
        for (Item x : inventory) {
            if (x.get_Name().equals(name)) {
                return x;
            }
        }
        return null;
    }

    public ArrayList<Item> get_inv() {
        return this.inventory;
    }

    public void add_to_inv(Item item) {
        this.inventory.add(item);
    }


    public Tile get_Plr_Tile() {
        return this.current_Tile;
    }
}
