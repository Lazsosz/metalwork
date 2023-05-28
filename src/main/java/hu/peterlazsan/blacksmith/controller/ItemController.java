package hu.peterlazsan.blacksmith.controller;

import hu.peterlazsan.blacksmith.model.dao.Item;
import hu.peterlazsan.blacksmith.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/all")
    @Operation(summary = "Get all items",
            description = "Get all items",
            tags = {"items"},
            operationId = "items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/add")
    @Operation(summary = "Add item",
            description = "Add item",
            tags = {"items"},
            operationId = "addItem")
    public void addItem(Item item) {
        itemService.addItem(item);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get item by id",
            description = "Get item by id",
            tags = {"items"},
            operationId = "getItemById")
    public Item getItemById(Long id) {
        return itemService.getItemById(id);
    }

}
