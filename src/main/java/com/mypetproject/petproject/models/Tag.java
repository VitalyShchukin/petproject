package com.mypetproject.petproject.models;

import javax.persistence.*;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tag;

    @Column(name = "record_id")
    private Long recordId;

//    @ManyToOne
//    @JoinColumn (name = "")
//

    public Tag() {
    }

    public Tag(Long idTag, String textTag, Long idRecord) {
        this.id = id;
        this.tag = tag;
        this.recordId = recordId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", recordId=" + recordId +
                '}';
    }
}
