alter table UNTITLED_SESSION add constraint FK_UNTITLED_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references UNTITLED_SPEAKER(ID);
create index IDX_UNTITLED_SESSION_ON_SPEAKER on UNTITLED_SESSION (SPEAKER_ID);
