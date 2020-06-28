package com.ddylan.gateway.permission.grant;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class Grant {

    private final UUID uniqueId;
    private UUID receiver, issuer;
    private String permissionGroup;
    private Set<String> scopes;

    protected Grant() {
        this.uniqueId = UUID.randomUUID();
    }

}
