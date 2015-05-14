package com.zamaruev.advert.core.dao;

import com.zamaruev.advert.core.entities.AdItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Spring Data Repository
 */
public interface AdItemDao extends CrudRepository<AdItem, Long> {
}
