package com.ddylan.gateway.permission;

import org.bukkit.entity.Player;

public class Permission {

    private final String permission;

    public Permission(String permission) {
        this.permission = permission;
    }

    public boolean isNegative() {
        return permission.startsWith("-");
    }

    public boolean isWildcard() {
        return permission.endsWith("*") || permission.endsWith(".*") || permission.equalsIgnoreCase("*");
    }

    public boolean hasPermission(Player player) {
        return player.hasPermission(permission);
    }

    public void givePermission(Player player) {
        //todo permissionattatchmen stuff
    }

    public void removePermission(Player player) {
        //todo permissionattatchmen stuff
    }

}
