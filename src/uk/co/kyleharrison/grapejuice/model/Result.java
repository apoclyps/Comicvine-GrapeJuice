package uk.co.kyleharrison.grapejuice.model;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Result {

	private ArrayList<?> field_list = new ArrayList<Object>();
	
	private ArrayList<?> aliases = new ArrayList<Object>();
	private String api_detail_url;
	private Date date_added;
	private Date date_last_updated;
	private String deck;
	private String description;
	private int id;
	private Image image;
	private String location_address;
	private String location_city;
	private String location_state;
	private String name;
	private URL site_detail_url;
	
	public Result() {
		super();
	}
	
	public Result(ArrayList<?> field_list, ArrayList<?> aliases,
			String api_detail_url, Date date_added, Date date_last_updated,
			String deck, String description, int id, Image image,
			String location_address, String location_city,
			String location_state, String name, URL site_detail_url) {
		super();
		this.field_list = field_list;
		this.aliases = aliases;
		this.api_detail_url = api_detail_url;
		this.date_added = date_added;
		this.date_last_updated = date_last_updated;
		this.deck = deck;
		this.description = description;
		this.id = id;
		this.image = image;
		this.location_address = location_address;
		this.location_city = location_city;
		this.location_state = location_state;
		this.name = name;
		this.site_detail_url = site_detail_url;
	}

	public ArrayList<?> getField_list() {
		return field_list;
	}

	public void setField_list(ArrayList<?> field_list) {
		this.field_list = field_list;
	}

	public ArrayList<?> getAliases() {
		return aliases;
	}

	public void setAliases(ArrayList<?> aliases) {
		this.aliases = aliases;
	}

	public String getApi_detail_url() {
		return api_detail_url;
	}

	public void setApi_detail_url(String api_detail_url) {
		this.api_detail_url = api_detail_url;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	public Date getDate_last_updated() {
		return date_last_updated;
	}

	public void setDate_last_updated(Date date_last_updated) {
		this.date_last_updated = date_last_updated;
	}

	public String getDeck() {
		return deck;
	}

	public void setDeck(String deck) {
		this.deck = deck;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getLocation_address() {
		return location_address;
	}

	public void setLocation_address(String location_address) {
		this.location_address = location_address;
	}

	public String getLocation_city() {
		return location_city;
	}

	public void setLocation_city(String location_city) {
		this.location_city = location_city;
	}

	public String getLocation_state() {
		return location_state;
	}

	public void setLocation_state(String location_state) {
		this.location_state = location_state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getSite_detail_url() {
		return site_detail_url;
	}

	public void setSite_detail_url(URL site_detail_url) {
		this.site_detail_url = site_detail_url;
	}
	
}
