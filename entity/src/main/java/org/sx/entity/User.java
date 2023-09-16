package org.sx.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_USERS_ID")
    @SequenceGenerator(name = "PK_SEQ_USERS_ID", sequenceName = "PK_SEQ_USERS_ID", allocationSize = 1, initialValue = 1)
    @Column(name = "USER_NAME")
    private String userName;

    @OneToMany(mappedBy="user")
    private List<Address> addressList;

}
