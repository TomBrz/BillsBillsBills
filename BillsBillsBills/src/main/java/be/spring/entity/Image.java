package be.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Image")
public class Image {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private long id;
	@Column(name = "Link")
	private String link;

	public Image() {
	}

	public Image(long id, String link) {
		this.id = id;
		this.link = link;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", link=" + link + "]";
	}

}
