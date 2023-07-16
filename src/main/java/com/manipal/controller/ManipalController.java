package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.dao.ManipalDAO;
import com.manipal.service.ManipalService;

@RestController
@RequestMapping("/hospital")
public class ManipalController {

	@Autowired
	private ManipalService manipalService;

	@PostMapping("/save")
	public ResponseEntity<ManipalDAO> savePatient(@RequestBody ManipalDAO manipalDAO) {

		ManipalDAO saveDetails = manipalService.saveDetails(manipalDAO);

		return new ResponseEntity<ManipalDAO>(saveDetails, HttpStatus.CREATED);

	}

	@GetMapping("/getall")
	public ResponseEntity<List<ManipalDAO>> getAll() {

		List<ManipalDAO> allPatients = manipalService.getAllPatients();

		return new ResponseEntity<List<ManipalDAO>>(allPatients, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ManipalDAO> getbyid(@PathVariable long id) {

		ManipalDAO byId = manipalService.getById(id);
		return new ResponseEntity<ManipalDAO>(byId, HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ManipalDAO> updatepat(@PathVariable long id, @RequestBody ManipalDAO manipalDAO) {

		ManipalDAO updateDetails = manipalService.updateDetails(id, manipalDAO);

		return new ResponseEntity<ManipalDAO>(updateDetails, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable long id) {
		manipalService.deleteById(id);

		return new ResponseEntity<String>("Deletd", HttpStatus.OK);

	}
}
