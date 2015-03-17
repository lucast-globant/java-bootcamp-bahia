db = connect("localhost:27017/high_school");

db.createCollection("teachers");
db.teachers.insert({fileNumber: 1, firstName: "Benjamin", lastName: "Garcia", dateOfBirth: new Date('1940,02,11')});
db.teachers.insert({fileNumber: 2, firstName: "Marcelo", lastName: "Falappa", dateOfBirth: new Date('1970,10,01')});

db.createCollection("courses");
db.courses.insert({idCourse: 1, courseName: "PHP", fileNumber: 1, hoursByWeek: 8, isFinished: false});
db.courses.insert({idCourse: 2, courseName: "Java", fileNumber: 2, hoursByWeek: 6, isFinished: false});

db.createCollection("students");
db.students.insert({registrationNumber: 1, firstName: "Amilcar", lastName: "Infante", dateOfBirth: new Date('1985,06,05')});
db.students.insert({registrationNumber: 2, firstName: "Luciano", lastName: "Aguirre", dateOfBirth: new Date('1992,11,05')});
db.students.insert({registrationNumber: 3, firstName: "Matias", lastName: "Haure", dateOfBirth: new Date('1990,05,19')});
db.students.insert({registrationNumber: 4, firstName: "Pedro", lastName: "Ruiz", dateOfBirth: new Date('1991,07,29')});
db.students.insert({registrationNumber: 5, firstName: "Luis", lastName: "Gil", dateOfBirth: new Date('1993,01,03')});
db.students.insert({registrationNumber: 6, firstName: "Carlos", lastName: "Quito", dateOfBirth: new Date('1987,03,14')});

db.createCollection("studentCourses");
db.studentCourses.insert({id: 1, registrationNumber: 1, idCourse: 1, note1: 10, note2: 10, note3: 10, finalNote: 10});
db.studentCourses.insert({id: 2, registrationNumber: 2, idCourse: 1, note1: 4, note2: 6, note3: 5, finalNote: 5});
db.studentCourses.insert({id: 3, registrationNumber: 3, idCourse: 1, note1: 7, note2: 8, note3: 9, finalNote: 8});
db.studentCourses.insert({id: 4, registrationNumber: 4, idCourse: 2, note1: 8, note2: 8, note3: 8, finalNote: 8});
db.studentCourses.insert({id: 5, registrationNumber: 5, idCourse: 2, note1: 10, note2: 10, note3: 10, finalNote: 10});
db.studentCourses.insert({id: 6, registrationNumber: 6, idCourse: 2, note1: 4, note2: 4, note3: 4, finalNote: 4});
db.studentCourses.insert({id: 7, registrationNumber: 1, idCourse: 2, note1: 6, note2: 7, note3: 8, finalNote: 7});
db.studentCourses.insert({id: 8, registrationNumber: 3, idCourse: 2, note1: 8, note2: 10, note3: 9, finalNote: 9});

db.createCollection("scheduleTimes");
db.schedules.insert({id: 1, idCourse: 1, nameOfDay: "Monday", startTime: "14:00", endTime: "18:00"});
db.schedules.insert({id: 2, idCourse: 1, nameOfDay: "Wednesday", startTime: "14:00", endTime: "18:00"});
db.schedules.insert({id: 3, idCourse: 2, nameOfDay: "Tuesday", startTime: "18:00", endTime: "21:00"});
db.schedules.insert({id: 4, idCourse: 2, nameOfDay: "Thursday", startTime: "18:00", endTime: "21:00"});

