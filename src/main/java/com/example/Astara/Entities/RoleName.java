package com.example.Astara.Entities;

import java.util.HashMap;
import java.util.Map;

public enum RoleName {
    ADMIN("ADMIN"), USER("USER");

    private final String role;
    private final static Map<String, RoleName> roles = new HashMap<>();

    static {
        for (RoleName role : RoleName.values()) {
            roles.put(role.role, role);
        }
    }

    RoleName(String role) { this.role = role; }

    @Override
    public String toString() { return this.role; }
}
