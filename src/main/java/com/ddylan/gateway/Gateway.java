package com.ddylan.gateway;

import com.ddylan.xlib.Library;
import com.lunarclient.bukkitapi.LunarClientAPI;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class Gateway extends JavaPlugin {

    @Getter private static Gateway instance;

    private LunarClientAPI lunarAPI;
    private Library Library;

    @Override
    public void onEnable() {
        instance = this;

        lunarAPI = (LunarClientAPI) getServer().getPluginManager().getPlugin("LunarClient-API");
        Library = (Library) getServer().getPluginManager().getPlugin("xLib");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

}
