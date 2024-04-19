package com.bootcamp51.microservices.reportsservice.service.impl;

import com.bootcamp51.microservices.reportsservice.model.Commission;
import com.bootcamp51.microservices.reportsservice.repository.CommissionReportRepository;
import com.bootcamp51.microservices.reportsservice.service.CommissionReportService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;


@Builder
@Service
@AllArgsConstructor
public class CommissionReportServiceImpl implements CommissionReportService {

  private final CommissionReportRepository commissionReportRepository;

  @Override
  public Flux<List<Commission>> findGroupByProduct() {
    return commissionReportRepository.findGroupByProduct();
  }
}
