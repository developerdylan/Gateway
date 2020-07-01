package com.ddylan.gateway;

import com.ddylan.library.LibraryPlugin;
import com.lunarclient.bukkitapi.LunarClientAPI;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class  Gateway extends JavaPlugin {

    @Getter private static Gateway instance;

    private LunarClientAPI lunarAPI;
    private LibraryPlugin LibraryPlugin;

    @Override
    public void onEnable() {
        instance = this;

        lunarAPI = (LunarClientAPI) getServer().getPluginManager().getPlugin("LunarClient-API");
        LibraryPlugin = (LibraryPlugin) getServer().getPluginManager().getPlugin("Library");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

}
