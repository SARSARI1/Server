package com.labo.laboratoire.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UtilisateurDTO {
    private String email;
    private Long fkIdLaboratoire;
    private String imageurl;
    private String nomComplet;
    private String profession;
    private String numTel;
    private String signature;
    private String role;
}
