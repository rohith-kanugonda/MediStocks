package com.medistocks.authentication.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailDetails {
   
    private String recipient;
    private String messageBody;
    private String subject;
    
}
