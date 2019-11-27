package lab1;

public class HomeworkLab1 {

    public static void main(String[] args) {
        String topChannelName = "topChannel";
        int topChannelSubCount = 100_000_000;
        String secondTopChannelName = "secondTopChannel";
        int secondTopChannelSubCount = 90_000_000;
        long worldPopulation = 7_700_000_000L;

        int subGap = topChannelSubCount - secondTopChannelSubCount;
        double topChannelSubsWorldPercentage = (double) topChannelSubCount / worldPopulation;
        long nonSubscribers = worldPopulation - topChannelSubCount;

        System.out.println(topChannelName + " ma: " + topChannelSubCount + " subów");
        System.out.println(secondTopChannelName + " ma: " + secondTopChannelSubCount + " subów");
        System.out.println("Różnica między dwoma kanałami: " + subGap);
        System.out.println("Ilość ludzi na świecie: " + worldPopulation);
        System.out.println("Odsetek ludzi subskrybujących najbardziej popularny kanał: " + topChannelSubsWorldPercentage);
        System.out.println("Ludzie nic nie subskrybujący: " + nonSubscribers);
    }
}
