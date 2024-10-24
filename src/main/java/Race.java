public class Race {
    String currentLeader = ""; // Текущий лидер гонки
    int leaderDistant = 0;     // Дистанция, пройденная текущим лидером

    public void determineNewLeader(Car car) {
        int timeRace = 24;
        int newDistance = timeRace * car.speed;

        if (newDistance > leaderDistant) {
            currentLeader = car.name;
            leaderDistant = newDistance;
        }
    }
    public String getCurrentLeader() {
        return currentLeader;
   }
}