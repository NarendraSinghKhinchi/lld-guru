package proxy_pattern;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com");
        return getSomeVideo(videoId);
    }

    private int random(int min, int max){
        return min+ (int)(Math.random() * ((max-min)+1));
    }

    private void experienceNetworkLatency(){
        int randomLatency = random(5,10);
        for(int i= 0; i< randomLatency; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void connectToServer(String server){
        System.out.println("Connecting to " + server + "...");
        experienceNetworkLatency();
        System.out.println("Connected!");
    }

    private HashMap<String, Video> getRandomVideos(){
        System.out.println("Downloading popular videos...");
        experienceNetworkLatency();
        HashMap<String, Video> videos = new HashMap<>();
        videos.put("catzzzzzzzzz", new Video("sadgahasgdas", "Cat video"));
        videos.put("mkafksangas", new Video("mkafksangas", "Dog video"));
        videos.put("dsgsdfgdfsg", new Video("dsgsdfgdfsg", "Another cat video"));

        System.out.println("Done!");
        return videos;
    }

    private Video getSomeVideo(String videoId){
        System.out.println("Downloading video...");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!");
        return video;
    }
}