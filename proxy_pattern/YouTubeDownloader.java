package proxy_pattern;

import java.util.HashMap;

public class YouTubeDownloader{
    private ThirdPartyYouTubeLib api;
    
    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId){
        Video video = api.getVideo(videoId);
        System.out.println("\n------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Data: " + video.data);
        System.out.println("------------------------------\n");
    }

    public void renderPopularVideos(){
        HashMap<String, Video> videos = api.popularVideos();
        System.out.println("\n------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : videos.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("------------------------------\n");
    }
}