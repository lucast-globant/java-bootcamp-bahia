
--Key 4
Select co_name, te_lastname, te_name, st_lastname,st_name 
From courses, teachers, students, students_curses 
where ((st_id = stc_student) and (stc_course = co_id)) and (co_id = 1) 
order by st_lastname

--Key 5
Select co_name, st_name, st_lastname, stc_fnote 
From students_curses, students, courses 
Where (st_id = 5) and (st_id = stc_student) 
Order by co_name, stc_fnote DESC