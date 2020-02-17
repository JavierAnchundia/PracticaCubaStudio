package com.company.untitled.entity;


import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;


//Java 13 trabaja como NOde.js, es decir de forma modular debo ir descargando lo vaya neceistando
//Java 8 en cambio viene.toodo  en uno solo
@NamePattern("%s |description")
@Table(name = "UNTITLED_SESSION")
@Entity(name = "untitled_Session")
public class Session extends StandardEntity {
    private static final long serialVersionUID = 7241450837226886087L;

    @NotNull
    @Column(name = "TOPIC", nullable=false)
    protected String topic;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "START_DATE", nullable=false)
    protected Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_DATE", nullable=false)
    protected Date endDate;

    //El lookup es la forma en la que se va desplegar la informacion en la vista, es decir por ejemplo con un combobox
    // al utilizar la opcion DROPDOWN o la opcion SCREEN que mostrara un Grid con todos los valores posibles de la Entidad
    @Lookup(type= LookupType.DROPDOWN,actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name= "SPEAKER_ID")
    protected Speaker speaker;

    @Column (name= "DESCRIPTION", length = 2000)
    protected String description;


    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}
    public Speaker getSpeaker(){return speaker;}
    public void setSpeaker(Speaker speaker){this.speaker = speaker;}
    public Date getEndDate(){return endDate;}
    public void setEndDate(Date endDate){this.endDate = endDate;}
    public Date getStartDate(){return startDate;}
    public void setStartDate(Date startDate) {this.startDate=startDate;}
    public String getTopic(){return topic;}
    public void setTopic(String topic){this.topic =  topic;}


    @PrePersist
    @PreUpdate
    public void updateEndDate(){
        endDate= calculateEndDate(startDate);

    }

    public static Date calculateEndDate(Date startDate){
        return Date.from(startDate.toInstant().plus(1, ChronoUnit.HOURS ));
    }
}