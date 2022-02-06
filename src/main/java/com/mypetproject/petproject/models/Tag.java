package com.mypetproject.petproject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tag_body")
    private String tagBody;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "record_id")
    private Record record;

    public Tag(String tagBody, Record record) {
        this.tagBody = tagBody;
        this.record = record;
    }
}
