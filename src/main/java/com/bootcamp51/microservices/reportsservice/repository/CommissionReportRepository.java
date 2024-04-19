package com.bootcamp51.microservices.reportsservice.repository;

import com.bootcamp51.microservices.reportsservice.model.Commission;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CommissionReportRepository extends ReactiveMongoRepository<Commission, String> {
  @Aggregation(pipeline = {
      "{$group: {  _id: '$indProduct', indProduct: { $first: '$indProduct' }, desProduct: { $first: '$desProduct' }, commission: {$sum: {$toDouble: '$commission'}} }}",
      "{$project: {_id: 0, indProduct: 1, desProduct: 1, commission:  {$toString: '$commission' } }}"
  })
  Flux<List<Commission>> findGroupByProduct();



}
