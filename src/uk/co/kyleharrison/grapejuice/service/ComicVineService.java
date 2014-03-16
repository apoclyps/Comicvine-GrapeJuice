package uk.co.kyleharrison.grapejuice.service;

import java.util.ArrayList;

import uk.co.kyleharrison.grapejuice.comicvine.*;
import uk.co.kyleharrison.grapejuice.model.enums.*;

public class ComicVineService {

    public String ComicVineKey;
    public MatchType MatchType;
    public SearchType SearchType;
    public String SearchAddress;
    public String ComicVineAddress;
    public String ComicVineBetaAddress;
	
	public ComicVineService()
    {
        this.Initialize();
    }

    ComicVineService(String comicVineKey)
    {
        this.ComicVineKey = comicVineKey;
        this.Initialize();
    }

    private void Initialize()
    {
        this.SearchType = uk.co.kyleharrison.grapejuice.service.SearchType.Xml;
        this.MatchType = uk.co.kyleharrison.grapejuice.model.enums.MatchType.AbsoluteMatch;
        this.SearchAddress = "http://api.comicvine.com/search/";
        this.ComicVineAddress = "http://api.comicvine.com/";
        this.ComicVineBetaAddress = "http://beta.comicvine.com/api/";
    }

    private ArrayList<ComicVineVolume> FindVolumeIdByName(String volumeName)
    {
    	ArrayList<ComicVineVolume> comicVineVolumeList = new ArrayList<ComicVineVolume>();
        /*
    	String query = null;

        if (this.SearchType == SearchType.Xml)
        {
            query = this.ComicVineBetaAddress + "volumes/?api_key=" + this.ComicVineKey + "&format=xml&field_list=id,name,publisher&filter=name:" + volumeName;
        }
        else
        {
            query = this.ComicVineBetaAddress + "volumes/?api_key=" + this.ComicVineKey + "&format=json&field_list=id,name,publisher&filter=name:" + volumeName;
        }

        Task<ComicVineResponse> comicVineResponse = ComicVineConnection.ConnectAndRequest(query);

        ArrayList<ComicVineVolume> comicVineVolumeLists = new ArrayList<ComicVineVolume>();

        if (comicVineResponse.Result.Status == "OK")
        {
            ComicVineResponseData firstData = ComicVineReader.GetFirstVolumeQueryResponse(this.SearchType, comicVineResponse.Result.Response);


            if (firstData.number_of_total_results > 0)
            {
                int parallelThreads = SystemEnvironment.ProcessorCountOptimizedForEnvironment();

                int numberOfIterations = (int)Math.ceil(((double)firstData.number_of_total_results / (double)firstData.limit));

                Parallel.For(0, numberOfIterations, new ParallelOptions() { MaxDegreeOfParallelism = parallelThreads }, i =>
                {
                    int offset = i * firstData.limit;
                    String secondQuery = query + "&offset=" + offset.ToString();

                    Task<ComicVineResponse> secondResponse = ComicVineConnection.ConnectAndRequest(secondQuery);
                    var volumeList = ComicVineReader.GetVolumeQueryResponse(this.SearchType, secondResponse.Result.Response);

                    comicVineVolumeLists.Add(volumeList);
                    secondResponse = null;
                });
            }
            
        }

        if (this.MatchType == MatchType.AbsoluteMatch)
        {
        	ArrayList<ComicVineVolume> filteredComicVineVolumeLists = new ArrayList<ComicVineVolume>();
        	ArrayList<ComicVineVolume> filteredComicVineVolumeList = new ArrayList<ComicVineVolume>();

            foreach (var volumeList in comicVineVolumeLists)
            {
                foreach (var volume in volumeList)
                {
                    if (volume.name == volumeName)
                    {
                        filteredComicVineVolumeList.Add(volume);
                    }
                }
            }

            filteredComicVineVolumeLists.Add(filteredComicVineVolumeList);
            comicVineVolumeLists = filteredComicVineVolumeLists;
        }

        List<ComicVineVolume> comicVineVolumeList = new List<ComicVineVolume>();

        foreach (List<ComicVineVolume> comicVineVolume in comicVineVolumeLists)
        {
            comicVineVolumeList.AddRange(comicVineVolume);
        }
             */
        return comicVineVolumeList;
    }

    public ArrayList<ComicVineVolume> SearchVolume(String volumeName)
    {
    	
    	//ArrayList<ComicVineVolume> comicVineVolumeList = this.FindVolumeIdByName(volumeName);

        ArrayList<ComicVineVolume> comicVineVolumeBag = new ArrayList<ComicVineVolume>();
        /*
        int parallelThreads = SystemEnvironment.ProcessorCountOptimizedForEnvironment();

        Parallel.ForEach(comicVineVolumeList, new ParallelOptions() { MaxDegreeOfParallelism = parallelThreads }, comicVineVolume =>
        {
            try
            {
                if (comicVineVolume != null)
                {
                    comicVineVolumeBag.Add(this.GetComicVineVolume(comicVineVolume.id));
                }
            }
            catch (AggregateException aggregateException)
            {
                foreach (var exception in aggregateException.InnerExceptions)
                {
                    if (exception is ArgumentException)
                    {
                        // Don't act on this
                    }
                    else
                    {
                        throw exception;
                    }
                }
            }
        });

*/
        //return comicVineVolumeBag.ToList();
        return comicVineVolumeBag;
    }

