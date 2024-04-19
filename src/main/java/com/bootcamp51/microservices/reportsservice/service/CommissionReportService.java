package com.bootcamp51.microservices.reportsservice.service;

import com.bootcamp51.microservices.reportsservice.model.Commission;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CommissionReportService {

  Flux<List<Commission>> findGroupByProduct();
}
