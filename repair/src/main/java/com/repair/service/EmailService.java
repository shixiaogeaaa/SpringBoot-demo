package com.repair.service;

/**
 * Created by SuperJJ on 2020/6/1 19:38
 */
public interface EmailService {

    String acceptOrderMail(String userName, String userEmail);

    String completeOrderMail(String userName, String userEmail);
}
