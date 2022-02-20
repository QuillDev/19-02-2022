package moe.quill.deepslate;

import moe.quill.deepslate.commands.Dev
import moe.quill.pinion.commands.CommandProcessor
import moe.quill.pinion.core.extensions.registerEvents
import org.bukkit.plugin.java.JavaPlugin;

class Deepslate : JavaPlugin() {

    override fun onEnable() {
        super.onEnable()

        //Setup the command processor
        val processor = CommandProcessor(this)
        processor.registerCommand(Dev(this))

        registerEvents(GrappleHandler())
    }
}