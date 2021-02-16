package video.api.client;

import video.api.client.api.*;
import okhttp3.OkHttpClient;

public class ApiVideoClient {
    private final ApiClient apiClient;

    private final AccountApi account;
    private final CaptionsApi captions;
    private final ChaptersApi chapters;
    private final LiveApi live;
    private final PlayersApi players;
    private final RawStatisticsApi rawStatistics;
    private final VideosApi videos;
    private final VideosDelegatedUploadApi videosDelegatedUpload;
    private final WebhooksApi webhooks;

    public enum Environment {
        PRODUCTION("https://ws.api.video/"), SANDBOX("https://sandbox.api.video/");

        private final String basePath;

        Environment(String basePath) {
            this.basePath = basePath;
        }
    }

    /**
     * Build an instance that targets production environment without authentication
     */
    public ApiVideoClient() {
        this(Environment.PRODUCTION);
    }

    /**
     * Build an instance that targets the given environment without authentication
     * 
     * @param environment
     *            the target environment
     */
    public ApiVideoClient(Environment environment) {
        this(new ApiClient(environment.basePath));
    }

    /**
     * Build an instance that targets the production environment with authentication
     * 
     * @param apiKey
     *            the api key to use to authenticate
     */
    public ApiVideoClient(String apiKey) {
        this(apiKey, Environment.PRODUCTION);
    }

    /**
     * Build an instance that targets the given environment with authentication
     * 
     * @param apiKey
     *            the api key to use to authenticate
     * @param environment
     *            the target environment
     */
    public ApiVideoClient(String apiKey, Environment environment) {
        this(new ApiClient(apiKey, environment.basePath));
    }

    /**
     * Build an instance that targets the production environment using a custom OkHttp client
     * 
     * @param client
     *            the OkHttpClient instance to use
     */
    public ApiVideoClient(OkHttpClient client) {
        this(new ApiClient(client, Environment.PRODUCTION.basePath));
    }

    /**
     * Build an instance that targets the production environment using a custom OkHttp client
     * 
     * @param client
     *            the OkHttpClient instance to use
     * @param environment
     *            the target environment
     */
    public ApiVideoClient(OkHttpClient client, Environment environment) {
        this(new ApiClient(client, environment.basePath));
    }

    private ApiVideoClient(ApiClient apiClient) {
        this.apiClient = apiClient;

        this.account = new AccountApi(this.apiClient);
        this.captions = new CaptionsApi(this.apiClient);
        this.chapters = new ChaptersApi(this.apiClient);
        this.live = new LiveApi(this.apiClient);
        this.players = new PlayersApi(this.apiClient);
        this.rawStatistics = new RawStatisticsApi(this.apiClient);
        this.videos = new VideosApi(this.apiClient);
        this.videosDelegatedUpload = new VideosDelegatedUploadApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

    /**
     * Get an AccountApi instance
     * 
     * @return AccountApi
     */
    public AccountApi account() {
        return this.account;
    }

    /**
     * Get an CaptionsApi instance
     * 
     * @return CaptionsApi
     */
    public CaptionsApi captions() {
        return this.captions;
    }

    /**
     * Get an ChaptersApi instance
     * 
     * @return ChaptersApi
     */
    public ChaptersApi chapters() {
        return this.chapters;
    }

    /**
     * Get an LiveApi instance
     * 
     * @return LiveApi
     */
    public LiveApi live() {
        return this.live;
    }

    /**
     * Get an PlayersApi instance
     * 
     * @return PlayersApi
     */
    public PlayersApi players() {
        return this.players;
    }

    /**
     * Get an RawStatisticsApi instance
     * 
     * @return RawStatisticsApi
     */
    public RawStatisticsApi rawStatistics() {
        return this.rawStatistics;
    }

    /**
     * Get an VideosApi instance
     * 
     * @return VideosApi
     */
    public VideosApi videos() {
        return this.videos;
    }

    /**
     * Get an VideosDelegatedUploadApi instance
     * 
     * @return VideosDelegatedUploadApi
     */
    public VideosDelegatedUploadApi videosDelegatedUpload() {
        return this.videosDelegatedUpload;
    }

    /**
     * Get an WebhooksApi instance
     * 
     * @return WebhooksApi
     */
    public WebhooksApi webhooks() {
        return this.webhooks;
    }

    public ApiClient getHttpClient() {
        return this.apiClient;
    }

    public long getUploadChunkSize() {
        return this.apiClient.getUploadChunkSize();
    }

    public void setUploadChunkSize(long uploadChunkSize) {
        this.apiClient.setUploadChunkSize(uploadChunkSize);
    }
}
