package com.xzymon.ngsf.figfighter.repository;

import com.xzymon.ngsf.figfighter.model.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlan, Long> {
	TrainingPlan findByName(String name);
}
