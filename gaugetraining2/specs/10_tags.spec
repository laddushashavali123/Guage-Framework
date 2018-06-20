Tags
=====================
tags: group_1

Tags can be used for creating test groups/suites

Try the following ones:

mvn clean test -Dtags="group_1"
mvn clean test -Dtags="group_2 & group_4"
mvn clean test -Dtags="group_2 | group_4"
     
Scenario with inherited tag
----------------
* This step should print "scenario with inherited tag: group_1"

Scenario group 2 and group 3
----------------
tags: group_2, group_3

* This step should print "scenario tagged with group_2, group_3 and inherited group_1"

Scenario group 2 and group 4
----------------
tags: group_2, group_4
* This step should print "scenario tagged with group_2, group_4 and inherited group_1"
