package com.souniqsamples.controller;

import com.souniqsamples.model.SoundPack;
import com.souniqsamples.model.User;
import com.souniqsamples.service.SoundPackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packs")
public class SoundPackController {

    private final SoundPackService packService;

    public SoundPackController(SoundPackService packService) {
        this.packService = packService;
    }

    @PostMapping("/upload")
    public SoundPack uploadPack(@RequestBody SoundPack pack) {
        return packService.uploadPack(pack);
    }

    @GetMapping
    public List<SoundPack> getAll() {
        return packService.getAllPacks();
    }
}
