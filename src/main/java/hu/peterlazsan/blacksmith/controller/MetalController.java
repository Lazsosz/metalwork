package hu.peterlazsan.blacksmith.controller;

import hu.peterlazsan.blacksmith.model.dao.Metal;
import hu.peterlazsan.blacksmith.service.MetalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/metal")
public class MetalController {

    @Autowired
    private MetalService metalService;

    @GetMapping("/all")
    @Operation(summary = "Get all metals",
            description = "Get all metals",
            tags = {"metals"},
            operationId = "getAllMetals")
    public List<Metal> getAllMetals() {
        return metalService.getAllMetals();
    }

    @Operation(summary = "Get metal by id",
            description = "Get metal by id",
            tags = {"metals"},
            operationId = "getMetalById")
    @GetMapping("/${metalId}")
    public Metal getMetalById(@PathVariable("metalId") Long metalId) {
        return metalService.getMetalById(metalId);
    }
    @Operation(summary = "Get metal by name",
            description = "Get metal by name",
            tags = {"metals"},
            operationId = "getMetalByName")
    @GetMapping("/${metalName}")
    public Metal getMetalByName(@PathVariable("metalName") String metalName) {
        return metalService.getMetalByName(metalName);
    }

    @Operation(summary = "Add metal",
            description = "Add metal",
            tags = {"metals"},
            operationId = "addMetal")
    @PostMapping("/add")
    public void addMetal(@RequestBody Metal metal) {
        metalService.addMetal(metal);
    }
}
