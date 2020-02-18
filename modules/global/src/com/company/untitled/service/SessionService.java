package com.company.untitled.service;

import com.company.untitled.entity.Session;

import java.util.Date;

public interface SessionService {
    String NAME = "untitled_SessionService";

    boolean rescheduleSession(Session session, Date startDate);
}