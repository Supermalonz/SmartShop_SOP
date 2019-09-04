package suushop.supermalonz.structure;
import java.util.ArrayList;
import java.util.List;

public class ListShoes {
    public static Shoes[] allShoes = new Shoes[]{
            new Shoes(1, typeShoes.Adidas, "Yeezy", 8900.0),
            new Shoes(2, typeShoes.Nike, "AirJordan", 6500.0),
            new Shoes(3, typeShoes.Converse, "AllStar", 2100.0),
            new Shoes(4, typeShoes.NewBalance, "997", 3000.0),
            new Shoes(5, typeShoes.Supreme, "AirForce1", 6500.0),
            new Shoes(6, typeShoes.Onitsuka, "Tiger", 6000.0),
            new Shoes(7, typeShoes.OffWhite, "OffGod", 10000.0),
            new Shoes(8, typeShoes.Adidas, "NMD", 8900.0),
            new Shoes(9, typeShoes.Nike, "Airmax", 6500.0),
            new Shoes(10, typeShoes.Converse, "AllStar2", 2100.0),
            new Shoes(11, typeShoes.NewBalance, "997", 3000.0),
            new Shoes(12, typeShoes.Supreme, "AirForce1s", 6500.0),
            new Shoes(13, typeShoes.Onitsuka, "TigerGod", 6000.0),
            new Shoes(14, typeShoes.OffWhite, "OffHolyGod", 10000.0),
    };

    public static Shoes[] getAllShoes() {
        return allShoes;
    }

    public static Shoes getShoes(int id){
        for (Shoes i: allShoes) {
            if (i.getId() == id) return i;
        }
        return null;
    }

}
