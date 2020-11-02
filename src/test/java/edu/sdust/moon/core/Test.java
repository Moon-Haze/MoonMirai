package edu.sdust.moon.core;

import edu.sdust.moon.Core.MiraiStart;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Objects;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main (String[] args) {
        String s="/audio 哈哈哈 哈哈哈 /audio ";
        Matcher m = Pattern.compile ("\\A/\\w++ ").matcher (s);
        if (m.find()){
            String str=m.replaceAll("");
            System.err.println(str);
        } else {
            System.err.println("CCCC");
        }
    }
    public static boolean init (String path) {
        boolean is = true;
        File file = new File (path + "Plugins");
        if (file.exists ()) {
            System.err.println ("if --->e");
            System.err.println (file.getName ());
            if (Objects.requireNonNull (file.listFiles ()).length == 0) {
                is = false;
                System.err.println (file.getAbsolutePath ());
                System.err.println ("is-->  "+is);
            } else {
                System.err.println ("else");
                for (File f : Objects.requireNonNull (file.listFiles ())) {
//                    QQPlugin QP = new QQPlugin ();
                    if (f.getName ().endsWith (".jar")) {
                        System.err.println (f.getName ());
                        try {
                            loadJar (f);
                        } catch (IOException e) {
                            e.printStackTrace ();
                        }
                    }
                }
            }
        } else {
            file.mkdirs ();
            is = false;
        }
        return is;
    }


    public static void loadJar (File file) throws IOException {
        if (file == null) {
            return;
        }
        System.err.println (file.getAbsolutePath ());
        URL[] urls={file.toURI ().toURL ()};
        URLClassLoader urlClassLoader=new URLClassLoader (urls);
        JarFile jarFile=new JarFile (file);
        Enumeration<JarEntry> jarEntryEnumeration = jarFile.entries ();
        while (jarEntryEnumeration.hasMoreElements ()) {
            System.err.println ("sss");
            JarEntry entry = jarEntryEnumeration.nextElement ();
            String jarEntryName = entry.getName ();
            System.err.println (jarEntryName);
            if (jarEntryName.endsWith (".class")) {
                System.err.println ("class");
                String className = jarEntryName.substring (0, jarEntryName.lastIndexOf (".")).replace ("/", ".");
                System.err.println (className);
                try {
                    Class cls = urlClassLoader.loadClass (className);
                    System.err.println (cls.getName ());
                    System.err.println ("Over!!!");
//                    addClass (cls);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace ();
                    System.err.println ("The app has happen a error!!!");
                }
            }
        }
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
}
