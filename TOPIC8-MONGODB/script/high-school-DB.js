db = connect("localhost:3306/high-school");



db.teacher.drop();
db.createCollection("teacher");

db.teacher.insert({teacherId: 1, firstName: "n1", lastName: "l1", dateOfBirth: new Date('1999,12,11')});
db.teacher.insert({teacherId: 2, firstName: "n2", lastName: "l2", dateOfBirth: new Date('1998,06,4')});
db.teacher.insert({teacherId: 3, firstName: "n3", lastName: "l3", dateOfBirth: new Date('1900,10,30')});

db.student.drop();
db.createCollection("student");

db.student.insert({registrationNumber: 1, firstName: "n1", lastName: "l1", dateOfBirth: new Date('1991,12,29')});
db.student.insert({registrationNumber: 2, firstName: "n2", lastName: "l2", dateOfBirth: new Date('1993,05,15')});
db.student.insert({registrationNumber: 3, firstName: "n3", lastName: "l3", dateOfBirth: new Date('1951,10,13')});
db.student.insert({registrationNumber: 4, firstName: "n4", lastName: "l4", dateOfBirth: new Date('1999,03,09')});
db.student.insert({registrationNumber: 5, firstName: "n5", lastName: "l5", dateOfBirth: new Date('1992,1,23')});

db.schedule.drop();
db.createCollection("schedule");

db.schedule.insert({scheduleId: 1, day: "Monday", hourStart: "08:00", hourEnd: "12:00"});
db.schedule.insert({scheduleId: 2, day: "Thuesday", hourStart: "08:00", hourEnd: "12:00"});
db.schedule.insert({scheduleId: 3, day: "Wednesday", hourStart: "08:00", hourEnd: "12:00"});

db.course.drop();
db.createCollection("course");

db.course.insert({courseId: 1, name: "course1", teacherAssigned: db.teacher.findOne( { teacherId: 1 }), hoursByWeek: 8, scheduleTime: db.schedule.findOne( { scheduleId: 1 })});
db.course.insert({courseId: 2, name: "course2", teacherAssigned: db.teacher.findOne( { teacherId: 2 }), hoursByWeek: 8, scheduleTime: db.schedule.findOne( { scheduleId: 2 })});
db.course.insert({courseId: 3, name: "course3", teacherAssigned: db.teacher.findOne( { teacherId: 3 }), hoursByWeek: 12, scheduleTime: db.schedule.findOne( { scheduleId: 3 })});

db.note.drop();
db.createCollection("note");

db.note.insert({course: db.course.findOne( { courseId: 1 }), student: db.student.findOne( { registrationNumber: 1 }), partialNote1: 7, partialNote2: 9, partialNote3: 7, finalNote: 8});
db.note.insert({course: db.course.findOne( { courseId: 1 }), student: db.student.findOne( { registrationNumber: 2 }), partialNote1: 7, partialNote2: 9, partialNote3: 7, finalNote: 7});
db.note.insert({course: db.course.findOne( { courseId: 1 }), student: db.student.findOne( { registrationNumber: 3 }), partialNote1: 6, partialNote2: 9, partialNote3: 7, finalNote: 9});
db.note.insert({course: db.course.findOne( { courseId: 1 }), student: db.student.findOne( { registrationNumber: 4 }), partialNote1: 6, partialNote2: 9, partialNote3: 7, finalNote: 8});

db.note.insert({course: db.course.findOne( { courseId: 2 }), student: db.student.findOne( { registrationNumber: 1 }), partialNote1: 3, partialNote2: 4, partialNote3: 5, finalNote: 4});
db.note.insert({course: db.course.findOne( { courseId: 2 }), student: db.student.findOne( { registrationNumber: 3 }), partialNote1: 1, partialNote2: 5, partialNote3: 1, finalNote: 2});
db.note.insert({course: db.course.findOne( { courseId: 2 }), student: db.student.findOne( { registrationNumber: 5 }), partialNote1: 6, partialNote2: 6, partialNote3: 6, finalNote: 6});

db.note.insert({course: db.course.findOne( { courseId: 3 }), student: db.student.findOne( { registrationNumber: 2 }), partialNote1: 10, partialNote2: 9, partialNote3: 8, finalNote: 9});
db.note.insert({course: db.course.findOne( { courseId: 3 }), student: db.student.findOne( { registrationNumber: 4 }), partialNote1: 1, partialNote2: 1, partialNote3: 1, finalNote: 1});