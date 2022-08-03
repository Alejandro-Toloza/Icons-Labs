
package com.alkemy.lab.icons.repository;

import com.alkemy.lab.icons.entity.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alejandro
 */
@Repository
public interface ContinenteRepository extends JpaRepository<ContinenteEntity, Long>{
    
}
