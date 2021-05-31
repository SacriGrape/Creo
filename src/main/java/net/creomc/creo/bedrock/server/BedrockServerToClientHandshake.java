package net.creomc.creo.bedrock.server;

import net.creomc.creo.bedrock.BedrockPacket;

public class BedrockServerToClientHandshake extends BedrockPacket {

    private String jwt;

    @Override
    public int getPacketId() {
        return 0x03;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
