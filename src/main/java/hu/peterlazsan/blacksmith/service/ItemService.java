package hu.peterlazsan.blacksmith.service;

import hu.peterlazsan.blacksmith.model.dao.Item;
import hu.peterlazsan.blacksmith.model.repos.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemService {

    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void addItem(Item item) {
        log.info("Adding item: {}", item.getName());
        itemRepository.save(item);
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found!"));
    }
}
