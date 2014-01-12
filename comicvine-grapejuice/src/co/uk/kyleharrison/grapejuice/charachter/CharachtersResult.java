package co.uk.kyleharrison.grapejuice.charachter;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class CharachtersResult {

	private ArrayList<?> field_list = new ArrayList<Object>();
	
	private ArrayList<?> aliases = new ArrayList<Object>();
	private String api_detail_url;
	private Date birth;
	private ArrayList<?> character_enemies = new ArrayList<Object>();
	private ArrayList<?> character_friends = new ArrayList<Object>();
	private int count_of_issue_appearances;
	private ArrayList<?> creators = new ArrayList<Object>();
	private Date date_added;
	private Date date_last_updated;
	private String deck;
	private String description;
	private int first_appeared_in_issue;
	private enum gender {MALE,FEMALE,OTHER};
	private int id;
	private Image image;
	private ArrayList<?> issue_credits = new ArrayList<Object>();
	private ArrayList<?> issues_died_in = new ArrayList<Object>();
	private ArrayList<?> movies = new ArrayList<Object>();
	private String name;
	enum origin{HUMAN,ALIEN,ROBOT};
	private ArrayList<?> powers;
	private String publisher;
	private String real_name;
	private URL site_detail_url;
	private ArrayList<?> story_arc_credits = new ArrayList<Object>();
	private ArrayList<?> team_enemies = new ArrayList<Object>();
	private ArrayList<?> team_friends = new ArrayList<Object>();
	private ArrayList<?> teams = new ArrayList<Object>();
	private ArrayList<?> volume_credits = new ArrayList<Object>();
	public ArrayList<?> getField_list() {
		return field_list;
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
	public ArrayList<?> getCharacter_enemies() {
		return character_enemies;
	}
	public ArrayList<?> getCharacter_friends() {
		return character_friends;
	}
	public int getCount_of_issue_appearances() {
		return count_of_issue_appearances;
	}
	public ArrayList<?> getCreators() {
		return creators;
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
	public ArrayList<?> getIssue_credits() {
		return issue_credits;
	}
	public ArrayList<?> getIssues_died_in() {
		return issues_died_in;
	}
	public ArrayList<?> getMovies() {
		return movies;
	}
	public String getName() {
		return name;
	}
	public ArrayList<?> getPowers() {
		return powers;
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
	public ArrayList<?> getStory_arc_credits() {
		return story_arc_credits;
	}
	public ArrayList<?> getTeam_enemies() {
		return team_enemies;
	}
	public ArrayList<?> getTeam_friends() {
		return team_friends;
	}
	public ArrayList<?> getTeams() {
		return teams;
	}
	public ArrayList<?> getVolume_credits() {
		return volume_credits;
	}
	public void setField_list(ArrayList<?> field_list) {
		this.field_list = field_list;
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
	public void setCharacter_enemies(ArrayList<?> character_enemies) {
		this.character_enemies = character_enemies;
	}
	public void setCharacter_friends(ArrayList<?> character_friends) {
		this.character_friends = character_friends;
	}
	public void setCount_of_issue_appearances(int count_of_issue_appearances) {
		this.count_of_issue_appearances = count_of_issue_appearances;
	}
	public void setCreators(ArrayList<?> creators) {
		this.creators = creators;
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
	public void setIssue_credits(ArrayList<?> issue_credits) {
		this.issue_credits = issue_credits;
	}
	public void setIssues_died_in(ArrayList<?> issues_died_in) {
		this.issues_died_in = issues_died_in;
	}
	public void setMovies(ArrayList<?> movies) {
		this.movies = movies;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPowers(ArrayList<?> powers) {
		this.powers = powers;
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
	public void setStory_arc_credits(ArrayList<?> story_arc_credits) {
		this.story_arc_credits = story_arc_credits;
	}
	public void setTeam_enemies(ArrayList<?> team_enemies) {
		this.team_enemies = team_enemies;
	}
	public void setTeam_friends(ArrayList<?> team_friends) {
		this.team_friends = team_friends;
	}
	public void setTeams(ArrayList<?> teams) {
		this.teams = teams;
	}
	public void setVolume_credits(ArrayList<?> volume_credits) {
		this.volume_credits = volume_credits;
	}
}
