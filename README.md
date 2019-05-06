# csumb.499.MasterScheduler-Credentials
   
## Overview
### Description
California State University Capstone Project, Salinas Union High School District Sponsored. Micro service for the Master Scheduler App.
The Master scheduler app is a tool implemented for the Administrative team. This app makes it easier for the admin team to generate the school schedule. 

This administrative micro services handels all of the insert, updates, and deletes request for the student, classes, teachers, and section objects. 
Micro service is deployed on Heroku.  https://master-scheduler-admin.herokuapp.com/

### 1. User Stories (Required and Optional)

**Required Must-have Stories**
  - [X] User can be created
  - [X] User can Log in

**Optional Nice-to-have Stories**
  - [ ] Secure connection from micro-service and Master Scheduler App
  - [ ] Saving a user's information securely
## Schema 

### Models
#### User
|Property|Type|Description|
|---|---|---|
|id|String|Id of the user. Database Primary key|
|name|String|Name of user|
|username|String|Username for user log in|
|password|String|Password  for user log in|
|email|String|Email for user|