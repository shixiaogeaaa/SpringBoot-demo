package com.repair.config;

import com.repair.utils.ConstantUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

/**
 * 定时任务类
 */
@Component
public class SchedulerTask {

    /**
     * 每天凌晨3点删除生成的QRCode文件
     */
    @Scheduled(cron = "0 0 3 * * ?")
    private void deleteQRCodeFile(){
        File file = new File(ConstantUtils.Path.DIRPATH+ ConstantUtils.Path.QRCODEPATH);
        if (file.exists()){
            try {
                FileUtils.cleanDirectory(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


