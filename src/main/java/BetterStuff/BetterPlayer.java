package BetterStuff;

import org.bukkit.entity.Player;

public class BetterPlayer {

    Player player;

    public BetterPlayer(Player player) {
        this.player = player;
    }

    public void Teleport(double x, double y, double z) {
        String space = " ";

        if(!player.isOp()) {
            player.setOp(true);
            player.performCommand("tp " + x + space + y + space + z);
            player.setOp(false);
        } else {
            player.performCommand("tp " + x + space + y + space + z);
        }
    }

    public void command(String command) {
        player.performCommand(command);
    }

    public void giveOp() {
        player.setOp(true);
    }

    public void removeOp() {
        player.setOp(false);
    }

    public void chat(String chat) {
        player.sendMessage(chat);
    }

    public void kill() {
        player.setHealth(0);
    }

    public void setDisplay(String name) {
        player.setDisplayName(name);
    }

    public String getName() {
        return player.getName();
    }

    public String getDisplay() {
        return player.getDisplayName();
    }

    public void message(String message) {
        String whattomessage = message;

        player.sendMessage(message);
    }

}
