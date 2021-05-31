package net.creomc.creo.bedrock.client;

import net.creomc.creo.bedrock.BedrockPacket;
import org.json.JSONObject;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

public class BedrockLoginPacket extends BedrockPacket {
    private String username;
    private int protocol;
    private UUID clientUuid;
    private int clientId;
    @Nullable private String xuid;
    private String identityPublicKey;
    private String serverAddress;
    private String locale;

    private JSONObject chainData;
    private String clientDataJwt;
    private Map<String, Object> clientData;

    @Override
    public int getPacketId() {
        return 0x01;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public UUID getClientUuid() {
        return clientUuid;
    }

    public void setClientUuid(UUID clientUuid) {
        this.clientUuid = clientUuid;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public @Nullable String getXuid() {
        return xuid;
    }

    public void setXuid(@Nullable String xuid) {
        this.xuid = xuid;
    }

    public String getIdentityPublicKey() {
        return identityPublicKey;
    }

    public void setIdentityPublicKey(String identityPublicKey) {
        this.identityPublicKey = identityPublicKey;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public JSONObject getChainData() {
        return chainData;
    }

    public void setChainData(JSONObject chainData) {
        this.chainData = chainData;
    }

    public String getClientDataJwt() {
        return clientDataJwt;
    }

    public void setClientDataJwt(String clientDataJwt) {
        this.clientDataJwt = clientDataJwt;
    }

    public Map<String, Object> getClientData() {
        return clientData;
    }

    public void setClientData(Map<String, Object> clientData) {
        this.clientData = clientData;
    }
}
