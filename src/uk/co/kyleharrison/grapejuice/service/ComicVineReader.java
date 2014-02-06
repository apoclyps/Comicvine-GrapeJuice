package uk.co.kyleharrison.grapejuice.service;

import java.util.ArrayList;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineIssue;
import uk.co.kyleharrison.grapejuice.comicvine.ComicVineResponseData;
import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.json.JSONReadIssues;
import uk.co.kyleharrison.grapejuice.json.JSONReadVolumeQuery;
import uk.co.kyleharrison.grapejuice.xml.XMLReadIssue;
import uk.co.kyleharrison.grapejuice.xml.XMLReadVolumeQuery;

public class ComicVineReader {

	 public static ComicVineResponseData GetFirstVolumeQueryResponse(SearchType searchType, String data)
     {
         if (searchType == null)
         {
             throw new NullPointerException("searchType");
         }
         
         if (data == null)
         {
             throw new NullPointerException("data");
         }
		 
         ComicVineResponseData comicVineResponseData = null;
         
         if (searchType == SearchType.Xml)
         {
             comicVineResponseData = XMLReadVolumeQuery.GetFirstVolumeQueryResponse(data);
         }
         else
         {
             comicVineResponseData = JSONReadVolumeQuery.GetFirstVolumeQueryResponse(data);
         }

         return comicVineResponseData;
     }
	 
	 public static ArrayList<ComicVineVolume> GetVolumeQueryResponse(SearchType searchType, String data)
     {
         if (searchType == null)
         {
             throw new NullPointerException("searchType");
         }

         if (data == null)
         {
             throw new NullPointerException("data");
         }

         ArrayList<ComicVineVolume> comicVineVolumeList = null;

         if (searchType == SearchType.Xml)
         {
             comicVineVolumeList = XMLReadVolumeQuery.GetVolumeQueryResponse(data);
         }
         else
         {
             comicVineVolumeList = JSONReadVolumeQuery.GetVolumeQueryResponse(data);
         }

         return comicVineVolumeList;
     }

     public static ComicVineVolume GetVolume(SearchType searchType, String data)
     {
         if (searchType == null)
         {
             throw new NullPointerException("searchType");
         }

         if (data == null)
         {
             throw new NullPointerException("data");
         }

         ComicVineVolume detailedComicVineVolume = new ComicVineVolume();

         if (searchType == SearchType.Xml)
         {
             detailedComicVineVolume = XMLReadVolumeQuery.GetVolume(data);
         }
         else
         {
             detailedComicVineVolume = JSONReadVolumeQuery.GetVolume(data);
         }

         return detailedComicVineVolume;
     }

     public static ComicVineIssue GetIssue(SearchType searchType, String data, String issueTitle)
     {
         if (searchType == null)
         {
             throw new NullPointerException("searchType");
         }

         if (data == null)
         {
             throw new NullPointerException("data");
         }

         if (issueTitle == null)
         {
             throw new NullPointerException("issueTitle");
         }

         ComicVineIssue comicVineIssue = null;

         if (searchType == SearchType.Xml)
         {
             comicVineIssue = XMLReadIssue.GetIssue(data);
         }
         else
         {
             comicVineIssue = JSONReadIssues.GetIssue(data, issueTitle);
         }

         return comicVineIssue;
     }

     public static ComicVineIssue GetIssue(SearchType searchType, String data, Integer issueNumber)
     {
         if (searchType == null)
         {
             throw new NullPointerException("searchType");
         }

         if (data == null)
         {
             throw new NullPointerException("data");
         }

         if (issueNumber==null)
         {
             throw new NullPointerException("issueNumber");
         }

         ComicVineIssue ComicVineIssue = null;

         if (searchType == SearchType.Xml)
         {
             ComicVineIssue = XMLReadIssue.GetIssue(data);
         }
         else
         {
             ComicVineIssue = JSONReadIssues.GetIssue(data);
         }

         return ComicVineIssue;
     }
}
