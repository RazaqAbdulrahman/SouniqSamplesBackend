package com.souniqsamples.service;

import com.souniqsamples.model.SoundPack;
import com.souniqsamples.model.User;
import com.souniqsamples.repository.SoundPackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoundPackService {

    private final SoundPackRepository packRepo;

    public SoundPackService(SoundPackRepository packRepo) {
        this.packRepo = packRepo;
    }

    public SoundPack uploadPack(SoundPack pack) {
        return packRepo.save(pack);
    }

    public List<SoundPack> getAllPacks() {
        return packRepo.findAll();
    }

    public List<SoundPack> getPacksByCreator(User user) {
        return packRepo.findByCreator(user);
    }
}

