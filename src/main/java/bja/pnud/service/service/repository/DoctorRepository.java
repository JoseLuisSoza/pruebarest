package bja.pnud.service.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.service.service.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    
}