    public ArrayList<ComicVineIssue> SearchIssue(String volumeName, int issueNumber)
    {
        ArrayList<ComicVineVolume> comicVineVolumeList = this.FindVolumeIdByName(volumeName);

        ArrayList<ComicVineIssue> comicVineIssueBag = new ArrayList<ComicVineIssue>();
        /*
        int parallelThreads = SystemEnvironment.ProcessorCountOptimizedForEnvironment();

        Parallel.ForEach(comicVineVolumeList, new ParallelOptions() { MaxDegreeOfParallelism = parallelThreads }, comicVineVolume =>
        {
            try
            {
                if (comicVineVolume != null)
                {
                    ComicVineIssue detailedComicVineIssue = this.GetComicVineIssue(comicVineVolume.id, issueNumber);

                    if (detailedComicVineIssue.issue_number == issueNumber.ToString())
                    {
                        comicVineIssueBag.Add(detailedComicVineIssue);
                    }
                }
            }
            catch (AggregateException aggregateException)
            {
                foreach (var exception in aggregateException.InnerExceptions)
                {
                    if (exception is ArgumentException)
                    {
                        // Don't act on this
                    }
                    else
                    {
                        throw exception;
                    }
                }
            }
        });
*/
        //return comicVineIssueBag.ToList();
        return comicVineIssueBag;
    }

    public ComicVineVolume GetComicVineVolume(int volumeId)
    {
        ComicVineVolume detailedComicVineVolume = new ComicVineVolume();
/*
        String query = null;

        if (this.SearchType == SearchType.Xml)
        {
            query = this.ComicVineAddress + "volume/" + volumeId.ToString() + "/?api_key=" + this.ComicVineKey + "&format=xml&field_list=id,api_detail_url,count_of_issues,description,image,name,publisher,start_year";
        }
        else
        {
            query = this.ComicVineAddress + "volume/" + volumeId.ToString() + "/?api_key=" + this.ComicVineKey + "&format=json&field_list=id,api_detail_url,count_of_issues,description,image,name,publisher,start_year";
        }

        Task<ComicVineResponse> firstResponse = ComicVineConnection.ConnectAndRequest(query);

        detailedComicVineVolume = ComicVineReader.GetVolume(this.SearchType, firstResponse.Result.Response);
*/
        return detailedComicVineVolume;
    }

    public ComicVineIssue GetComicVineIssue(int issueId, String issueTitle)
    {
        ComicVineIssue comicVineIssue = new ComicVineIssue();
/*
        String query = null;

        if (this.SearchType == SearchType.Xml)
        {
            query = this.ComicVineAddress + "issue/" + issueId.ToString() + "/?api_key=" + this.ComicVineKey + "&format=xml&field_list=id,api_detail_url,description,image,issue_number,name,person_credits,character_credits,cover_date,volume";
        }
        else
        {
            query = this.ComicVineAddress + "issue/" + issueId.ToString() + "/?api_key=" + this.ComicVineKey + "&format=json&field_list=id,api_detail_url,description,image,issue_number,name,person_credits,character_credits,cover_date,volume";
        }

        Task<ComicVineResponse> firstResponse = ComicVineConnection.ConnectAndRequest(query);

        comicVineIssue = ComicVineReader.GetIssue(this.SearchType, firstResponse.Result.Response, issueTitle);

*/
        return comicVineIssue;
    }

    public ComicVineIssue GetComicVineIssue(int volumeId, int issueNumber)
    {
        ComicVineIssue comicVineIssue = new ComicVineIssue();
        /*
        String query = null;
       
        if (this.SearchType == SearchType.Xml)
        {
            query = this.ComicVineBetaAddress + "issues/?api_key=" + this.ComicVineKey + "&format=xml&field_list=id,api_detail_url,issue_number,cover_date,name,image,person_credits,character_credits,volume&filter=issue_number:" + issueNumber.ToString() + ",volume:" + volumeId.ToString();
        }
        else
        {
            query = this.ComicVineBetaAddress + "issues/?api_key=" + this.ComicVineKey + "&format=json&field_list=id,api_detail_url,issue_number,cover_date,name,image,person_credits,character_credits,volume&filter=issue_number:" + issueNumber.ToString() + ",volume:" + volumeId.ToString();
        }

        Task<ComicVineResponse> firstResponse = ComicVineConnection.ConnectAndRequest(query);

        comicVineIssue = ComicVineReader.GetIssue(this.SearchType, firstResponse.Result.Response, issueNumber);
        */

        return comicVineIssue;
    }

	public String getComicVineKey() {
		return ComicVineKey;
	}

	public void setComicVineKey(String comicVineKey) {
		ComicVineKey = comicVineKey;
	}

	public MatchType getMatchType() {
		return MatchType;
	}

	public void setMatchType(MatchType matchType) {
		MatchType = matchType;
	}

	public SearchType getSearchType() {
		return SearchType;
	}

	public void setSearchType(SearchType searchType) {
		SearchType = searchType;
	}

	public String getSearchAddress() {
		return SearchAddress;
	}

	public void setSearchAddress(String searchAddress) {
		SearchAddress = searchAddress;
	}

	public String getComicVineAddress() {
		return ComicVineAddress;
	}

	public void setComicVineAddress(String comicVineAddress) {
		ComicVineAddress = comicVineAddress;
	}

	public String getComicVineBetaAddress() {
		return ComicVineBetaAddress;
	}

	public void setComicVineBetaAddress(String comicVineBetaAddress) {
		ComicVineBetaAddress = comicVineBetaAddress;
	}
    
}
