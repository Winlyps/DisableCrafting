package winlyps.disableCrafting

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.CraftItemEvent

class CraftingListener : Listener {

    @EventHandler
    fun onCraftItem(event: CraftItemEvent) {
        // Cancel the crafting event to disable crafting
        event.isCancelled = true
    }
}