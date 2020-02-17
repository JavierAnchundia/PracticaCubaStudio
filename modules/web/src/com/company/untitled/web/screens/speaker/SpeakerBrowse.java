package com.company.untitled.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.entity.Speaker;

@UiController("untitled_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}