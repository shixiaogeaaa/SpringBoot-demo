package com.repair.utils;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by SuperJJ on 2020/6/2 20:01
 * 订单图片上传工具类
 */
public class OrderUploadUtils {

    private static String dir = ConstantUtils.Path.DIRPATH;

    public static Map<String,String> upLoadOrderImage(MultipartFile file) {
        Map<String,String> resultMap = new HashMap<String, String>();
        if (file.isEmpty()) {
            resultMap.put("failure","传入的文件为空");
            return resultMap;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = simpleDateFormat.format(new Date());

        String fileName = file.getOriginalFilename();
        String realPath = dir + "/" +currentDate +"/";
        File fileDir = new File(realPath);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }

        String extName = FilenameUtils.getExtension(fileName);
        String allowImgFormat = "gif,jog,jpge,png";

        if (!allowImgFormat.contains(extName.toLowerCase())) {
            resultMap.put("failure","不支持该类型文件上传");
            return resultMap;
        }

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd&&HH-mm-ss");
        String currentTime = simpleDateFormat1.format(new Date());
        fileName = currentTime + UUID.randomUUID() + ".jpg";
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = file.getInputStream();
            fileOutputStream = new FileOutputStream(realPath + fileName);
            IOUtils.copy(inputStream,fileOutputStream);

        } catch (IOException e) {
            resultMap.put("failure" ,"图片存储失败");
            e.printStackTrace();
            return resultMap;
        } finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(fileOutputStream);
        }
        resultMap.put("success","/" + currentDate + "/" +fileName);
        return resultMap;
    }


}
