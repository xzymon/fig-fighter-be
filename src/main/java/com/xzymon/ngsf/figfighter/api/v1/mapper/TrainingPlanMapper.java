package com.xzymon.ngsf.figfighter.api.v1.mapper;

import com.xzymon.ngsf.figfighter.api.v1.model.TrainingPlanDTO;
import com.xzymon.ngsf.figfighter.model.TrainingPlan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrainingPlanMapper {
	TrainingPlanMapper INSTANCE = Mappers.getMapper(TrainingPlanMapper.class);

	@Mapping(source = "id", target = "id")
	TrainingPlanDTO trainingPlanToDto(TrainingPlan trainingPlan);
}
