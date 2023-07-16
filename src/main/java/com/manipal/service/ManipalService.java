package com.manipal.service;

import java.util.List;

import com.manipal.dao.ManipalDAO;

public interface ManipalService {

	public ManipalDAO saveDetails(ManipalDAO manipalDAO);

	public List<ManipalDAO> getAllPatients();

	public ManipalDAO getById(long id);

	public ManipalDAO updateDetails(long id, ManipalDAO manipalDAO);

	public void deleteById(long id);

}
