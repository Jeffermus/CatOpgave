package com.example.demo.services;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CatServices {
    ArrayList<CatFact> array = new ArrayList<CatFact>();
    public String fetchData() throws IOException, MalformedURLException {
        //Choose what API to consume
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        //Map the data from Json to an object
        CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
        //Close the BufferedReader
        inputFromCatURL.close();
        String test = data.toString();

        return test;
//        System.out.println(data.toString());
    }
    public ArrayList<CatFact> multiFetchData() throws IOException, MalformedURLException {
        //Choose what API to consume
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL2 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL3 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL4 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL5 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL6 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL7 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL8 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL9 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL10 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        //Map the data from Json to an object


        array.add(new Gson().fromJson((Reader) inputFromCatURL, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL2, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL3, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL4, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL5, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL6, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL7, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL8, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL9, (Type) CatFact.class));
        array.add(new Gson().fromJson((Reader) inputFromCatURL10, (Type) CatFact.class));

        inputFromCatURL.close();

        return array;



    }




    public CatFact getOne() throws IOException {
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));

        return ( new Gson().fromJson((Reader) inputFromCatURL, (Type) CatFact.class));





    }

}

