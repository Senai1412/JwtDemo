package com.demo.JwtDemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Version {
    private String version;
    private String appName;

    public Version(String projectVersion, String projectName) {
        this.version = projectVersion;
        this.appName = projectName;
    }
}
