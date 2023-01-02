package com.example.demo.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/*@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Medecin implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idMedecin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    //@Temporal(TemporalType.DATE)
    // @ApiModelProperty(required = true, dataType="date")
    //@JsonFormat(pattern = "yyyy-mm-dd")
    private Specialite specialite;
    private int telephone;
    private int prixConsultation;
    @ManyToMany(mappedBy = "medecins")
    @JsonIgnore
    @JsonManagedReference

    private Set<Clinique> cliniques;

    @OneToMany(mappedBy = "medecin")


    private Set<Rendez_vous> rendez_vous;


}
*/