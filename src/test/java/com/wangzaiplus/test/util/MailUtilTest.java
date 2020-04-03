package com.wangzaiplus.test.util;

import com.wangzaiplus.test.pojo.Mail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailUtilTest {
    @Autowired
    private JavaMailSender mailSender;
    @Test
    public void send() {
        Mail mail = new Mail();
        mail.setTo("dundunerzn@163.com");
        mail.setTitle("biaoti");
        mail.setContent("正文");
        mail.setMsgId("007");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("253013263@qq.com");
        message.setTo("dundunerzn@163.com");
        message.setSubject("title");
        message.setText("正文");

        mailSender.send(message);
    }

    @Test
    public void sendAttachment() {
    }

}