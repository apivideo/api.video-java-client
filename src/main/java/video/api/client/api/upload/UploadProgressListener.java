package video.api.client.api.upload;

public interface UploadProgressListener {
    void onProgress(Long bytesWritten, Long totalBytes, int chunkCount, int chunkNum);
}
