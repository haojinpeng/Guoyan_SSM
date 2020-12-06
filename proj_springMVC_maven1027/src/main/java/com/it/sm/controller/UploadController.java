package com.it.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class UploadController {

    @RequestMapping("fileUpload")
    public String fileUpload(String picname, MultipartFile uploadFile, HttpServletRequest request){
        System.out.println("picname--"+picname);
        //定义文件名
        String fileName = "";
        //1.获取原始文件名
        String uploadFileName = uploadFile.getOriginalFilename();
        System.out.println("获取原始文件名 -->"+uploadFileName);
        //2.截取文件扩展名
        String extendName =
                uploadFileName.substring(uploadFileName.lastIndexOf(".")+1,
                        uploadFileName.length());
        //3.把文件加上随机数，防止文件重复
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        //4.判断是否输入了文件名
        if(!"".equals(picname) && picname!=null){
            fileName =  uuid+"_"+picname+"."+extendName;
        }else {
            fileName = uuid+"_"+uploadFileName;
        }
        System.out.println("fileName --->"+fileName );
        //5.获取文件路径
        ServletContext context = request.getSession().getServletContext();
        System.out.println("context--->"+context);
        String basePath = context.getRealPath("/uploads");
        //6.解决同一文件夹中文件过多问题
        String datePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        //7.判断路径是否存在
        File file = new File(basePath+"/"+datePath);
        if(!file.exists()) {
            file.mkdirs();
        }
        System.out.println("file-->"+file.getAbsolutePath());
        //8.使用 MulitpartFile 接口中方法，把上传的文件写到指定位置
        try {
            //  uploadFile.transferTo(new File(file,fileName));
            uploadFile.transferTo(new File("d:\\qq\\",fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
