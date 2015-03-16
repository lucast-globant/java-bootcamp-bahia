db = connect("localhost:27017/high-school");

db.students.drop();
db.createCollection("students");

db.students.insert({registrationNumber: 1, firstName: "name1", lastName: "lastname1", dateOfBirth: new Date('1990,12,29')});
db.students.insert({registrationNumber: 2, firstName: "name2", lastName: "lastname2", dateOfBirth: new Date('1991,05,15')});
db.students.insert({registrationNumber: 3, firstName: "name3", lastName: "lastname3", dateOfBirth: new Date('1989,10,13')});
db.students.insert({registrationNumber: 4, firstName: "name4", lastName: "lastname4", dateOfBirth: new Date('1990,02,09')});
db.students.insert({registrationNumber: 5, firstName: "name5", lastName: "lastname5", dateOfBirth: new Date('1992,11,23')});

db.teachers.drop();
db.createCollection("teachers");

db.teachers.insert({idTeacher: 1, firstName: "name1", lastName: "lastname1", dateOfBirth: new Date('1980,12,11')});
db.teachers.insert({idTeacher: 2, firstName: "name2", lastName: "lastname2", dateOfBirth: new Date('1981,09,25')});
db.teachers.insert({idTeacher: 3, firstName: "name3", lastName: "lastname3", dateOfBirth: new Date('1982,10,30')});

db.schedules.drop();
db.createCollection("schedules");

db.schedules.insert({idSchedule: 1, day: "Monday", initHour: "08:00", finishHour: "12:00"});
db.schedules.insert({idSchedule: 2, day: "Thuesday", initHour: "08:00", finishHour: "12:00"});
db.schedules.insert({idSchedule: 3, day: "Wednesday", initHour: "08:00", finishHour: "12:00"});

db.courses.drop();
db.createCollection("courses");

db.courses.insert({idCourse: 1, name: "course1", assignedTeacher: db.teachers.findOne( { idTeacher: 1 }), hoursByWeek: 4, scheduleTime: db.schedules.findOne( { idSchedule: 1 })});
db.courses.insert({idCourse: 2, name: "course1", assignedTeacher: db.teachers.findOne( { idTeacher: 2 }), hoursByWeek: 4, scheduleTime: db.schedules.findOne( { idSchedule: 2 })});
db.courses.insert({idCourse: 3, name: "course1", assignedTeacher: db.teachers.findOne( { idTeacher: 3 }), hoursByWeek: 4, scheduleTime: db.schedules.findOne( { idSchedule: 3 })});

db.notes.drop();
db.createCollection("notes");

db.notes.insert({course: db.courses.findOne( { idCourse: 1 }), student: db.students.findOne( { registrationNumber: 1 }), noteOne: 10, noteTwo: 9, noteThree: 7, finalNote: 8});
db.notes.insert({course: db.courses.findOne( { idCourse: 1 }), student: db.students.findOne( { registrationNumber: 2 }), noteOne: 10, noteTwo: 9, noteThree: 7, finalNote: 8});
db.notes.insert({course: db.courses.findOne( { idCourse: 1 }), student: db.students.findOne( { registrationNumber: 3 }), noteOne: 10, noteTwo: 9, noteThree: 7, finalNote: 8});
db.notes.insert({course: db.courses.findOne( { idCourse: 1 }), student: db.students.findOne( { registrationNumber: 4 }), noteOne: 10, noteTwo: 9, noteThree: 7, finalNote: 8});

db.notes.insert({course: db.courses.findOne( { idCourse: 2 }), student: db.students.findOne( { registrationNumber: 1 }), noteOne: 3, noteTwo: 4, noteThree: 5, finalNote: 4});
db.notes.insert({course: db.courses.findOne( { idCourse: 2 }), student: db.students.findOne( { registrationNumber: 3 }), noteOne: 2, noteTwo: 2, noteThree: 1, finalNote: 2});
db.notes.insert({course: db.courses.findOne( { idCourse: 2 }), student: db.students.findOne( { registrationNumber: 5 }), noteOne: 6, noteTwo: 6, noteThree: 6, finalNote: 6});

db.notes.insert({course: db.courses.findOne( { idCourse: 3 }), student: db.students.findOne( { registrationNumber: 2 }), noteOne: 9, noteTwo: 9, noteThree: 9, finalNote: 9});
db.notes.insert({course: db.courses.findOne( { idCourse: 3 }), student: db.students.findOne( { registrationNumber: 4 }), noteOne: 1, noteTwo: 1, noteThree: 1, finalNote: 1});