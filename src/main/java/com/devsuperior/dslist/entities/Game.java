package com.devsuperior.dslist.entities;

import java.util.Objects;

<<<<<<< HEAD
=======
import jakarta.annotation.Generated;
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(name = "tb_game")
public class Game {

=======

@Entity
@Table(name = "tb_game")
public class Game {
	
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
<<<<<<< HEAD
	@Column(name = "game_year")
=======
	@Column(name = "Game_year")
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
<<<<<<< HEAD

	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
    public Game() {
    }
    
	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
=======
	
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	public Game() {
		
	}
	
	
    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
			String shortDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
<<<<<<< HEAD
		this.longDescription = longDescription;		
	}

=======
		this.longDescription = longDescription;
	}



>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

<<<<<<< HEAD
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
=======
	public String getgenre() {
		return genre;
	}

	public void setGenere(String genere) {
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

<<<<<<< HEAD
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
=======
	public void setShortDescription(String shortDescripition) {
		this.shortDescription = shortDescripition;
>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

<<<<<<< HEAD
=======

>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

<<<<<<< HEAD
=======

>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
<<<<<<< HEAD
=======
	
	
	

>>>>>>> 29fa2195cb3d4f6e68ef9908baefb9d1cc0c4a06
}
