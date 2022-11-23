package com.bulletin.board.bulletinboard.controller;

import com.bulletin.board.bulletinboard.entity.Ad;
import com.bulletin.board.bulletinboard.service.AdService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ad")
public class AdController {

    private final AdService adService;

    public AdController(AdService adService) {
        this.adService = adService;
    }

    @GetMapping
    public List<Ad> getAd() {
        return adService.findAll();
    }

    @PostMapping
    public void addAd(@RequestBody Ad ad) {
        adService.save(ad);
    }

    @PutMapping
    public void updateAd(@RequestBody Ad ad) {
        adService.save(ad);
    }

    @DeleteMapping("/{adId}")
    public void deleteAd(@PathVariable int adId) {
        adService.deleteById(adId);
    }
}
