package hu.peterlazsan.blacksmith.service;

import hu.peterlazsan.blacksmith.model.dao.Metal;
import hu.peterlazsan.blacksmith.model.repos.MetalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MetalService {

    private MetalRepository metalRepository;

    public MetalService(MetalRepository metalRepository) {
        this.metalRepository = metalRepository;
    }
    public List<Metal> getAllMetals() {
        return metalRepository.findAll();
    }

    public Metal getMetalById(Long metalId) {
        return metalRepository.findById(metalId).orElse(null);
    }

    public Metal getMetalByName(String metalName) {
        return metalRepository.findByName(metalName);
    }

    public void addMetal(Metal metal) {
        log.info("Adding metal: {}", metal.getName());
        metalRepository.save(metal);
    }
}
