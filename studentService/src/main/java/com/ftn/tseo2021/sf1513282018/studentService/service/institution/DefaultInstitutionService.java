package com.ftn.tseo2021.sf1513282018.studentService.service.institution;

import org.springframework.beans.factory.annotation.Autowired;

import com.ftn.tseo2021.sf1513282018.studentService.contract.repository.institution.InstitutionRepository;
import com.ftn.tseo2021.sf1513282018.studentService.contract.service.institution.InstitutionService;
import com.ftn.tseo2021.sf1513282018.studentService.model.dto.institution.DefaultInstitutionDTO;

public class DefaultInstitutionService implements InstitutionService {
	
	@Autowired
	InstitutionRepository institutionRepo;

	@Override
	public DefaultInstitutionDTO getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer create(DefaultInstitutionDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Integer id, DefaultInstitutionDTO t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}