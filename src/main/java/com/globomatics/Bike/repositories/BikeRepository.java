package com.globomatics.Bike.repositories;

import com.globomatics.Bike.models.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike, Long> {

}
