package video.api.client;

import video.api.client.api.*;
import video.api.client.api.clients.*;
import video.api.client.api.models.Environment;
import okhttp3.OkHttpClient;

public class ApiVideoClient {
    private final ApiClient apiClient;

    private final CaptionsApi captions;
    private final ChaptersApi chapters;
    private final LiveStreamsApi liveStreams;
    private final PlayerThemesApi playerThemes;
    private final RawStatisticsApi rawStatistics;
    private final UploadTokensApi uploadTokens;
    private final VideosApi videos;
    private final WatermarksApi watermarks;
    private final WebhooksApi webhooks;

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

    public ApiVideoClient(ApiClient apiClient) {
        this.apiClient = apiClient;

        this.captions = new CaptionsApi(this.apiClient);
        this.chapters = new ChaptersApi(this.apiClient);
        this.liveStreams = new LiveStreamsApi(this.apiClient);
        this.playerThemes = new PlayerThemesApi(this.apiClient);
        this.rawStatistics = new RawStatisticsApi(this.apiClient);
        this.uploadTokens = new UploadTokensApi(this.apiClient);
        this.videos = new VideosApi(this.apiClient);
        this.watermarks = new WatermarksApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
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
     * Get an LiveStreamsApi instance
     * 
     * @return LiveStreamsApi
     */
    public LiveStreamsApi liveStreams() {
        return this.liveStreams;
    }

    /**
     * Get an PlayerThemesApi instance
     * 
     * @return PlayerThemesApi
     */
    public PlayerThemesApi playerThemes() {
        return this.playerThemes;
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
     * Get an UploadTokensApi instance
     * 
     * @return UploadTokensApi
     */
    public UploadTokensApi uploadTokens() {
        return this.uploadTokens;
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
     * Get an WatermarksApi instance
     * 
     * @return WatermarksApi
     */
    public WatermarksApi watermarks() {
        return this.watermarks;
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

    public void setApplicationName(String applicationName) {
        this.apiClient.setApplicationName(applicationName);
    }
}
