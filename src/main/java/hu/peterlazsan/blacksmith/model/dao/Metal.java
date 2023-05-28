package hu.peterlazsan.blacksmith.model.dao;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "metal")
@NamedQuery(name = "Metal.findAll", query = "SELECT m FROM Metal m")
public class Metal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int price;

    private int weight;

    private int durability;

    private int hardness;

    private int sharpness;

    private int toughness;

    private int heatResistance;

    private int corrosionResistance;

    private int electricalConductivity;
}
