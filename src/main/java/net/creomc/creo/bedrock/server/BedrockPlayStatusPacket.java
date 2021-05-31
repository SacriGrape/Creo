package net.creomc.creo.bedrock.server;

import net.creomc.creo.bedrock.BedrockPacket;

public class BedrockPlayStatusPacket extends BedrockPacket {

    private int status;

    @Override
    public int getPacketId() {
        return 0x02;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
