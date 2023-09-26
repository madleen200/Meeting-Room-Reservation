package com.madlien.demo.controllers;

import com.madlien.demo.entities.Gadget;
import com.madlien.demo.interfaces.GadgetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/gadget")
public class GadgetController {

    private final GadgetRepository gadgetRepository;

    public GadgetController(GadgetRepository gadgetRepository) {
        this.gadgetRepository = gadgetRepository;
    }

    @GetMapping("/gadgets-list")
    public List<Gadget> getAll() {
        return gadgetRepository.findAll();
    }

    @PostMapping("/create-gadget")
    public Gadget create(@RequestBody Gadget gadget) {
        return gadgetRepository.save(gadget);
    }

    @GetMapping("/get-gadget")
    public Gadget getById(@PathVariable Long id) {
        return gadgetRepository.findById(id).orElseThrow(() -> new RuntimeException("Gadget not found"));
    }

    @PutMapping("/update-gadget")
    public Gadget update(@PathVariable Long id, @RequestBody Gadget gadget) {
        return gadgetRepository.save(gadget);
    }

    @DeleteMapping("/delete-gadget")
    public void delete(@PathVariable Long id) {
        gadgetRepository.deleteById(id);
    }
}
