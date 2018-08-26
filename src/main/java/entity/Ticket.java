package entity;

import def.Constants;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Java class that matches with 'Ticket' json object
 */
public class Ticket {
    private int submitter_id;
    private int assignee_id;
    private int organization_id;
    private boolean has_incidents;
    private String _id;
    private String url;
    private String external_id;
    private String created_at;
    private String type;
    private String subject;
    private String description;
    private String priority;
    private String status;
    private String due_at;
    private String via;
    private String[] tags;

    public int getSubmitterID() {
        return submitter_id;
    }

    public int getAssigneeID() {
        return assignee_id;
    }

    public int getOrganizationID() {
        return organization_id;
    }

    public boolean hasIncidents() {
        return has_incidents;
    }

    public String getID() {
        return _id;
    }

    public String getUrl() {
        return url;
    }

    public String getExternalID() {
        return external_id;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getType() {
        return type;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public String getDueAt() {
        return due_at;
    }

    public String getVia() {
        return via;
    }

    public String[] getTags() {
        return tags;
    }

    public ArrayList<String> getAllValues() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(submitter_id + "");
        arrayList.add(assignee_id + "");
        arrayList.add(organization_id + "");
        arrayList.add(has_incidents + "");
        arrayList.add(_id);
        arrayList.add(url);
        arrayList.add(external_id);
        arrayList.add(created_at);
        arrayList.add(type);
        arrayList.add(subject);
        arrayList.add(description);
        arrayList.add(priority);
        arrayList.add(status);
        arrayList.add(due_at);
        arrayList.add(via);

        Collections.addAll(arrayList, tags);

        return arrayList;
    }

    public void show() {
        System.out.println("--------------- Ticket Information ---------------");
        System.out.println("ID : " + _id);
        System.out.println("URL : " + url);
        System.out.println("External ID : " + external_id);
        System.out.println("Created at : " + created_at);
        System.out.println("Type : " + type);
        System.out.println("Subject : " + subject);
        System.out.println("Description : " + description);
        System.out.println("Priority : " + priority);
        System.out.println("Status : " + status);
        System.out.println("Submitter ID : " + submitter_id);
        System.out.println("Assignee ID : " + assignee_id);
        System.out.println("Organization ID : " + organization_id);
        System.out.println("Tags : " + String.join(Constants.STRING_ARRAY_DELIMITER, tags));
        System.out.println("Has Incidents : " + (has_incidents ? "True" : "False"));
        System.out.println("Due at : " + due_at);
        System.out.println("Via : " + via);
        System.out.println();
    }
}
