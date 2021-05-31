package net.creomc.creo.bedrock.client;

import net.creomc.creo.bedrock.BedrockPacket;

public class BedrockClientToServerHandshake extends BedrockPacket {



    @Override
    public int getPacketId() {
        return 0x04;
    }
}
