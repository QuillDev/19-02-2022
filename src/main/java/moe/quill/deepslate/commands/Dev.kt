package moe.quill.deepslate.commands

import moe.quill.pinion.commands.annotations.Command
import moe.quill.pinion.commands.annotations.CommandGroup
import moe.quill.pinion.core.extensions.text
import moe.quill.pinion.core.items.itemBuilder
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin

@CommandGroup("dev")
class Dev(
    private val plugin: Plugin
) {

    @Command("test")
    fun test(sender: CommandSender) {
        if (sender !is Player) return

        val testWeapon = itemBuilder(Material.BLAZE_ROD) {
            name { text("Super Cool Weapon") { color { NamedTextColor.RED } } }
        }
        sender.inventory.addItem(testWeapon)
    }

}