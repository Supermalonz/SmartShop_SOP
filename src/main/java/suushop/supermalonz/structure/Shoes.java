package suushop.supermalonz.structure;

public class Shoes {
    @Override
    public String toString() {
        return super.toString();
    }

    private int id;
    private typeShoes type;
    private String name;
    private Double price;

    public Shoes(int id, typeShoes type, String name, Double price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public typeShoes getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

enum typeShoes {
    Adidas,
    Nike,
    Converse,
    Supreme,
    Onitsuka,
    NewBalance,
    OffWhite
}