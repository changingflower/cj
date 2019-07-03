package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.logging.Logger;
import java.util.regex.*;
public class j_00_03_basic_good_1001 {
    Logger logger = Logger.getLogger("lavasoft");
    boolean loginSuccessful = false;
    public void test(String username, boolean loginSuccessful) {
        username = sanitizeUser(username);
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }

    public void test2(String username, boolean loginSuccessful) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}