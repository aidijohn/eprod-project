PROJECT NAME:  eprodhighschool
AUTHOR:	JOHN ODHIAMBO

How to run
----------
(Spring boot project running on Mysql database {Postgres}).

1. Open PostgreSql and create new database named eprod.
 -In the database use username 'postgres' and password 'eprod'
2. Open application with editor (preferably Intellij).
3. Run application.


API END-POINTS USED
-------------------
@PostMapping("/create")
Creates new student inside new class.

@PutMapping("/update")
Updating existing student details.

@GetMapping("/{name}")
Used to find or search existing student by name.

@DeleteMapping("/delete")
Delete existing student details from class.
