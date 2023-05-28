package hu.peterlazsan.blacksmith.model.repos;

import hu.peterlazsan.blacksmith.model.dao.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item, Long> {
}
