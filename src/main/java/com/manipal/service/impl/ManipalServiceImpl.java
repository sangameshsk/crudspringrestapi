package com.manipal.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.dao.ManipalDAO;
import com.manipal.entities.Manipal;
import com.manipal.repository.ManipalRepository;
import com.manipal.service.ManipalService;

@Service
public class ManipalServiceImpl implements ManipalService {

	@Autowired
	private ManipalRepository manipalRepository;

	@Override
	public ManipalDAO saveDetails(ManipalDAO manipalDAO) {

		Manipal maptoentity = maptoentity(manipalDAO);
		Manipal save = manipalRepository.save(maptoentity);

		return mapToDAO(save);
	}

	@Override
	public List<ManipalDAO> getAllPatients() {
		List<Manipal> findAll = manipalRepository.findAll();

		return findAll.stream().map(a -> mapToDAO(a)).collect(Collectors.toList());
	}

	@Override
	public ManipalDAO getById(long id) {
		Manipal manipal = manipalRepository.findById(id).get();

		return mapToDAO(manipal);
	}

	@Override
	public ManipalDAO updateDetails(long id, ManipalDAO manipalDAO) {
		Manipal manipal = manipalRepository.findById(id).get();
		//manipal.setpId(manipalDAO.getpId());
		manipal.setPname(manipalDAO.getPname());
		manipal.setPaddress(manipalDAO.getPaddress());
		Manipal save = manipalRepository.save(manipal);
		return mapToDAO(save);
	}

	@Override
	public void deleteById(long id) {
		manipalRepository.deleteById(id);

	}

	public Manipal maptoentity(ManipalDAO manipalDAO) {
		Manipal manipal = new Manipal();
		manipal.setPname(manipalDAO.getPname());
		manipal.setPaddress(manipalDAO.getPaddress());
		return manipal;
	}

	public ManipalDAO mapToDAO(Manipal manipal) {
		ManipalDAO manipalDAO = new ManipalDAO();
		manipalDAO.setpId(manipal.getpId());
		manipalDAO.setPname(manipal.getPname());
		manipalDAO.setPaddress(manipal.getPaddress());

		return manipalDAO;

	}

}
