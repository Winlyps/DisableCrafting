package winlyps.disableCrafting

import org.bukkit.plugin.java.JavaPlugin

class DisableCrafting : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(CraftingListener(), this)
        logger.info("DisableCrafting plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("DisableCrafting plugin has been disabled.")
    }
}