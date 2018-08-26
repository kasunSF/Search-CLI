package entity;

import def.Constants;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Java class that matches with 'Organization' json object
 */
public class Organization {
    private int _id;
    private boolean shared_tickets;
    private String url;
    private String external_id;
    private String name;
    private String created_at;
    private String details;
    private String[] tags;
    private String[] domain_names;

    public int getID() {
        return _id;
    }

    public String getUrl() {
        return url;
    }

    public String getExternalID() {
        return external_id;
    }

    public String getName() {
        return name;
    }

    public String[] getDomainNames() {
        return domain_names;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getDetails() {
        return details;
    }

    public boolean isSharedTickets() {
        return shared_tickets;
    }

    public String[] getTags() {
        return tags;
    }

    public ArrayList<String> getAllValues() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(_id + "");
        arrayList.add(shared_tickets + "");
        arrayList.add(url);
        arrayList.add(external_id);
        arrayList.add(name);
        arrayList.add(created_at);
        arrayList.add(details);

        Collections.addAll(arrayList, tags);
        Collections.addAll(arrayList, domain_names);

        return arrayList;
    }

    public void show() {
        System.out.println("--------------- Organization Information ---------------");
        System.out.println("ID : " + _id);
        System.out.println("URL : " + url);
        System.out.println("External ID :" + external_id);
        System.out.println("Name : " + name);
        System.out.println("Domain names : " + String.join(Constants.STRING_ARRAY_DELIMITER, domain_names));
        System.out.println("Created at : " + created_at);
        System.out.println("Details : " + details);
        System.out.println("Shared tickets : " + (shared_tickets ? "True" : "False"));
        System.out.println("Tags : " + String.join(Constants.STRING_ARRAY_DELIMITER, tags));
        System.out.println();
    }
}
