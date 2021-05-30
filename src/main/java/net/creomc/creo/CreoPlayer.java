package net.creomc.creo;

import net.minestom.server.entity.GameMode;
import net.minestom.server.entity.Player;
import net.minestom.server.entity.PlayerSkin;
import net.minestom.server.event.player.PlayerLoginEvent;
import net.minestom.server.event.player.PlayerSkinInitEvent;
import net.minestom.server.instance.Instance;
import net.minestom.server.utils.Position;

public record CreoPlayer(Instance spawningInstance) {
    public void handleLogin(PlayerLoginEvent event) {
        event.setSpawningInstance(spawningInstance);

        Player player = event.getPlayer();
        player.setRespawnPoint(new Position(0, 4, 0));
        player.setGameMode(GameMode.CREATIVE);
        player.setAllowFlying(true);
    }

    public void handleSkinInit(PlayerSkinInitEvent event) {
        Player player = event.getPlayer();
        PlayerSkin skin = PlayerSkin.fromUsername(player.getUsername());
        event.setSkin(skin);
    }
}
