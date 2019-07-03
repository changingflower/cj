package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

public class j_06_03_basic_good_1001 {
    public final void readSensitiveFile1() {
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

    private void readSensitiveFile2() {
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
