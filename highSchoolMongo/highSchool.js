db = db.getSiblingDB("HighSchool");
db.createCollection("Course")
db.createCollection("Teacher")
db.createCollection("Student")
db.createCollection("Note")
db.Note.createIndex( { studentId: 1} )
db.Note.createIndex( { courseId: 1} )
db.Note.createIndex( { year: 1} )

db.Course.insert({_id: 1, name: "Science", hoursByWeek: 8, teacherId: 1,
					schedule: 	[
						{
							day: "Monday",
							fromHour: "12:00:00",
							toHour: "14:00:00"
						},
						{
							day: "Tuesday",
							fromHour: "15:00:00",
							toHour: "17:00:00"
						},
						{
							day: "Wednesday",
							fromHour: "14:00:00",
							toHour: "16:00:00"
						},
						{
							day: "Friday",
							fromHour: "08:00:00",
							toHour: "10:00:00"
						}
					]
})
db.Course.insert({_id: 2, name: "History", hoursByWeek: 10, teacherId: 3,
					schedule: 	[
						{
							day: "Monday",
							fromHour: "08:00:00",
							toHour: "10:00:00"
						},
						{
							day: "Tuesday",
							fromHour: "08:30:00",
							toHour: "10:30:00"
						},
						{
							day: "Thursday",
							fromHour: "10:00:00",
							toHour: "12:00:00"
						},
						{
							day: "Friday",
							fromHour: "14:00:00",
							toHour: "16:00:00"
						}
					]
})
db.Course.insert({_id: 3, name: "Technology", hoursByWeek: 5, teacherId: 2,
					schedule: 	[
						{
							day: "Wednesday",
							fromHour: "16:00:00",
							toHour: "18:00:00"
						},
						{
							day: "Thursday",
							fromHour: "16:00:00",
							toHour: "18:00:00"
						},
						{
							day: "Friday",
							fromHour: "11:00:00",
							toHour: "12:00:00"
						}
					]
})
db.Course.insert({_id: 4, name: "German", hoursByWeek: 5, teacherId: 2,
					schedule: 	[
						{
							day: "Wednesday",
							fromHour: "09:00:00",
							toHour: "10:30:00"
						},
						{
							day: "Thursday",
							fromHour: "08:30:00",
							toHour: "10:00:00"
						},
						{
							day: "Tuesday",
							fromHour: "11:00:00",
							toHour: "13:00:00"
						}
					]
})
db.Course.insert({_id: 5, name: "Mathematic", hoursByWeek: 10, teacherId: 1,
					schedule: 	[
						{
							day: "Monday",
							fromHour: "15:00:00",
							toHour: "17:00:00"
						},
						{
							day: "Friday",
							fromHour: "12:00:00",
							toHour: "14:00:00"
						},
						{
							day: "Tuesday",
							fromHour: "13:00:00",
							toHour: "15:00:00"
						},
						{
							day: "Wednesday",
							fromHour: "12:00:00",
							toHour: "14:00:00"
						},
						{
							day: "Thursday",
							fromHour: "14:00:00",
							toHour: "16:00:00"
						}
					]
})			  
db.Student.insert({_id: 1, firstName: "Christabella", lastName: "Arkwright", birthDate: "2000-12-12"})
db.Student.insert({_id: 2, firstName: "Beth", lastName: "Norris", birthDate: "2000-01-01"})
db.Student.insert({_id: 3, firstName: "Kimberly", lastName: "Bass", birthDate: "2000-05-01"})
db.Student.insert({_id: 4, firstName: "Lily", lastName: "Nowell", birthDate: "1999-06-06"})
db.Student.insert({_id: 5, firstName: "Jared", lastName: "Moores", birthDate: "2001-03-06"})
db.Student.insert({_id: 6, firstName: "Marleen", lastName: "Gary", birthDate: "2000-05-09"})
db.Student.insert({_id: 7, firstName: "Judah", lastName: "Bagley", birthDate: "2001-09-08"})
db.Student.insert({_id: 8, firstName: "Nathaniel", lastName: "Gibb", birthDate: "2000-10-02"})
db.Student.insert({_id: 9, firstName: "Becky", lastName: "English", birthDate: "2001-12-07"})
db.Student.insert({_id: 10, firstName: "Cordelia", lastName: "Martell", birthDate: "2000-11-09"})
db.Student.insert({_id: 11, firstName: "Russ", lastName: "Lindsey", birthDate: "2001-05-08"})
db.Student.insert({_id: 12, firstName: "Cyrilla", lastName: "Reynell", birthDate: "2000-05-10"})
db.Student.insert({_id: 13, firstName: "Bryan", lastName: "Huff", birthDate: "2000-08-12"})
db.Student.insert({_id: 14, firstName: "Sid", lastName: "Brigham", birthDate: "2001-09-15"})
db.Student.insert({_id: 15, firstName: "Cash", lastName: "Rye", birthDate: "1999-04-16"})
db.Student.insert({_id: 16, firstName: "Kipling", lastName: "Saylor", birthDate: "2000-08-16"})
db.Student.insert({_id: 17, firstName: "Tacey", lastName: "Weaver", birthDate: "2001-07-10"})
db.Student.insert({_id: 18, firstName: "Colten", lastName: "Levitt", birthDate: "2001-09-18"})
db.Student.insert({_id: 19, firstName: "Maynerd", lastName: "Gardener", birthDate: "1999-09-19"})
db.Student.insert({_id: 20, firstName: "Yosef", lastName: "Haroldson", birthDate: "2001-09-17"})
db.Student.insert({_id: 21, firstName: "Ford", lastName: "Collingwood", birthDate: "2000-08-15"})
db.Student.insert({_id: 22, firstName: "Michelle", lastName: "Hargrave", birthDate: "2000-10-13"})
db.Student.insert({_id: 23, firstName: "Nichole", lastName: "Jekyll", birthDate: "1999-11-12"})
db.Student.insert({_id: 24, firstName: "Fitz", lastName: "Robertson", birthDate: "2001-11-14"})
db.Student.insert({_id: 25, firstName: "Cliff", lastName: "Purcell", birthDate: "2000-03-12"})
db.Student.insert({_id: 26, firstName: "Brianna", lastName: "Aylmer", birthDate: "2001-07-13"})
db.Student.insert({_id: 27, firstName: "Darin", lastName: "Watson", birthDate: "2001-05-15"})
db.Student.insert({_id: 28, firstName: "Piers", lastName: "Isaacson", birthDate: "2000-04-18"})
db.Student.insert({_id: 29, firstName: "Liza", lastName: "Ingram", birthDate: "2001-04-05"})
db.Student.insert({_id: 30, firstName: "Emelia", lastName: "Badcock", birthDate: "1999-03-05"})
db.Student.insert({_id: 31, firstName: "Rain", lastName: "Carlisle", birthDate: "2000-02-08"})
db.Student.insert({_id: 32, firstName: "Kodey", lastName: "Hart", birthDate: "2001-02-01"})
db.Student.insert({_id: 33, firstName: "Kinley", lastName: "Snider", birthDate: "1999-01-20"})
db.Student.insert({_id: 34, firstName: "Elisabeth", lastName: "Bray", birthDate: "2001-01-25"})
db.Student.insert({_id: 35, firstName: "Zachery", lastName: "Sides", birthDate: "1999-11-25"})
db.Student.insert({_id: 36, firstName: "Tybalt", lastName: "Walsh", birthDate: "2000-06-26"})
db.Student.insert({_id: 37, firstName: "Phyllis", lastName: "Harvey", birthDate: "2000-07-28"})
db.Student.insert({_id: 38, firstName: "Greyson", lastName: "Wray", birthDate: "2000-07-22"})
db.Student.insert({_id: 39, firstName: "Lexie", lastName: "Hameldon", birthDate: "2001-06-23"})
db.Student.insert({_id: 40, firstName: "Mollie", lastName: "Seward", birthDate: "2001-11-29"})
db.Student.insert({_id: 41, firstName: "Denis", lastName: "Thorpe", birthDate: "2000-12-31"})
db.Student.insert({_id: 42, firstName: "Jannette", lastName: "Belcher", birthDate: "2000-05-31"})
db.Student.insert({_id: 43, firstName: "Gall", lastName: "Holland", birthDate: "1999-05-20"})
db.Student.insert({_id: 44, firstName: "Pearlie", lastName: "Varnham", birthDate: "2000-06-20"})
db.Student.insert({_id: 45, firstName: "Michele", lastName: "Jenkins", birthDate: "2001-06-25"})
db.Student.insert({_id: 46, firstName: "Justine", lastName: "Welch", birthDate: "1999-07-14"})
db.Student.insert({_id: 47, firstName: "Rebecca", lastName: "Banister", birthDate: "2000-07-23"})
db.Student.insert({_id: 48, firstName: "Quincey", lastName: "Ward", birthDate: "2001-08-25"})
db.Student.insert({_id: 49, firstName: "Katrina", lastName: "Cole", birthDate: "2000-09-29"})
db.Student.insert({_id: 50, firstName: "Abisai", lastName: "North", birthDate: "1999-09-27"})
db.Student.insert({_id: 51, firstName: "Debby", lastName: "Quincy", birthDate: "1999-05-12"})
db.Teacher.insert({_id: 1, firstName: "Glinda", lastName: "Gapinski", birthDate: "1954-02-12"})
db.Teacher.insert({_id: 2, firstName: "Maureen", lastName: "Haskett", birthDate: "1972-12-23"})
db.Teacher.insert({_id: 3, firstName: "Satchel", lastName: "Forrest", birthDate: "1960-07-08"})
db.Note.insert({ studentId: 1, curseId: 1, year: 2014, note1: 7, note2: 8, note3: 10, finalNote: 8})
db.Note.insert({ studentId: 3, curseId: 1, year: 2014, note1: 6, note2: 7, note3: 5, finalNote: 6})
db.Note.insert({ studentId: 5, curseId: 1, year: 2014, note1: 7, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 8, curseId: 1, year: 2014, note1: 10, note2: 9, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 9, curseId: 1, year: 2014, note1: 9, note2: 8, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 13, curseId: 1, year: 2014, note1: 7, note2: 5, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 16, curseId: 1, year: 2014, note1: 6, note2: 10, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 17, curseId: 1, year: 2014, note1: 6, note2: 5, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 22, curseId: 1, year: 2014, note1: 3, note2: 7, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 27, curseId: 1, year: 2014, note1: 6, note2: 9, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 28, curseId: 1, year: 2014, note1: 6, note2: 9, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 30, curseId: 1, year: 2014, note1: 7, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 34, curseId: 1, year: 2014, note1: 6, note2: 9, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 36, curseId: 1, year: 2014, note1: 8, note2: 7, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 37, curseId: 1, year: 2014, note1: 9, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 39, curseId: 1, year: 2014, note1: 9, note2: 5, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 44, curseId: 1, year: 2014, note1: 9, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 47, curseId: 1, year: 2014, note1: 8, note2: 6, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 49, curseId: 1, year: 2014, note1: 6, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 51, curseId: 1, year: 2014, note1: 9, note2: 10, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 52, curseId: 1, year: 2014, note1: 6, note2: 7, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 1, curseId: 2, year: 2014, note1: 2, note2: 5, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 3, curseId: 2, year: 2014, note1: 1, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 7, curseId: 2, year: 2014, note1: 8, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 9, curseId: 2, year: 2014, note1: 8, note2: 6, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 11, curseId: 2, year: 2014, note1: 6, note2: 9, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 13, curseId: 2, year: 2014, note1: 9, note2: 6, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 17, curseId: 2, year: 2014, note1: 5, note2: 9, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 18, curseId: 2, year: 2014, note1: 10, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 19, curseId: 2, year: 2014, note1: 9, note2: 7, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 23, curseId: 2, year: 2014, note1: 5, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 25, curseId: 2, year: 2014, note1: 10, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 26, curseId: 2, year: 2014, note1: 2, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 27, curseId: 2, year: 2014, note1: 8, note2: 5, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 31, curseId: 2, year: 2014, note1: 9, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 35, curseId: 2, year: 2014, note1: 5, note2: 9, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 36, curseId: 2, year: 2014, note1: 9, note2: 8, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 38, curseId: 2, year: 2014, note1: 8, note2: 7, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 39, curseId: 2, year: 2014, note1: 8, note2: 8, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 42, curseId: 2, year: 2014, note1: 3, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 43, curseId: 2, year: 2014, note1: 4, note2: 8, note3: 10, finalNote: 9})
db.Note.insert({ studentId: 45, curseId: 2, year: 2014, note1: 4, note2: 6, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 48, curseId: 2, year: 2014, note1: 9, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 2, curseId: 3, year: 2014, note1: 8, note2: 7, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 4, curseId: 3, year: 2014, note1: 7, note2: 6, note3: 5, finalNote: 6})
db.Note.insert({ studentId: 6, curseId: 3, year: 2014, note1: 6, note2: 9, note3: 10, finalNote: 9})
db.Note.insert({ studentId: 8, curseId: 3, year: 2014, note1: 6, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 10, curseId: 3, year: 2014, note1: 3, note2: 5, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 11, curseId: 3, year: 2014, note1: 5, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 12, curseId: 3, year: 2014, note1: 4, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 14, curseId: 3, year: 2014, note1: 5, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 15, curseId: 3, year: 2014, note1: 9, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 19, curseId: 3, year: 2014, note1: 6, note2: 9, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 20, curseId: 3, year: 2014, note1: 5, note2: 6, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 21, curseId: 3, year: 2014, note1: 8, note2: 7, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 22, curseId: 3, year: 2014, note1: 6, note2: 6, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 23, curseId: 3, year: 2014, note1: 6, note2: 9, note3: 10, finalNote: 9})
db.Note.insert({ studentId: 30, curseId: 3, year: 2014, note1: 7, note2: 4, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 37, curseId: 3, year: 2014, note1: 8, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 38, curseId: 3, year: 2014, note1: 10, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 42, curseId: 3, year: 2014, note1: 10, note2: 9, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 46, curseId: 3, year: 2014, note1: 9, note2: 10, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 48, curseId: 3, year: 2014, note1: 7, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 4, curseId: 4, year: 2014, note1: 5, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 5, curseId: 4, year: 2014, note1: 5, note2: 7, note3: 5, finalNote: 6})
db.Note.insert({ studentId: 7, curseId: 4, year: 2014, note1: 9, note2: 5, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 10, curseId: 4, year: 2014, note1: 10, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 15, curseId: 4, year: 2014, note1: 8, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 18, curseId: 4, year: 2014, note1: 9, note2: 8, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 24, curseId: 4, year: 2014, note1: 7, note2: 7, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 25, curseId: 4, year: 2014, note1: 4, note2: 6, note3: 5, finalNote: 6})
db.Note.insert({ studentId: 26, curseId: 4, year: 2014, note1: 6, note2: 5, note3: 10, finalNote: 9})
db.Note.insert({ studentId: 29, curseId: 4, year: 2014, note1: 9, note2: 8, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 31, curseId: 4, year: 2014, note1: 8, note2: 8, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 32, curseId: 4, year: 2014, note1: 9, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 34, curseId: 4, year: 2014, note1: 5, note2: 5, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 35, curseId: 4, year: 2014, note1: 7, note2: 6, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 40, curseId: 4, year: 2014, note1: 5, note2: 8, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 41, curseId: 4, year: 2014, note1: 7, note2: 8, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 44, curseId: 4, year: 2014, note1: 6, note2: 9, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 46, curseId: 4, year: 2014, note1: 6, note2: 7, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 49, curseId: 4, year: 2014, note1: 6, note2: 7, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 50, curseId: 4, year: 2014, note1: 9, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 52, curseId: 4, year: 2014, note1: 5, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 2, curseId: 5, year: 2014, note1: 9, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 6, curseId: 5, year: 2014, note1: 4, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 12, curseId: 5, year: 2014, note1: 8, note2: 7, note3: 5, finalNote: 6})
db.Note.insert({ studentId: 14, curseId: 5, year: 2014, note1: 6, note2: 7, note3: 5, finalNote: 6})
db.Note.insert({ studentId: 16, curseId: 5, year: 2014, note1: 3, note2: 8, note3: 10, finalNote: 9})
db.Note.insert({ studentId: 20, curseId: 5, year: 2014, note1: 6, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 21, curseId: 5, year: 2014, note1: 4, note2: 6, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 24, curseId: 5, year: 2014, note1: 9, note2: 6, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 28, curseId: 5, year: 2014, note1: 4, note2: 6, note3: 8, finalNote: 9})
db.Note.insert({ studentId: 29, curseId: 5, year: 2014, note1: 5, note2: 7, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 32, curseId: 5, year: 2014, note1: 8, note2: 5, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 33, curseId: 5, year: 2014, note1: 6, note2: 8, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 40, curseId: 5, year: 2014, note1: 9, note2: 6, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 41, curseId: 5, year: 2014, note1: 6, note2: 10, note3: 6, finalNote: 6})
db.Note.insert({ studentId: 43, curseId: 5, year: 2014, note1: 8, note2: 8, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 45, curseId: 5, year: 2014, note1: 9, note2: 7, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 47, curseId: 5, year: 2014, note1: 6, note2: 8, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 50, curseId: 5, year: 2014, note1: 9, note2: 7, note3: 9, finalNote: 9})
db.Note.insert({ studentId: 51, curseId: 5, year: 2014, note1: 5, note2: 9, note3: 7, finalNote: 8})
db.Note.insert({ studentId: 52, curseId: 5, year: 2014, note1: 10, note2: 5, note3: 9, finalNote: 9})
