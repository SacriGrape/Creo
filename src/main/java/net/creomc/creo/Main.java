package net.creomc.creo;

public class Main {
    public static void main(String[] args) {
        CreoServer.init();
        CreoServer.start("0.0.0.0", 25565);
    }
}
