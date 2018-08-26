# Search-CLI
## Task
Using the provided data (tickets.json and users.json and organization.json)
write a simple command line application to search the data and return the results
 in a human readable format.
 
Where the data exists, values from any related entities should be included 
in the results. The user should be able to search on any field, full value 
matching is fine (e.g. "mar" won’t return "mary"). 
The user should also be able to search for empty values, 
e.g. where description is empty.
 
#### Assumption
* User will be searching in pre-defined format
* An entity will always have all set of fields

eg: If a 'User' entity has a field named 'name', all 'User' entities will have 
'name' field

## Approach

Reading files for each user query is less efficient. Therefore, all information is 
stored in memory. As a functionality improvement, partial value matching also has 
been added to the application.
(eg: name=Bob will return all entities that has 'Bob' in the 'name' field)

* Maven has been used to handling dependencies
* Application will ignore empty lines and lines that contains '//'
* Application will terminate upon entering '#' to stdin


##### Steps
1. Load app configurations via Singleton ConfigManager using 
`config.properties` file
2. Read all JSON files and store in memory
3. Read user input and separate field to be searched and value that should be matched
4. Search all entities that has given field and compare searching value
5. If there exists a match, add it to search result list
6. Display search results by entity

### Installation Guide

> Prerequisites: Maven
- Clone the repository.
- Make sure that json files are in correct location(json_dir) .
and has correct file name as defined in `config.properties` file.
- Goto cloned directory where pom.xml file is located and in command line, enter  command:
`mvn clean compile install`
- When the command is executing, it will download dependencies, execute all unit
tests and executable jar fill will be generated in `target` directory.
- Execute jav by following command.

`$ java -jar target/search-cli-1.0-SNAPSHOT.jar`
- Executing jar will give following output.

`$ Please enter search query in filed=value format. To exit, enter '#'`

- Enter query in prompted format and if there are any matches, they will be 
shown on stdout.


```$xslt
$ Please enter search query in filed=value format. To exit, enter '#'
 _id=922
 ------------ Search Results ------------
 
 _id=101
 ------------ Search Results ------------
 
 ------ Result count: Organization[1]
 --------------- Organization Information ---------------
 ID : 101
 URL : http://initech.zendesk.com/api/v2/organizations/101.json
 External ID :9270ed79-35eb-4a38-a46f-35725197ea8d
 Name : Enthaze
 Domain names : kage.com, ecratic.com, endipin.com, zentix.com
 Created at : 2016-05-21T11:10:28 -10:00
 Details : MegaCorp
 Shared tickets : False
 Tags : Fulton, West, Rodriguez, Farley
```
- For searching empty fields, submit query as `filed=` format.

```$xslt
Please enter search query in filed=value format. To exit, enter '#'
name=
[INFO] Ticket does not have a field as 'name'
------------ Search Results ------------

------ Result count: User[1]
--------------- User Information ---------------
ID : 1
URL : http://initech.zendesk.com/api/v2/users/1.json
External ID : 74341f74-9c79-49d5-9611-87ef9b6eb75f
Name : 
Alias : Miss Coffey
Created at : 2016-04-15T05:19:46 -10:00
Active : Yes
Verified : Yes
Shared : No
Locale : en-AU
Timezone : Sri Lanka
Last Login : 2013-08-04T01:03:27 -10:00
Email : coffeyrasmussen@flotonic.com
Phone : 8335-422-718
Signature : Don't Worry Be Happy!
Organization ID : 119
Tags : Springville, Sutton, Hartsville/Hartley, Diaperville
Suspended : True
Role : admin
```

**Note:**

* Field should be same as field defined in json file.
* Value string is case insensitive
* Search results will contain all matching values including partial matches

### Configuration definitions (config.properties)
>json_dir : Location of JSON files

>file_name_organizations : name of JSON file contains Organizations

>file_name_tickets=tickets.json : name of JSON file contains Tickets

>file_name_users=users.json : name of JSON file contains Users

### Dependencies

* JUnit 4.12
* Mockito 2.21.0
* Google gson 2.8.5