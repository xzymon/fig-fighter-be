package com.xzymon.ngsf.figfighter.service;

import com.xzymon.ngsf.figfighter.api.v1.mapper.TrainingPlanMapper;
import com.xzymon.ngsf.figfighter.api.v1.model.TrainingPlanDTO;
import com.xzymon.ngsf.figfighter.repository.TrainingPlanRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainingPlanServiceImpl implements TrainingPlanService {
	private final TrainingPlanMapper trainingPlanMapper;
	private final TrainingPlanRepository trainingPlanRepository;

	public TrainingPlanServiceImpl(TrainingPlanMapper trainingPlanMapper, TrainingPlanRepository trainingPlanRepository) {
		this.trainingPlanMapper = trainingPlanMapper;
		this.trainingPlanRepository = trainingPlanRepository;
	}

	@Override
	public List<TrainingPlanDTO> getAllTrainingPlans() {
		return trainingPlanRepository.findAll()
				       .stream()
				       .map(trainingPlan -> trainingPlanMapper.trainingPlanToDto(trainingPlan))
				       .collect(Collectors.toList());
	}

	@Override
	public TrainingPlanDTO getTrainingPlanByName(String name) {
		return trainingPlanMapper.trainingPlanToDto(trainingPlanRepository.findByName(name));
	}
}
