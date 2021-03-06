package com.thycotic.secrets.vault.spring;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Java representation of a <i>Secret</i> retrieved from DevOps Secrets Vault.
 */
public class Secret extends ResourceMetadata {
    private final List<String> attributes = Collections.emptyList();
    private final Map<String, String> data = Collections.emptyMap();
    private String path;

    public List<String> getAttributes() {
        return attributes;
    }

    public Map<String, String> getData() {
        return data;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return String.format("Secret { path: %s, version: %d, lastModified: %s, lastModifiedBy: %s, data: %s }", this.path,
                this.version, super.getLastModified(), super.getLastModifiedBy(), this.data);
    }
}
