package com.ddylan.gateway.permission.user;

import com.ddylan.gateway.permission.Permission;
import com.ddylan.gateway.permission.grant.Grant;
import com.ddylan.gateway.profile.Profile;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PermissionUser extends Profile {

    private Set<Grant> grants;
    private Set<Permission> permissions;

    public PermissionUser(UUID uuid) {
        super(uuid);

        this.grants = new HashSet<>();
        this.permissions = new HashSet<>();
    }

}
