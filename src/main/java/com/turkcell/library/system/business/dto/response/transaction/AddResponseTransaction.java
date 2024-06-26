package com.turkcell.library.system.business.dto.response.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddResponseTransaction {
    private int id;
    private double debt;
    private int operation;
    private int employeeId;
    private int rentalId;
}
