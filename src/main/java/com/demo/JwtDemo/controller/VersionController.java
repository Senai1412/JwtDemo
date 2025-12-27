package com.demo.JwtDemo.controller;

import com.demo.JwtDemo.model.Version;
import com.demo.JwtDemo.repository.VersionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VersionController {
    private final VersionRepository versionRepository;

    public VersionController(VersionRepository versionRepository) {
        this.versionRepository = versionRepository;
    }

    @GetMapping("/version")
    public ResponseEntity<Version> getVersion() {
        return ResponseEntity.ok(versionRepository.getVersion());
    }
}
