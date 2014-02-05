package co.uk.kyleharrison.grapejuice.model.issue;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class IssueResult {

	private ArrayList<String> field_list = new ArrayList<String>();
	private int limit;
	private int offset;
	private String sort_field;
	private String sort_direction;
	private String sort = "&sort=field:direction";
	// Fields
	private ArrayList<String> aliases = new ArrayList<String>();
	private String api_detail_url;
	private Date birth;
	private ArrayList<String> character_credits;
	private ArrayList<String> characters_died_in;
	private ArrayList<String> concept_credits;
	private Date cover_date;
	private Date date_added;
	private Date date_last_updated;
	private String deck;
	private String description;
	private ArrayList<String> disbanded_teams;
	private ArrayList<String> first_appearance_characters;
	private ArrayList<String> first_appearance_concepts;
	private ArrayList<String> first_appearance_locations;
	private ArrayList<String> first_appearance_objects;
	private ArrayList<String> first_appearance_storyarcs;
	private ArrayList<String> first_appearance_teams;
	// first_appearance_teams
	private int id;
	private Image image;
	private int issue_number;
	private ArrayList<String> location_credits;
	private String name;
	private ArrayList<String> object_credits;
	private ArrayList<String> person_credits;
	private String site_detail_url;
	private Date store_date;
	private ArrayList<String> story_arc_credits;
	private ArrayList<String> team_credits;
	private ArrayList<String> teams_disbanded_in;
	private int volume;

	public IssueResult() {
		super();
	}

	public ArrayList<String> getField_list() {
		return field_list;
	}

	public void setField_list(ArrayList<String> field_list) {
		this.field_list = field_list;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getSort_field() {
		return sort_field;
	}

	public void setSort_field(String sort_field) {
		this.sort_field = sort_field;
	}

	public String getSort_direction() {
		return sort_direction;
	}

	public void setSort_direction(String sort_direction) {
		this.sort_direction = sort_direction;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public ArrayList<String> getAliases() {
		return aliases;
	}

	public void setAliases(ArrayList<String> aliases) {
		this.aliases = aliases;
	}

	public String getApi_detail_url() {
		return api_detail_url;
	}

	public void setApi_detail_url(String api_detail_url) {
		this.api_detail_url = api_detail_url;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public ArrayList<String> getCharacter_credits() {
		return character_credits;
	}

	public void setCharacter_credits(ArrayList<String> character_credits) {
		this.character_credits = character_credits;
	}

	public ArrayList<String> getCharacters_died_in() {
		return characters_died_in;
	}

	public void setCharacters_died_in(ArrayList<String> characters_died_in) {
		this.characters_died_in = characters_died_in;
	}

	public ArrayList<String> getConcept_credits() {
		return concept_credits;
	}

	public void setConcept_credits(ArrayList<String> concept_credits) {
		this.concept_credits = concept_credits;
	}

	public Date getCover_date() {
		return cover_date;
	}

	public void setCover_date(Date cover_date) {
		this.cover_date = cover_date;
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

	public ArrayList<String> getDisbanded_teams() {
		return disbanded_teams;
	}

	public void setDisbanded_teams(ArrayList<String> disbanded_teams) {
		this.disbanded_teams = disbanded_teams;
	}

	public ArrayList<String> getFirst_appearance_characters() {
		return first_appearance_characters;
	}

	public void setFirst_appearance_characters(
			ArrayList<String> first_appearance_characters) {
		this.first_appearance_characters = first_appearance_characters;
	}

	public ArrayList<String> getFirst_appearance_concepts() {
		return first_appearance_concepts;
	}

	public void setFirst_appearance_concepts(
			ArrayList<String> first_appearance_concepts) {
		this.first_appearance_concepts = first_appearance_concepts;
	}

	public ArrayList<String> getFirst_appearance_locations() {
		return first_appearance_locations;
	}

	public void setFirst_appearance_locations(
			ArrayList<String> first_appearance_locations) {
		this.first_appearance_locations = first_appearance_locations;
	}

	public ArrayList<String> getFirst_appearance_objects() {
		return first_appearance_objects;
	}

	public void setFirst_appearance_objects(
			ArrayList<String> first_appearance_objects) {
		this.first_appearance_objects = first_appearance_objects;
	}

	public ArrayList<String> getFirst_appearance_storyarcs() {
		return first_appearance_storyarcs;
	}

	public void setFirst_appearance_storyarcs(
			ArrayList<String> first_appearance_storyarcs) {
		this.first_appearance_storyarcs = first_appearance_storyarcs;
	}

	public ArrayList<String> getFirst_appearance_teams() {
		return first_appearance_teams;
	}

	public void setFirst_appearance_teams(ArrayList<String> first_appearance_teams) {
		this.first_appearance_teams = first_appearance_teams;
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

	public int getIssue_number() {
		return issue_number;
	}

	public void setIssue_number(int issue_number) {
		this.issue_number = issue_number;
	}

	public ArrayList<String> getLocation_credits() {
		return location_credits;
	}

	public void setLocation_credits(ArrayList<String> location_credits) {
		this.location_credits = location_credits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getObject_credits() {
		return object_credits;
	}

	public void setObject_credits(ArrayList<String> object_credits) {
		this.object_credits = object_credits;
	}

	public ArrayList<String> getPerson_credits() {
		return person_credits;
	}

	public void setPerson_credits(ArrayList<String> person_credits) {
		this.person_credits = person_credits;
	}

	public String getSite_detail_url() {
		return site_detail_url;
	}

	public void setSite_detail_url(String site_detail_url) {
		this.site_detail_url = site_detail_url;
	}

	public Date getStore_date() {
		return store_date;
	}

	public void setStore_date(Date store_date) {
		this.store_date = store_date;
	}

	public ArrayList<String> getStory_arc_credits() {
		return story_arc_credits;
	}

	public void setStory_arc_credits(ArrayList<String> story_arc_credits) {
		this.story_arc_credits = story_arc_credits;
	}

	public ArrayList<String> getTeam_credits() {
		return team_credits;
	}

	public void setTeam_credits(ArrayList<String> team_credits) {
		this.team_credits = team_credits;
	}

	public ArrayList<String> getTeams_disbanded_in() {
		return teams_disbanded_in;
	}

	public void setTeams_disbanded_in(ArrayList<String> teams_disbanded_in) {
		this.teams_disbanded_in = teams_disbanded_in;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
