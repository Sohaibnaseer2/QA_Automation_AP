package com.apdr.utalities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;

public class DataUtils {

    //read content data json file and get content for video file

    @DataProvider
    public Object[] videoDataProvider() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj=null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/contentData.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray formInfo = (JSONArray) jsonObject.get("video-content");
        // String array to store JSONArray data
        String[] dataArray = new String[formInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _slug, _headline,_source,_body;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < formInfo.size(); i++) {
            formInfoData = (JSONObject) formInfo.get(i);
            _slug= (String) formInfoData.get("slug");
            _headline = (String) formInfoData.get("headline");
            _source = (String) formInfoData.get("source");
            _body = (String) formInfoData.get("body");

            dataArray[i] = _slug + "," + _headline + "," + _source + "," + _body;
        }
        return  dataArray;

    }

    //Read content data json file and get audio file content

    @DataProvider
    public Object[] audioDataProvider() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj=null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/contentData.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray audioInfo = (JSONArray) jsonObject.get("audio-content");
        // String array to store JSONArray data
        String[] dataArray = new String[audioInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _slugA, _headlineA, _sourceA, _bodyA;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < audioInfo.size(); i++) {
            formInfoData = (JSONObject) audioInfo.get(i);
            _slugA= (String) formInfoData.get("slug");
            _headlineA = (String) formInfoData.get("speaker");
            _sourceA = (String) formInfoData.get("intro");


            dataArray[i] = _slugA + "," + _headlineA + "," + _sourceA;
        }
        return  dataArray;

    }

    //Read loginjson file and get admin related data
    @DataProvider
    public Object[] adminCredentials() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/logindata.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray adminInfo = (JSONArray) jsonObject.get("Admin");
        // String array to store JSONArray data
        String[] dataArray = new String[adminInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _email, _password, _role, _machineReadableName;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < adminInfo.size(); i++) {
            formInfoData = (JSONObject) adminInfo.get(i);
            _email = (String) formInfoData.get("email");
            _password = (String) formInfoData.get("password");
            _role = (String) formInfoData.get("role");
            _machineReadableName = (String) formInfoData.get("machineReableName");

            dataArray[i] = _email + "," + _password + "," + _role + "," + _machineReadableName;
        }
        return dataArray;
    }

    //Image data provider
    @DataProvider
    public Object[] imageDataProvider() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj=null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/contentData.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray audioInfo = (JSONArray) jsonObject.get("image-content");
        // String array to store JSONArray data
        String[] dataArray = new String[audioInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _slug, _caption, _instruction, _country, _state,_city,_byline, _bytitle,_source,_creditline,_copywrite,_transref,_suppCat,_Alttext;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < audioInfo.size(); i++) {
            formInfoData = (JSONObject) audioInfo.get(i);
            _slug= (String) formInfoData.get("slug");
            _caption = (String) formInfoData.get("Caption");
            _instruction= (String) formInfoData.get("Instructions");
            _country= (String) formInfoData.get("Country");
            _state = (String) formInfoData.get("State");
            _city = (String) formInfoData.get("city");
            _byline= (String) formInfoData.get("Byline");
            _bytitle = (String) formInfoData.get("Bytitile");
            _source = (String) formInfoData.get("source");
            _creditline= (String) formInfoData.get("Credit line");
            _copywrite = (String) formInfoData.get("Copywrite notice");
            _transref = (String) formInfoData.get("Transref");
            _suppCat = (String) formInfoData.get("Supp. Cat");
            _Alttext = (String) formInfoData.get("AltText");

            dataArray[i] = _slug + "," + _caption + "," + _instruction+","+_country+","+_state+","+_city+","+_byline+","+_bytitle+","+_source+
            ","+_creditline+","+_copywrite+","+_transref+","+_suppCat+","+_Alttext+";";
        }
        return  dataArray;
    
    }

    //News alert data reader
    //Read loginjson file and get admin related data
    @DataProvider
    public Object[] newsAlertContent() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj=null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/contentData.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray newsInfo = (JSONArray) jsonObject.get("news-alert");

        // String array to store JSONArray data
        String[] dataArray = new String[newsInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _slug, _alert, _dateLine,_edsNote;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < newsInfo.size(); i++) {
            formInfoData = (JSONObject) newsInfo.get(i);
            _slug = (String) formInfoData.get("slug");
            _alert = (String) formInfoData.get("Alert");
            _dateLine = (String) formInfoData.get("Dateline");
            _edsNote = (String) formInfoData.get("edsNote");

            dataArray[i] = _slug + "," + _alert + "," + _dateLine + "," + _edsNote;
        }
        return dataArray;
    }

    //News story data reader
    //Read loginjson file and get admin related data
    @DataProvider
    public Object[] newsStoryContent() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj=null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/contentData.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray newsInfo = (JSONArray) jsonObject.get("news-story");

        // String array to store JSONArray data
        String[] dataArray = new String[newsInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _slug, _headline, _dateLine,_summary, _body,_byline,_bytitle,_dateline,_edsnote;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < newsInfo.size(); i++) {
            formInfoData = (JSONObject) newsInfo.get(i);
            _slug = (String) formInfoData.get("slug");
            _headline = (String) formInfoData.get("headline");
            _summary = (String) formInfoData.get("summary");
            _body = (String) formInfoData.get("body");
            _byline = (String) formInfoData.get("Byline");
            _bytitle = (String) formInfoData.get("Bytitile");
            _dateline = (String) formInfoData.get("Dateline");
            _edsnote = (String) formInfoData.get("edsNote");

            dataArray[i] = _slug + "," + _headline + "," + _summary + "," + _body+","+_byline + "," + _bytitle + "," + _dateline + "," + _edsnote;
        }
        return dataArray;
    }

        //Read loginjson file and get user role related data
        @DataProvider
        public Object[] addUserData() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        // Read JSON file and after parsing store in java object
        //java object
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(System.getProperty("user.dir") +"/TestData/logindata.json"));
            //Parse java object to json object
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        jsonObject = (JSONObject) obj;

        // Extract array data from JSONObject
        assert jsonObject != null;
        JSONArray adminInfo = (JSONArray) jsonObject.get("add-user");
        // String array to store JSONArray data
        String[] dataArray = new String[adminInfo.size()];

        // JSONObject to read each JSONArray object
        JSONObject formInfoData;
        String _email, _password, _org, _orgId, _mdmid, _userId,_lastName,_firstName,_sysRole;

        // Get data from JSONArray and store it in String array
        for (int i = 0; i < adminInfo.size(); i++) {
            formInfoData = (JSONObject) adminInfo.get(i);
            _email = (String) formInfoData.get("email");
            _password = (String) formInfoData.get("password");
            _org = (String) formInfoData.get("org");
            _orgId = (String) formInfoData.get("orgId");
            _mdmid = (String) formInfoData.get("mdmid");
            _userId = (String) formInfoData.get("userId");
            _lastName = (String) formInfoData.get("lastName");
            _firstName = (String) formInfoData.get("firstName");
            _sysRole = (String) formInfoData.get("systemRole");
            dataArray[i] = _email + "," + _password + "," + _org + "," + _orgId+","+_mdmid+","+_userId+","+_lastName+","+_firstName+","+_sysRole;
        }
        return dataArray;
    }

}
