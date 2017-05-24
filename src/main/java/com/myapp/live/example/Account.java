package com.myapp.live.example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accounts", schema = "public")
@SequenceGenerator(name = "seq_account", sequenceName = "seq_account", initialValue = 1, allocationSize = 1)
public class Account extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_account")
    @Column(name = "accountid")
    private Long accountId;


}