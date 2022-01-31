package com.mypetproject.petproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "record_title")
    private String recordTitle;

    @Column(name = "record_body")
    private String recordBody;

    @OneToMany (fetch = FetchType.EAGER, mappedBy = "record")
    private List<Tag> tag;

    public Record(String recordTitle, String recordBody) {
        this.recordTitle = recordTitle;
        this.recordBody = recordBody;
    }

}
