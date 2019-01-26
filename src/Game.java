import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player plr = new Player();
        World terrain = new World(11, 11, plr);
        plr.init(terrain, 5, 5);

        terrain.display();

        Scanner in = new Scanner(System.in);

        while (true) {

            for (int i = 0; i < 100; i++) {
                System.out.print("\n");
            }
            terrain.display();
            System.out.println("Input Commands: ");
            String[] input = in.nextLine().split(" ", 5);

            switch (input[0]) {
                case "move":
                    switch (input[1]) {
                        case "UL":
                            plr.move(0);
                            break;
                        case "U":
                            plr.move(1);
                            break;
                        case "UR":
                            plr.move(2);
                            break;
                        case "L":
                            plr.move(3);
                            break;
                        case "R":
                            plr.move(4);
                            break;
                        case "DL":
                            plr.move(5);
                            break;
                        case "D":
                            plr.move(6);
                            break;
                        case "DR":
                            plr.move(7);
                            break;
                        default:
                            plr.move(8);
                    }
                    break;
                case "search":
                    Tile pTile = plr.get_Plr_Tile();
                    if (!(pTile.get_items().isEmpty())) {
                        for (Item x : plr.get_Plr_Tile().get_items()) {
                            System.out.println(x.get_Name());
                        }
                    } else {
                        System.out.println("No items found.");
                    }
                    System.out.print("Continue... ");
                    in.nextLine();
                    break;
                case "pickup":
                    Item cItem = plr.get_Plr_Tile().get_item(input[1]);
                    if (cItem != null) {
                        plr.add_to_inv(cItem);
                        plr.get_Plr_Tile().remove_item(cItem);
                        System.out.println(cItem.get_Name() + " found!");
                    } else {
                        System.out.println("Item not found.");
                    }
                    System.out.print("Continue... ");
                    in.nextLine();
                    break;
                case "inv":
                    for (Item x : plr.get_inv()) {
                        System.out.println(x.get_Name() + " ");
                    }
                    System.out.print("Continue... ");
                    in.nextLine();
                    break;
                case "use":
                    Item tempItem = plr.get_item(input[0]);


                case "quit":
                    System.exit(0);
                    break;
            }
        }
    }
}
