package net.choco.playerhead.command;

import me.mattstudios.mf.annotations.Command;
import me.mattstudios.mf.annotations.Default;
import me.mattstudios.mf.base.CommandBase;
import net.choco.playerhead.utility.compatbridge.model.CompMaterial;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

@Command("head")
public class PlayerHeadCommand extends CommandBase {

    @Default
    public void headCommand(CommandSender commandSender) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            getPlayerHead(player);
        }
    }

    public void getPlayerHead(Player player) {
        ItemStack itemStack = new ItemStack(CompMaterial.PLAYER_HEAD.getMaterial(), 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwner(player.getName());
        itemStack.setItemMeta(skullMeta);
        player.getInventory().addItem(itemStack);
        }
}
