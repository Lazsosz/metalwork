package hu.peterlazsan.blacksmith.model.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "item")
@NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "made_from")
    private Metal madeFrom;

}
