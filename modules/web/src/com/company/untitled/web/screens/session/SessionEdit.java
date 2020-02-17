package com.company.untitled.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Session;

@UiController("untitled_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}