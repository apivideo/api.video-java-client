package video.api.client.api.models;

public enum Environment {
    PRODUCTION("https://ws.api.video"), SANDBOX("https://sandbox.api.video");

    public final String basePath;

    Environment(String basePath) {
        this.basePath = basePath;
    }
}
