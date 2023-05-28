package hu.peterlazsan.blacksmith.model.repos;

import hu.peterlazsan.blacksmith.model.dao.Metal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetalRepository extends JpaRepository<Metal, Long> {

    Metal findByName(String name);

}
