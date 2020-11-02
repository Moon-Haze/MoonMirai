package edu.sdust.moon.Config;

import com.alibaba.fastjson.JSON;
import edu.sdust.moon.Core.MiraiStart;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConfigRead {
    private static ConfigRead configRead = new ConfigRead ();
    private File ConfigFile;

    private ConfigRead () {
    }


    public static ConfigRead getInstance () {
        return configRead;
    }


    public boolean ReadStart (String local) {
        try {
            ConfigFile = new File (local + "/config/config.json");
            if (!ConfigFile.exists ()) {
                if (!ConfigFile.getParentFile ().exists ()) {
                    ConfigFile.getParentFile ().mkdirs ();
                }
                ConfigFile.createNewFile ();
                MiraiStart.setConfig (new ConfigObj ());
                Save ();
                return true;
            } else {
                var reader = new InputStreamReader (
                        new FileInputStream (ConfigFile), StandardCharsets.UTF_8);
                var bf = new BufferedReader (reader);
                StringBuilder stringBuilder = new StringBuilder ();
                String str = "";
                while ((str = bf.readLine ()) != null) {
                    stringBuilder.append (str);
                }
                MiraiStart.setConfig (JSON.parseObject (stringBuilder.toString (), ConfigObj.class));
                if (MiraiStart.getConfig ().getQQs () == null) {
                    MiraiStart.setConfig (new ConfigObj ());
                    Save ();
                }
                bf.close ();
                reader.close ();
            }
            for (var item : MiraiStart.getConfig ().getQQs ()) {
                MiraiStart.getLogger ().info ("QQ's id: " + item.getQQ ());
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return false;
    }

    public void Save () {
        try {
            var out = new FileOutputStream (ConfigFile);
            var write = new OutputStreamWriter (
                    out, StandardCharsets.UTF_8);
            write.write (JSON.toJSONString (MiraiStart.getConfig ()));
            write.close ();
            out.close ();
        } catch (Exception e) {
            MiraiStart.getLogger ().error ("Failed to save configuration file.", e);
            e.printStackTrace ();
        }
    }
}
