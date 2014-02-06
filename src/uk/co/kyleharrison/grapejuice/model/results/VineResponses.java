package uk.co.kyleharrison.grapejuice.model.results;

import java.util.ArrayList;

public class VineResponses {
	
	private int limit=0;
	private int offset =0;
	private int number_of_page_results=0;
	private int number_of_total_results =0;
	private ArrayList<VineResult> list = new ArrayList<VineResult>();
	
	public VineResponses(){
		
	}
	
	public int getLimit() {
		return limit;
	}
	public int getOffset() {
		return offset;
	}
	public int getNumber_of_page_results() {
		return number_of_page_results;
	}
	public int getNumber_of_total_results() {
		return number_of_total_results;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public void setNumber_of_page_results(int number_of_page_results) {
		this.number_of_page_results = number_of_page_results;
	}
	public void setNumber_of_total_results(int number_of_total_results) {
		this.number_of_total_results = number_of_total_results;
	}
	public ArrayList<VineResult> getList() {
		return list;
	}
	public void setList(ArrayList<VineResult> list) {
		this.list = list;
	}
	
	public void addVineResult(VineResult vr){
		this.list.add(vr);
	}
	
	public void clearArrayList(){
		this.list.clear();
	}
	

}
