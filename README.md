**Problem Statement**


Tracking your personal statistics in a game of dota is a daunting task. Each match contains hundreds of separate stats that
all reflect you and your teams performance of a given match. Ultimately, a player would benefit from a condensed and easy 
to read version of those those statistics to track their progress.

dotaStats is will offer Dota players an easy way to access their personal statistics and compare them to the averages
of the world. dotaStats will offer an edge over opponents by allowing users to access opposing players stats and play 
history.   

**Change To Initial Product** 

Ultimately the end product of dotaStats will contain a larger array of statistics. Currently our goal is to provide a concise
display of match information and statistics. You will be able to view matches from your last 50 matches. 

### Design

* [User Stories](designDocuments/userStories.md)
* [Screen Design](designDocuments/screens.md)

### Project Technologies/Techniques

* Security/roles
    * Tomcat's JDBC Realm Authentication
    * Admin role: create other admins, delete user
    * User role: View stats, Save Fav Matches
* Database
    * Mysql
    * Store Users/Roles/Favorite Matches
* ORM
    * Hibernate
*CSS
    * Bootstrap
* Data Validation
    * Hibernate Validator
*Logging
    * Log4j
* Hosting
    * AWS
* Additional Tools
    * OpenDotaApi
* Unit Testing
    * JUnit - 50% Code Coverage
    
### [Project Plan](ProjectPlan.md)

### [Development Journal](Journal.md)
### Link to Project Rundown 
https://www.youtube.com/watch?v=Fjgh_T5HGG8
    
    

