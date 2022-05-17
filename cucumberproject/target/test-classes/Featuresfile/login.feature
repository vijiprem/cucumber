Feature: To Validate facebook Login Functionalies

Background:

Given check login through chrome browser

Scenario: To Validate Username and Password
When To Validate valid username and  valid password
Then click login 
@smoke
Scenario Outline: To Validate UserName and Passcode
 

When To Validate facebook "<username>" and  "<password>"
Then click facebook login 





Examples:
|username|password|
|viji|12345|
|aarthy|6789|
|pavi|dhanya|

@data1d
Scenario:

To validate fb login through data table

When To login with userName and password

   |dhanya|shree|kgijnm|dfjgk|
Then click login
@data2d
Scenario:

To validate 2d data fb login through data table

When To login userName and password
   |viji|pavi|prem|vimala|
   |dhanya|shree|kgijnm|dfjgk|
Then click login

@data1dheader
Scenario:

To fb login through data table 1d map

When To login with datatable map userName and password
|user|viji|
  |pass |dhanya|
Then click login


@data2dheader
Scenario:

To fb login through data table 2d map

When To login with datatable 2dmap userName and password
|user|pass|
|parthu|viji|
  |maran |dhanya|
Then click login