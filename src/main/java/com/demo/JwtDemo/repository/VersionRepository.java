package com.demo.JwtDemo.repository;

import com.demo.JwtDemo.model.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class VersionRepository {

    @Value("${project.version:unknown}")
    String projectVersion;

    @Value("${project.name:JwtDemo}")
    String projectName;

    public Version getVersion() {
        return new Version(projectVersion,projectName);
    }
}
