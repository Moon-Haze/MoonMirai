package edu.sdust.moon.Response;

import edu.sdust.moon.Core.MiraiStart;

import java.io.File;
import java.util.Base64;

public abstract class Response {
    protected static final Base64.Decoder decoder = Base64.getDecoder();
    protected static final File voice = new File(MiraiStart.getRunDir() +"\\voice");

    {
        if (!voice.exists()){
            voice.mkdirs();
        }
    }
}
