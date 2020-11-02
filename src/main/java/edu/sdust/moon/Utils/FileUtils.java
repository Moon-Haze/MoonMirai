package edu.sdust.moon.Utils;

import edu.sdust.moon.Core.MiraiStart;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils {

    private FileUtils () {
    }

    public static HashMap<String, File> getUsefulFiles (File[] files) {
        HashMap<String, File> map = new HashMap<> ();
        HashMap<String, ArrayList<File>> maplist = new HashMap<> ();
        for (File file : files) {
            String str = file.getName ();
            if (str.endsWith (".jar")) {
                Matcher m = Pattern.compile ("\\w++").matcher (str);
                if (m.find ()) {
                    str = str.replaceAll ("-\\d.*\\d-\\w*.jar", "");
                    str = str.replaceAll ("-\\d.*\\d.jar", "");
                    str = str.replaceAll ("-\\d++.jar", "");
                    String name = str.replaceAll (" ", "");
                    if (maplist.containsKey (name)) {
                        maplist.get (name).add (file);
                    } else {
                        ArrayList<File> fs = new ArrayList<> ();
                        fs.add (file);
                        maplist.put (name, fs);
                    }
                } else {
                    MiraiStart.getLogger ().error ("File " + str + "'s name error!!!");
                }
            }
        }
        for (String name : maplist.keySet ()) {
            ArrayList<File> fileArrayList = maplist.get (name);
            if (fileArrayList.size () == 1) {
                map.put (name, fileArrayList.get (0));
            } else {
                File f = fileArrayList.get (0);
                Long num = 0l;
                for (var item : fileArrayList) {
                    String str = item.getName ();
                    Matcher m = Pattern.compile ("\\d++").matcher (str);
                    StringBuilder sb = new StringBuilder ("0");
                    while (m.find ()) {
                        sb.append (m.group ());
                    }
                    long i = Long.parseLong (sb.toString ());
                    if (i >= num) {
                        num = i;
                        f = item;
                    }
                }
                map.put (name, f);
            }
        }
        return map;
    }


    public static URL[] FilesToURLs (File[] files) {
        ArrayList<URL> UrlList=new ArrayList<> ();
        for (File file : files) {
            try {
                UrlList.add (file.toURI ().toURL ());
            } catch (MalformedURLException e) {
                e.printStackTrace ();
            }
        }
        return UrlList.toArray (new URL[0]);
    }
}
