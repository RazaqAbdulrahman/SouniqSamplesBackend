package com.souniqsamples.repository;

import com.souniqsamples.model.SoundPack;
import com.souniqsamples.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoundPackRepository extends JpaRepository<SoundPack, Long> {
    List<SoundPack> findByCreator(User creator);
}

