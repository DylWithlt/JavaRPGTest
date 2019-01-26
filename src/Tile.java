import java.util.ArrayList;

public class Tile {
    // Types of Tiles:
    // 0 : Grass
    // 1 : Stone
    private int x = 0;
    private int y = 0;

    private int type = 0;
    ArrayList<Item> itemsOnBlock = new ArrayList<>();

    public Tile(int type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }
    public Tile(int type, Item new_item) {
        this.type = type;
        this.itemsOnBlock.add(new_item);
    }
    public Item get_item(String name) {
        for (Item x : itemsOnBlock) {
            if (x.get_Name().equals(name)) {
                return x;
            }
        }
        return null;
    }

    public void placeItem(Item new_item) {
        this.itemsOnBlock.add(new_item);
    }
    public int get_type() {
        return this.type;
    }
    public int get_x() { return this.x; }
    public int get_y() { return this.y; }
    public ArrayList<Item> get_items() {
        return this.itemsOnBlock;
    }
}
