package com.xlccc.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) {
        Mail mail = new Mail() ;
        mail .setContent("初始化模板");

        for (int i = 0 ; i < 10 ; i++){
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@imooc.com");
            mail.setContent("恭喜中奖");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
