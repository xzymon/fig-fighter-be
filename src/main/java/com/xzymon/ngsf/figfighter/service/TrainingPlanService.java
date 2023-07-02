package com.xzymon.ngsf.figfighter.service;

import com.xzymon.ngsf.figfighter.api.v1.model.TrainingPlanDTO;

import java.util.List;

public interface TrainingPlanService {
	List<TrainingPlanDTO> getAllTrainingPlans();
	TrainingPlanDTO getTrainingPlanByName(String name);
}
