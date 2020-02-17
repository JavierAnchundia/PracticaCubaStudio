package com.company.untitled.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Session;

@UiController("untitled_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}