package com.souniqsamples.service;

import com.souniqsamples.model.Purchase;
import com.souniqsamples.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepo;

    public PurchaseService(PurchaseRepository purchaseRepo) {
        this.purchaseRepo = purchaseRepo;
    }

    public Purchase recordPurchase(Purchase purchase) {
        return purchaseRepo.save(purchase);
    }

    public List<Purchase> getPurchasesByEmail(String email) {
        return purchaseRepo.findByCustomerEmail(email);
    }
}

