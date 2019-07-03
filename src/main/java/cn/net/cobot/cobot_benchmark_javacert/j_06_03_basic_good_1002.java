package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

public final class j_06_03_basic_good_1002 {
    public void readSensitiveFile() {
        try {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) { // Check for permission to read file
                sm.checkRead("/temp/tempFile");
            }
            // Access the file
        } catch (SecurityException se) {
            // Log exception
        }
    }
}
