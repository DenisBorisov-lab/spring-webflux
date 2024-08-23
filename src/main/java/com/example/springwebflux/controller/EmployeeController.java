package com.example.springwebflux.controller;

import com.example.springwebflux.model.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @GetMapping("/{id}")
    public Mono<ResponseEntity<?>> getEmployee(@PathVariable Long id) {
        return Mono.just(ResponseEntity.ok().build());
    }

    @GetMapping("/list")
    public Flux<ResponseEntity<?>> getAllEmployees() {
        return Flux.just(ResponseEntity.ok().build());
    }

    @PostMapping("/update")
    public Mono<Integer> updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return Mono.just(1);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteEmployee(@PathVariable Long id) {
        return Mono.empty();
    }
}
