package org.sx.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_ADDRESS_ID")
    @SequenceGenerator(name = "PK_SEQ_ADDRESS_ID", sequenceName = "PK_SEQ_ADDRESS_ID", allocationSize = 1, initialValue = 1)
    long id;

    @Column(name = "LINE_1")
    private String addressLineOne;

    @Column(name = "LINE_2")
    private String addressLineTwo;

    @Column(name = "CITY")
    private String city;

    @Column(name = "PIN_CODE")
    private String pinCode;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

}
