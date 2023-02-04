package sn.ism.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.ism.domaine.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Integer> {

}
