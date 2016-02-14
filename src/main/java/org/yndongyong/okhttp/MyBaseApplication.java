package org.yndongyong.okhttp;

import android.app.Application;

import org.yndongyong.okhttp.download.DownLoadManager;
import org.yndongyong.okhttp.download.DownloadService;
import org.yndongyong.okhttp.upload.UploadManager;
import org.yndongyong.okhttp.upload.UploadService;

/**
 * Created by Dong on 2015/12/31.
 */
public class MyBaseApplication  extends Application{
    
    private static MyBaseApplication ourInstance;
    
    
    private static UploadManager sUploadManager;
    
    private static DownLoadManager sDownLoadManager;
    
    public static DownLoadManager getDownLoadManager(){
        return sDownLoadManager;}

    public static UploadManager getUploadManager() {
        return sUploadManager;
    }

    public static MyBaseApplication getInstance() {
        return ourInstance;
    }

    public MyBaseApplication() {
        
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ourInstance = this;
        sUploadManager = UploadService.getUploadManager(this);
        sDownLoadManager = DownloadService.getDownLoadManager(this);
    }
}
