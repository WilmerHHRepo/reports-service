package com.bootcamp51.microservices.reportsservice.controller;

import com.bootcamp51.microservices.reportsservice.model.Commission;
import com.bootcamp51.microservices.reportsservice.service.CommissionReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class ClientReportController {

  @Autowired
  private CommissionReportService commissionReportService;

  @GetMapping("/by-TypeProduct")
  public Flux<List<Commission>> reportCommissionByProduct(){
    return commissionReportService.findGroupByProduct();
  }




}
