package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.servlet.http.HttpServletRequest;
public abstract class j_00_07_basic_03 {
//    public static HttpServletRequest req; //Could be override at any time. (tainted)

    public void badTransfer(HttpServletRequest req) throws IOException {
        String tainted = req.getParameter("zzz");
        Runtime.getRuntime().exec("/bin/sh -c some_tool" + tainted);        //not compliant
    }
}
