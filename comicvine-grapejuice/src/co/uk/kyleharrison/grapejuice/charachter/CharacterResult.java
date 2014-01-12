package co.uk.kyleharrison.grapejuice.charachter;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

/*
 * aliases 	List of aliases the character is known by. A \n (newline) seperates each alias. 		
api_detail_url 	URL pointing to the character detail resource. 		
birth 	A date, if one exists, that the character was born on. Not an origin date. 		
count_of_issue_appearances 	Number of issues this character appears in. 		
date_added 	Date the character was added to Comic Vine. 		
date_last_updated 	Date the character was last updated on Comic Vine. 		
deck 	Brief summary of the character. 		
description 	Description of the character. 		
first_appeared_in_issue 	Issue where the character made its first appearance. 		
gender 	Gender of the character. Available options are: Male, Female, Other 		
id 	Unique ID of the character. 		
image 	Main image of the character. 		
name 	Name of the character. 		
origin 	The origin of the character. Human, Alien, Robot ...etc 		
publisher 	The primary publisher a character is attached to. 		
real_name 	Real name of the character. 		
site_detail_url 	URL pointing to the character on Giant Bomb. 		
 */

public class CharacterResult {

	private ArrayList<?> field_list = new ArrayList<Object>();
	private int limit;
	private int offset;
	private String sort_field;
	private String sort_direction;
	private String sort ="&sort=field:direction";
	
	private ArrayList<?> aliases = new ArrayList<Object>();
	private String api_detail_url;
	private Date birth;
	private int count_of_issue_appearances;
	private Date date_added;
	private Date date_last_updated;
	private String deck;
	private String description;
	private int first_appeared_in_issue;
	private enum gender {MALE,FEMALE,OTHER};
	private int id;
	private Image image;
	private String name;
	private enum origin{HUMAN,ALIEN,ROBOT};
	private String publisher;
	private String real_name;
	private URL site_detail_url;
	
	public ArrayList<?> getField_list() {
		return field_list;
	}
	public int getLimit() {
		return limit;
	}
	public int getOffset() {
		return offset;
	}
	public String getSort_field() {
		return sort_field;
	}
	public String getSort_direction() {
		return sort_direction;
	}
	public String getSort() {
		return sort;
	}
	public ArrayList<?> getAliases() {
		return aliases;
	}
	public String getApi_detail_url() {
		return api_detail_url;
	}
	public Date getBirth() {
		return birth;
	}
	public int getCount_of_issue_appearances() {
		return count_of_issue_appearances;
	}
	public Date getDate_added() {
		return date_added;
	}
	public Date getDate_last_updated() {
		return date_last_updated;
	}
	public String getDeck() {
		return deck;
	}
	public String getDescription() {
		return description;
	}
	public int getFirst_appeared_in_issue() {
		return first_appeared_in_issue;
	}
	public int getId() {
		return id;
	}
	public Image getImage() {
		return image;
	}
	public String getName() {
		return name;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getReal_name() {
		return real_name;
	}
	public URL getSite_detail_url() {
		return site_detail_url;
	}
	public void setField_list(ArrayList<?> field_list) {
		this.field_list = field_list;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public void setSort_field(String sort_field) {
		this.sort_field = sort_field;
	}
	public void setSort_direction(String sort_direction) {
		this.sort_direction = sort_direction;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void setAliases(ArrayList<?> aliases) {
		this.aliases = aliases;
	}
	public void setApi_detail_url(String api_detail_url) {
		this.api_detail_url = api_detail_url;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public void setCount_of_issue_appearances(int count_of_issue_appearances) {
		this.count_of_issue_appearances = count_of_issue_appearances;
	}
	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}
	public void setDate_last_updated(Date date_last_updated) {
		this.date_last_updated = date_last_updated;
	}
	public void setDeck(String deck) {
		this.deck = deck;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setFirst_appeared_in_issue(int first_appeared_in_issue) {
		this.first_appeared_in_issue = first_appeared_in_issue;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public void setSite_detail_url(URL site_detail_url) {
		this.site_detail_url = site_detail_url;
	}
	
}
