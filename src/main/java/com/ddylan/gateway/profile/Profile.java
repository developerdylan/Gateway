package com.ddylan.gateway.profile;

import com.ddylan.gateway.Gateway;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;

import java.util.UUID;

@Getter
@Setter
public class Profile {

    private final UUID uuid;
    private String name;

    public Profile(UUID uuid) {
        this(uuid, "");

        //  Attempt to automatically find the name throughout the system to automatically find them.
        //  It is expected for the name to be updated on every AsyncPlayerPreLoginEvent
        if (Gateway.getInstance().getLibraryPlugin().getUuidCache().ensure(uuid)) {
            this.name = Gateway.getInstance().getLibraryPlugin().getUuidCache().name(uuid);
        } else {
            if (Bukkit.getPlayer(uuid) != null) {
                this.name = Bukkit.getPlayer(uuid).getName();
            } else {
                this.name = "null";
            }
        }
    }

    public Profile(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

}
