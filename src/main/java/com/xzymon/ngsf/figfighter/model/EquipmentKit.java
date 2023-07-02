package com.xzymon.ngsf.figfighter.model;

import javax.persistence.*;

@Entity
public class EquipmentKit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantity;

	@OneToOne
	private ActivityType activityType;
}
