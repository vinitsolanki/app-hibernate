package com.myapp.hibernate.inheritance.singletable;

import javax.persistence.*;

@Entity
@Table(name = "change_request_history")
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ChangeRequestHistory {


    public enum OperationType {
        MOBILE, EMAIL
    };

    public enum OperationStatus {
        PENDING, COMPLETED
    };

    @Id
    @GeneratedValue
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 25, nullable = false, insertable = false, updatable = false)
    private OperationType operationType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 25)
    private OperationStatus status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }
}