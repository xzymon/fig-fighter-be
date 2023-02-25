package com.xzymon.ngsf.figfighter.controller;

import com.xzymon.ngsf.figfighter.model.TrainingPlan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingPlanController {

	@RequestMapping(method = RequestMethod.GET, path = "/trainingPlan")
	public TrainingPlan trainingPlan() {
		return new TrainingPlan(1l, "Pull", "Trening typu pull: plecy, bicepsy, przedramiona");
	}
}
