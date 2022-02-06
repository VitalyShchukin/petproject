package com.mypetproject.petproject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "record", orphanRemoval = true)
    private List<Tag> tags;

    public Record(String recordTitle, String recordBody) {
        this.recordTitle = recordTitle;
        this.recordBody = recordBody;
    }

}
