package com.ddylan.gateway.permission.group;

import com.ddylan.gateway.permission.Permission;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class PermissionGroup {

    @Getter @Setter private String name;
    private Set<Permission> permissions;

    public PermissionGroup(String name) {
        this.name = name;
        this.permissions = new HashSet<>();
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }



}
