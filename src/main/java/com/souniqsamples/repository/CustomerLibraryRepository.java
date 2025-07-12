package com.souniqsamples.repository;

import com.souniqsamples.model.CustomerLibrary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerLibraryRepository extends JpaRepository<CustomerLibrary, Long> {
}
