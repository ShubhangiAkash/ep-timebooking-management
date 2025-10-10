package com.timebooking.kafka.request;

import java.time.LocalDate;

public record EmployeeDetailsListener(
    String employeeId,
    String firstName,
    String lastName,
    String email,
    Long phoneNumber,
    int age,
    String address,
    LocalDate joiningDate,
    String departmentCode,
    String departmentName,
    boolean active) {}
