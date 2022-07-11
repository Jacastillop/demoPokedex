package model;
import lombok.Data;

@Data
public class Pokemon {
    private Integer id;
    private String name;
    private Integer height;
    private Integer weight;

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
