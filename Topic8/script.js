print("STARTING SCRIPT");
conn = new Mongo("localhost");

//Name of the data base
db = conn.getDB("mydbscript");

/*Clean data base in case it exist*/
db.dropDatabase();
print("LOADING STUDENT...");
db.student.insert({
	_id: 1,
	first_name:"PENELOPE", 
	last_name:"GUINESS",
	date_of_birth: new Date("1984,10,21")
	});

db.student.insert({
	_id: 2,
	first_name:"JOHNNY", 
	last_name:"LOLLOBRIGIDA",
	date_of_birth: new Date("1970,02,15")
	});
	
db.student.insert({
	_id: 3,
	first_name:"BETTE", 
	last_name:"NICHOLSON",
	date_of_birth: new Date("1986,02,15")
	});
print("LOADING TEACHERS...");
db.teacher.insert({
	_id: 1,
	first_name:"BELA", 
	last_name:"WALKEN",
	date_of_birth: new Date("1954,10,21")
	});
db.teacher.insert({
	_id: 2,
	first_name:"HELEN", 
	last_name:"VOIGHT",
	date_of_birth: new Date("1954,10,21")
	});
print("LOADING COURSES...");
db.course.insert({
	_id: 1,
	name:"PHYSICS", 
	teacher: 1,
	hours_week: 8,
	schedule_time: 2,
	date_of_birth: new Date("2015,10,21"),
	estudents:[{
		student_id: 1,
		first_parcial:60,
		second_parcial:60,
		third_parcial:60,
		final_exam:100
		},{
		student_id: 2,
		first_parcial:70,
		second_parcial:70,
		third_parcial:70,
		final_exam:80
	},{
		student_id: 3,
		first_parcial:70,
		second_parcial:70,
		third_parcial:70,
		final_exam:20
	}]
	});
db.course.insert({	
	_id: 2,
	name:"MATHEMATICS", 
	teacher: 1,
	hours_week: 8,
	schedule_time: 2,
	date_of_birth: new Date("2015,10,21"),
	estudents:[{
		student_id: 1,
		first_parcial:60,
		second_parcial:60,
		third_parcial:60,
		final_exam:100
		},{
		student_id: 2,
		first_parcial:70,
		second_parcial:70,
		third_parcial:70,
		final_exam:80
	},{
		student_id: 3,
		first_parcial:70,
		second_parcial:70,
		third_parcial:70,
		final_exam:20
	}]
	});
	
db.course.insert({	
	_id: 3,
	name:"OPERATIVE SYSTEMS", 
	teacher: 2,
	hours_week: 8,
	schedule_time: 2,
	date_of_birth: new Date("2015,10,21"),
	estudents:[{
		student_id: 1,
		first_parcial:60,
		second_parcial:60,
		third_parcial:60,
		final_exam:100
		},{
		student_id: 2,
		first_parcial:70,
		second_parcial:70,
		third_parcial:70,
		final_exam:80
	},{
		student_id: 3,
		first_parcial:70,
		second_parcial:70,
		third_parcial:70,
		final_exam:20
	}]
	});