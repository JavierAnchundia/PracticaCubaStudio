-- begin UNTITLED_SPEAKER
create unique index IDX_UNTITLED_SPEAKER_UNIQ_EMAIL on UNTITLED_SPEAKER (EMAIL) ^
-- end UNTITLED_SPEAKER
-- begin UNTITLED_SESSION
alter table UNTITLED_SESSION add constraint FK_UNTITLED_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references UNTITLED_SPEAKER(ID)^
create index IDX_UNTITLED_SESSION_ON_SPEAKER on UNTITLED_SESSION (SPEAKER_ID)^
-- end UNTITLED_SESSION
