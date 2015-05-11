package com.zamaruev.advert.core.dao;

import com.zamaruev.advert.core.entities.AdItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vzamaruiev on 11.05.2015.
 */
public interface AdItemDao extends CrudRepository<AdItem, Long> {
}
