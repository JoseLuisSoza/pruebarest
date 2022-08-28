package bja.pnud.service.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.service.service.model.Recorrido;

public interface RecorridoRepository extends JpaRepository<Recorrido, Long> {
    
}
