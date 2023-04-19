package video.api.client.api.upload;

import video.api.client.api.ApiException;
import video.api.client.api.models.Video;

import java.io.File;

public interface IProgressiveUploadSession {
    public String getVideoId();

    public String getToken();

    public Video uploadPart(File part) throws ApiException;

    public Video uploadLastPart(File part) throws ApiException;

    public Video uploadPart(File part, UploadPartProgressListener uploadProgressListener) throws ApiException;

    public Video uploadLastPart(File part, UploadPartProgressListener uploadProgressListener) throws ApiException;

    public Video uploadPart(File part, boolean isLastPart, UploadPartProgressListener uploadProgressListener)
            throws ApiException;

    public Video uploadPart(File part, Integer partId, UploadPartProgressListener uploadProgressListener)
            throws ApiException;

    public Video uploadLastPart(File part, Integer partId, UploadPartProgressListener uploadProgressListener)
            throws ApiException;

    public Video uploadPart(File part, Integer partId, boolean isLastPart,
            UploadPartProgressListener uploadProgressListener) throws ApiException;
}