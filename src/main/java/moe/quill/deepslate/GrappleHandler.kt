package moe.quill.deepslate

import org.bukkit.entity.FishHook.HookState
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerFishEvent

class GrappleHandler : Listener {

    @EventHandler
    fun onGrapple(event: PlayerFishEvent) {
        if (event.state != PlayerFishEvent.State.REEL_IN) return
        val player = event.player
        player.velocity = event.hook.location.subtract(player.eyeLocation)
            .toVector()
            .normalize()
            .multiply(2.5f)
    }
}