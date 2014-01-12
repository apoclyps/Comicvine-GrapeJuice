import java.util.ArrayList;
import java.util.Date;

/*
 * URL: /character
	Filters
	field_list	List of field names to include in the response. Use this if you want to reduce the size of the response payload. This filter can accept multiple arguments, each delimited with a ","
	Fields
	aliases 	List of aliases the character is known by. A \n (newline) seperates each alias.
	api_detail_url 	URL pointing to the character detail resource.
	birth 	A date, if one exists, that the character was born on. Not an origin date.
	character_enemies 	List of characters that are enemies with this character.
	character_friends 	List of characters that are friends with this character.
	count_of_issue_appearances 	Number of issues this character appears in.
	creators 	List of the real life people who created this character.
	date_added 	Date the character was added to Comic Vine.
	date_last_updated 	Date the character was last updated on Comic Vine.
	deck 	Brief summary of the character.
	description 	Description of the character.
	first_appeared_in_issue 	Issue where the character made its first appearance.
	gender 	Gender of the character. Available options are: Male, Female, Other
	id 	Unique ID of the character.
	image 	Main image of the character.
	issue_credits 	List of issues this character appears in.
	issues_died_in 	List of issues this character died in.
	movies 	Movies the character was in.
	name 	Name of the character.
	origin 	The origin of the character. Human, Alien, Robot ...etc
	powers 	List of super powers a character has.
	publisher 	The primary publisher a character is attached to.
	real_name 	Real name of the character.
	site_detail_url 	URL pointing to the character on Giant Bomb.
	story_arc_credits 	List of story arcs this character appears in.
	team_enemies 	List of teams that are enemies of this character.
	team_friends 	List of teams that are friends with this character.
	teams 	List of teams this character is a member of.
	volume_credits 	List of comic volumes this character appears in.
 * 
 * 
 */
public class VineResources {
	boolean enable_field_list =false;
	String field_list ="field_list";
	//Fields
	String [] aliases;
	String api_detail_url;
	Date birth;
	ArrayList<String>character_enemies;
	ArrayList<String>character_friends;
	int count_of_issue_appearances;
	ArrayList<String> creators;
	date date_added;
	date date_last_updated;
	deck
	description
	first_appeared_in_issue
	gender
	id
	image
	issue_credits
	issues_died_in
	movies
	name
	origin
	powers
	publisher
	real_name
	site_detail_url
	story_arc_credits
	team_enemies
	team_friends
	teams
	volume_credits
	
}
