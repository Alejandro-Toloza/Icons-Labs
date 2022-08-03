
package com.alkemy.lab.icons.service.impl;

import com.alkemy.lab.icons.dto.ContinenteDTO;
import com.alkemy.lab.icons.entity.ContinenteEntity;
import com.alkemy.lab.icons.mapper.ContinenteMapper;
import com.alkemy.lab.icons.repository.ContinenteRepository;
import com.alkemy.lab.icons.service.ContinenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandro
 */
@Service
public class ContinenteServiceImpl implements ContinenteService{

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;
    
    @Override
    public ContinenteDTO save(ContinenteDTO dto) {
        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinenteEntity entitySave = continenteRepository.save(entity);
        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entitySave);
        System.out.println("Guardar continente");
        return result;
    }

    @Override
    public List<ContinenteDTO> getAllContinentes() {
        List<ContinenteEntity> entities = continenteRepository.findAll();
        List<ContinenteDTO> result = continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }
    
    
    
    
}
