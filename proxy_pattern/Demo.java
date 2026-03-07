package proxy_pattern;

public class Demo{

    public static void main(String[] args){
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());


        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);

        System.out.println("Time spent with naive downloader: " + naive + "ms");
        System.out.println("Time spent with smart downloader: " + smart + "ms");
    }

    private static long test(YouTubeDownloader downloader){
        long startTime = System.currentTimeMillis();
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("mkafksangas");


        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms");
        return estimatedTime;
    }
}