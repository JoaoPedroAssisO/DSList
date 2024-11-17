package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
<<<<<<< HEAD
import com.devsuperior.dslist.projections.GameMinProjection;
=======

import jakarta.persistence.Column;
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
<<<<<<< HEAD
=======
	public GameMinDTO() {
		
	}

>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

<<<<<<< HEAD
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

=======
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
<<<<<<< HEAD
=======
	
	
	
	
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
}
