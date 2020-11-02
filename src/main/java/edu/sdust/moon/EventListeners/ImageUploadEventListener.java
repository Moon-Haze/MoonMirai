package edu.sdust.moon.EventListeners;

import edu.sdust.moon.Enum.AffairsEventType;
import edu.sdust.moon.Event.ImageUploadEvent;

public class ImageUploadEventListener extends EventListener {


    /**
     * [机器人]图片上传前. 可以阻止上传（事件）
     *
     * @param event
     
     */
    
    public void BeforeImageUploadEvent(ImageUploadEvent event) {
        
    }

    /**
     * [机器人]图片上传成功（事件）
     *
     * @param event
     
     */
    
    public void ImageUploadSucceedEvent(ImageUploadEvent event) {
        
    }

    /**
     * [机器人]图片上传失败（事件）
     *
     * @param event
     
     */
    
    public void ImageUploadFailedEvent(ImageUploadEvent event) {
        
    }

    @Override
    public Class getType() {
        return AffairsEventType.class;
    }
}