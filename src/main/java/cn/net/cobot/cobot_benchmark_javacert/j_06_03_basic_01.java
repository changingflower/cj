package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

public class j_06_03_basic_01 {
    public void readSensitiveFile() {
        try {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) { // Check for permission to read file
                sm.checkRead("/temp/tempFile");//not compliant
            }
            // Access the file
        } catch (SecurityException se) {
            // Log exception
        }
    }
}
