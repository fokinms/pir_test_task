package org.pir.fokinms.pir.entity.project;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.pir.fokinms.pir.entity.ArchitectSolutions;
import org.pir.fokinms.pir.entity.ConstructiveSolutions;
import org.pir.fokinms.pir.entity.EngineerEquipments1;
import org.pir.fokinms.pir.entity.EngineerEquipments2;
import org.pir.fokinms.pir.entity.EngineerEquipments3;
import org.pir.fokinms.pir.entity.EngineerEquipments4;
import org.pir.fokinms.pir.entity.EngineerEquipments5;
import org.pir.fokinms.pir.entity.EngineerEquipments6;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", length = 64, nullable = false, unique = true)
    private String code;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private ProjectStatus status;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "finished_at")
    private LocalDateTime finishedAt;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ArchitectSolutions architectSolutions;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ConstructiveSolutions constructiveSolutions;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EngineerEquipments1 engineerEquipments1;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EngineerEquipments2 engineerEquipments2;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EngineerEquipments3 engineerEquipments3;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EngineerEquipments4 engineerEquipments4;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EngineerEquipments5 engineerEquipments5;

    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EngineerEquipments6 engineerEquipments6;
}