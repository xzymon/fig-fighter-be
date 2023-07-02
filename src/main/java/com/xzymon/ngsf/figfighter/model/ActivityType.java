package com.xzymon.ngsf.figfighter.model;

import javax.persistence.*;

@Entity
public class ActivityType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Boolean staticFlag;

	@OneToOne(mappedBy = "activityType")
	private EquipmentKit equipmentKit;
	private Integer defaultSeries;
	private Integer defaultRepeats;
	private Integer defaultDuration;
	private Integer defaultWeight;
	private String visualisationUrl;

	@Enumerated(EnumType.STRING)
	private BodyPart bodyPart;
}
