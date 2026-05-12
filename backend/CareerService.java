import java.util.*;

public class CareerService {

    public static List<String> getCareers(String skill) {

        if (skill.contains("java")) {
            return Arrays.asList("Software Developer", "Backend Engineer");
        }
        else if (skill.contains("data")) {
            return Arrays.asList("Data Analyst", "Data Scientist");
        }
        else if (skill.contains("design")) {
            return Arrays.asList("UI Designer", "UX Designer");
        }
        else {
            return Arrays.asList("IT Support", "Beginner Developer");
        }
    }

    public static int getScore(String skill) {

        int score = 50;

        if (skill.contains("java")) score += 30;
        if (skill.contains("data")) score += 20;

        return Math.min(score, 100);
    }
}
