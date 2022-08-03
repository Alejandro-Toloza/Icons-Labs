
package com.alkemy.lab.icons.service;

import com.alkemy.lab.icons.dto.ContinenteDTO;
import java.util.List;

/**
 *
 * @author alejandro
 */
public interface ContinenteService {
    
    ContinenteDTO save(ContinenteDTO dto);
    
    List<ContinenteDTO> getAllContinentes();
    
    
    
    
}
