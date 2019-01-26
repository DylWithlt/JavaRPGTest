public class Item {
    protected String name;
    Item(String name) {
        this.name = name;
    }

    public String get_Name() {
        return this.name;
    }
}

class Nickel extends Item {
    Nickel(String name) {
        super(name);
    }
    public void use() {
        flip();
    }
    public void flip() {
        int random = (int)(Math.random()+1);
        if (random == 1) {
            System.out.println("It landed on heads");
        } else {
            System.out.println("It landed on tails.");
        }
    }
}