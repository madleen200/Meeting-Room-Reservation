package com.madlien.demo.services;

import com.madlien.demo.entities.Gadget;
import com.madlien.demo.interfaces.GadgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GadgetService {
    @Autowired
    private GadgetRepository gadgetRepository;

    public List<Gadget> getAllGadgets() {
        return gadgetRepository.findAll();
    }

    public Gadget getGadgetById(Long id) {
        return gadgetRepository.findById(id).orElse(null);
    }

    public Gadget createGadget(Gadget gadget) {
        return gadgetRepository.save(gadget);
    }

    public Gadget updateGadget(Long id, Gadget gadget) {
        return gadgetRepository.findById(id)
                .map(existingGadget -> {
                    existingGadget.setName(gadget.getName());
                    existingGadget.setId(gadget.getId());
                    existingGadget.setType(gadget.getType());
                    return gadgetRepository.save(existingGadget);
                })
                .orElse(null);
    }

    public void deleteGadget(Long id) {
        gadgetRepository.deleteById(id);
    }
}
