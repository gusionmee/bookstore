package com.bansach.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "payments", schema = "bookstore")
public class PaymentsEntity extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id")
    private int paymentId;
    @Basic
    @Column(name = "customer_id")
    private int customerId;
    @Basic
    @Column(name = "payment_date")
    private Date paymentDate;
    @Basic
    @Column(name = "payment_amount")
    private String paymentAmount;

}
