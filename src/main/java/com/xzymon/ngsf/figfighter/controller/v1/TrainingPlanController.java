package com.xzymon.ngsf.figfighter.controller.v1;

import com.xzymon.ngsf.figfighter.api.v1.model.TrainingPlanDTO;
import com.xzymon.ngsf.figfighter.api.v1.model.TrainingPlanListDTO;
import com.xzymon.ngsf.figfighter.service.TrainingPlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(TrainingPlanController.BASE_URL)
public class TrainingPlanController {
	public static final String BASE_URL = "/api/v1/trainingPlan/";
	private static final Logger LOGGER = LoggerFactory.getLogger(TrainingPlanController.class);

	private final TrainingPlanService trainingPlanService;

	public TrainingPlanController(TrainingPlanService trainingPlanService) {
		this.trainingPlanService = trainingPlanService;
	}

	@GetMapping
	public ResponseEntity<TrainingPlanListDTO> getAllTrainingPlans() {
		LOGGER.info("Invoked: {}", BASE_URL);
		return new ResponseEntity<TrainingPlanListDTO>(new TrainingPlanListDTO(trainingPlanService.getAllTrainingPlans()), HttpStatus.OK);
	}

	@GetMapping("{name}")
	public ResponseEntity<TrainingPlanDTO> getTrainingPlanByName(@PathVariable String name) {
		return new ResponseEntity<TrainingPlanDTO>(trainingPlanService.getTrainingPlanByName(name), HttpStatus.OK);
	}
}
