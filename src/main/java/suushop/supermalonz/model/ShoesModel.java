package suushop.supermalonz.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "shoes")
public class ShoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @NotNull(message = "ค่าว่าง")
    private String type;
    @NotNull(message = "ค่าว่าง")
    private String name;
    @NotNull(message = "ค่าว่าง")
    private Double price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
