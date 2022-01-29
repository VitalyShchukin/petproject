package com.mypetproject.petproject.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "record_title")
    private String recordTitle;

    @Column
    private String record;

//    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//
//    private Set<Tag> tags;

    public Record() {
    }

    public Record(String recordTitle, String record) {
        this.recordTitle = recordTitle;
        this.record = record;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

//    public Set<Tag> getTags() {
//        return tags;
//    }
//
//    public void setTags(Set<Tag> tags) {
//        this.tags = tags;
//    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", recordTitle='" + recordTitle + '\'' +
                ", record='" + record + '\'' +
//                ", tags=" + tags +
                '}';
    }
}
