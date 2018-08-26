package entity;

import def.Constants;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Java class that matches with 'User' json object
 */
public class User {
    private int _id;
    private int organization_id;
    private boolean active;
    private boolean verified;
    private boolean shared;
    private boolean suspended;
    private String url;
    private String external_id;
    private String name;
    private String alias;
    private String created_at;
    private String locale;
    private String timezone;
    private String last_login_at;
    private String email;
    private String phone;
    private String signature;
    private String role;
    private String[] tags;

    public int getID() {
        return _id;
    }

    public int getOrganizationID() {
        return organization_id;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isVerified() {
        return verified;
    }

    public boolean isShared() {
        return shared;
    }

    public boolean isSuspended() {
        return suspended;
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

    public String getAlias() {
        return alias;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getLocale() {
        return locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getLastLoginAt() {
        return last_login_at;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSignature() {
        return signature;
    }

    public String[] getTags() {
        return tags;
    }

    public String getRole() {
        return role;
    }

    public ArrayList<String> getAllValues() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(_id + "");
        arrayList.add(active + "");
        arrayList.add(verified + "");
        arrayList.add(shared + "");
        arrayList.add(suspended + "");
        arrayList.add(url);
        arrayList.add(external_id);
        arrayList.add(name);
        arrayList.add(alias);
        arrayList.add(created_at);
        arrayList.add(locale);
        arrayList.add(timezone);
        arrayList.add(last_login_at);
        arrayList.add(email);
        arrayList.add(phone);
        arrayList.add(signature);
        arrayList.add(role);

        Collections.addAll(arrayList, tags);

        return arrayList;
    }

    public void show() {
        System.out.println("--------------- User Information ---------------");
        System.out.println("ID : " + _id);
        System.out.println("URL : " + url);
        System.out.println("External ID : " + external_id);
        System.out.println("Name : " + name);
        System.out.println("Alias : " + alias);
        System.out.println("Created at : " + created_at);
        System.out.println("Active : " + (active ? "Yes" : "No"));
        System.out.println("Verified : " + (verified ? "Yes" : "No"));
        System.out.println("Shared : " + (shared ? "Yes" : "No"));
        System.out.println("Locale : " + locale);
        System.out.println("Timezone : " + timezone);
        System.out.println("Last Login : " + last_login_at);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Signature : " + signature);
        System.out.println("Organization ID : " + organization_id);
        System.out.println("Tags : " + String.join(Constants.STRING_ARRAY_DELIMITER, tags));
        System.out.println("Suspended : " + (suspended ? "True" : "False"));
        System.out.println("Role : " + role);
        System.out.println();
    }
}
