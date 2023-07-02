package com.xzymon.ngsf.figfighter.bootstrap;

import com.xzymon.ngsf.figfighter.model.TrainingPlan;
import com.xzymon.ngsf.figfighter.repository.TrainingPlanRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FigFighterBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private TrainingPlanRepository trainingPlanRepository;
	public FigFighterBootstrap(TrainingPlanRepository trainingPlanRepository) {
		this.trainingPlanRepository = trainingPlanRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		this.trainingPlanRepository.saveAll(provideTrainingPlan());
	}

	private List<TrainingPlan> provideTrainingPlan() {
		return List.of(
				new TrainingPlan(1l, "Pull", "Plecy, bicepsy, przedramiona"),
				new TrainingPlan(2l, "Push", "Klatka, tricepsy, barki"),
				new TrainingPlan(3l, "Nogi", "Nogi")
		);
	}
}
