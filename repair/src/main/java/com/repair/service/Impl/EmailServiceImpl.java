package com.repair.service.Impl;

import com.repair.service.EmailService;
import com.repair.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by SuperJJ on 2020/6/1 19:40
 */

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public String acceptOrderMail(String userName, String userEmail) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(ConstantUtils.Mail.FROM_MAIL);
        simpleMailMessage.setTo(userEmail);
        simpleMailMessage.setSubject("【正在维修中】感谢您的反馈");
        simpleMailMessage.setText("亲爱的"+userName+",您提交的报修工单设备管理员已派人维修中，维修成功后将以邮件方式通知您");
        simpleMailMessage.setSentDate(new Date());
        mailSender.send(simpleMailMessage);
        return "OK";
    }

    @Override
    public String completeOrderMail(String userName, String userEmail) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(ConstantUtils.Mail.FROM_MAIL);
        simpleMailMessage.setTo(userEmail);
        simpleMailMessage.setSubject("【维修完成】感觉您反馈的设备报修问题已完成");
        simpleMailMessage.setSentDate(new Date());
        mailSender.send(simpleMailMessage);
        return "OK";
    }
}
