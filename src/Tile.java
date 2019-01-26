import java.util.ArrayList;

public class Tile {
    // Types of Tiles:
    // 0 : Grass
    // 1 : Stone

    int type = 0;
    ArrayList<Item> itemsOnBlock = new ArrayList<>();
    public Tile(int type) {
        this.type = type;
    }
    public Tile(int type, Item new_item) {
        this.type = type;
        itemsOnBlock.add(new_item);
    }

    public void placeItem(Item new_item) {
        itemsOnBlock.add(new_item);
    }
    public int get_type() {
        return this.type;
    }
    public ArrayList<Item> get_items() {
        return this.itemsOnBlock;
    }
}
