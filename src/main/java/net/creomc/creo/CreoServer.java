package net.creomc.creo;

import net.minestom.server.MinecraftServer;
import net.minestom.server.entity.Player;
import net.minestom.server.event.player.PlayerDisconnectEvent;
import net.minestom.server.event.player.PlayerLoginEvent;
import net.minestom.server.event.player.PlayerSkinInitEvent;
import net.minestom.server.instance.Instance;
import net.minestom.server.instance.InstanceManager;
import net.minestom.server.network.ConnectionManager;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CreoServer {
    private static MinecraftServer server;
    private static Instance spawningInstance;

    private static final Map<UUID, CreoPlayer> players = new HashMap<>();

    public static void init() {
        server = MinecraftServer.init();
        MinecraftServer.setBrandName("Creo/Minestom");
        MinecraftServer.setChunkViewDistance(32);

        ConnectionManager connectionManager = MinecraftServer.getConnectionManager();
        connectionManager.addPlayerInitialization(CreoServer::handlePlayerInitialization);

        InstanceManager instanceManager = MinecraftServer.getInstanceManager();
        spawningInstance = instanceManager.createInstanceContainer();
        spawningInstance.setChunkGenerator(new CreoGenerator());
    }

    public static void start(String address, int port) {
        server.start(address, port);
    }

    public static CreoPlayer getPlayer(UUID uuid) {
        return players.get(uuid);
    }

    public static CreoPlayer getPlayer(Player player) {
        return getPlayer(player.getUuid());
    }

    private static void handlePlayerInitialization(Player player) {
        CreoPlayer creoPlayer = new CreoPlayer(spawningInstance);
        player.addEventCallback(PlayerLoginEvent.class, creoPlayer::handleLogin);
        player.addEventCallback(PlayerSkinInitEvent.class, creoPlayer::handleSkinInit);
        player.addEventCallback(PlayerDisconnectEvent.class, event -> players.remove(player.getUuid()));

        players.put(player.getUuid(), creoPlayer);
    }
}
