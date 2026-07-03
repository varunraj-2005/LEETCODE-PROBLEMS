select t.student_id,t.student_name, t.subject_name, count(e.student_id) attended_exams from
examinations e right join (select*from students s join subjects su) t on e.student_id=t.student_id
and e.subject_name = t.subject_name
group by e.student_id,student_name,t.subject_name
order by t.student_id,t.subject_name
