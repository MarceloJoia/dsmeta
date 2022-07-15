package br.com.joiamarketing.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joiamarketing.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
