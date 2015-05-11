package com.zamaruev.advert.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by vzamaruiev on 11.05.2015.
 */
@Table
@Entity
public class AdItem {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private BigDecimal price;

    private String description;

    private AdItemStatus status;
}
