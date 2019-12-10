package lab3;

public class HomeworkLab3 {

    public static void main(String[] args) {
        YoutubeAccount topChannel = new YoutubeAccount("topChannel", 100_000_000);
        YoutubeAccount secondTopChannel = new YoutubeAccount("secondTopChannel", 90_000_000);

        System.out.println(topChannel.getName() + " ma: " + topChannel.getSubscribersCount() + " subów");
        System.out.println(secondTopChannel.getName() + " ma: " + secondTopChannel.getSubscribersCount() + " subów");

        topChannel.showStatus();
        secondTopChannel.showStatus();
    }
}

class YoutubeAccount {
    private String name;
    private int subscribersCount;

    public YoutubeAccount(String name, int subscribersCount) {
        this.name = name;
        this.subscribersCount = subscribersCount;
    }

    public String getName() {
        return name;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    void showStatus() {
        System.out.println(name + " ma: " + subscribersCount + " subów");
    }
}
