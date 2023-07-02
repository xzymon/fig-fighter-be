package com.xzymon.ngsf.figfighter.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TrainingPlanListDTO {
	List<TrainingPlanDTO> trainingPlans;
}
