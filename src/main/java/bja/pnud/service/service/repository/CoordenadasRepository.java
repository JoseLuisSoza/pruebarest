package bja.pnud.service.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.service.service.model.Coordenadas;

public interface CoordenadasRepository extends JpaRepository<Coordenadas, Long> {
    
}
